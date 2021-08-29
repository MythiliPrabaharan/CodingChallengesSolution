public class SinglyLinkedList 
{
	//Author - https://github.com/MythiliPrabaharan
	class Node
	{
		int data;
		Node next;

		public Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	public Node head = null;
	public Node tail = null;

	public void prepend(int data)
	{
		Node newNode = new Node(data);

		if(head == null)
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			Node temp = head;
			head = newNode;
			head.next = temp;
		}
	}

	public void insert(int position, int data)
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode;
			tail = newNode;
		}
		else if(position == 0)
		{
			Node temp = head;
			head = newNode;
			head.next = temp;
		}
		else
		{
			int length = this.listLength();
			if(position < length)
			{
				Node current = head;
				for(int i=0; i<position-1; i++)
					current = current.next;

				newNode.next = current.next;
				current.next = newNode;
			}
			else
			{
				System.out.println("The list contains only "+length+" elements.");
				return;
			}
		}
	}

	public void remove(int data)
	{
		Node current = head;
		if(head.data == data)
		{
			head = head.next;
		}
		else
		{
			while(current.next!=null)
			{
				if(current.next.data == data)
					current.next = current.next.next;
				else
					current = current.next;
			}
		}
	}

	public void removePosition(int position)
	{
		int length = this.listLength();
		Node current = head;
		if(position < length)
		{
			if(position == 0)
			{
				head = head.next;				
			}
			else
			{
				for(int i=0;i<position-1;++i)
					current = current.next;
				current.next = current.next.next;
			}

		}
		else
		{
			System.out.println("The list contains only "+length+" elements.");
			return;
		}
	}
	public int listLength()
	{
		int i = 0;
		Node current = head;
		while(current != null)
		{
			++i;
			current = current.next;
		}
		return i;
	}

	public void display()
	{
		Node current = head;
		if(head == null)
		{
			System.out.println("The list is empty");
		}
		else
		{
			while(current != null)
			{
				if(current.next == null)
					System.out.print(current.data);
				else
					System.out.print(current.data + "-->");
				current = current.next;
			}
		}
	}



	public static void main(String[] args)
	{
		SinglyLinkedList list = new SinglyLinkedList();

		list.prepend(44); 
		list.prepend(22);
		list.prepend(11);
		list.insert(2, 33);
		list.remove(44);
		list.removePosition(2);
		list.display();
	}
}
