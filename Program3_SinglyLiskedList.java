public class Program3_SinglyLiskedList 
{
	//https://github.com/MythiliPrabaharan
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
	public static Node head = null;
	public static Node tail = null;

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
	public void append(int data)
	{
		Node newNode = new Node(data);
		Node current = head;
		if(head == null)
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			while(current.next!=null)
				current=current.next;
			current.next=newNode;
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
			System.out.println("The list is empty.");
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
			System.out.println();
		}
	}
	public void reverseList() 
	{ 
		Node temp = head; 
		Node previous = null, current = null; 
		while (temp != null) 
		{ 
			current = temp; 
			temp = temp.next;
			current.next = previous; 
			previous = current; 
			head = current; 
		}
		System.out.println();
	}
	
	public void reverseListRecursion(Node head) 
	{
		
		if(head == null) 
		{  
			System.out.println("List is empty");  
			return;  
		}  
		else 
		{  
			if(head.next == null) 
			{  
				System.out.print(head.data);  
				return;  
			} 		
			reverseListRecursion(head.next);  
			System.out.print("-->");
			System.out.print(head.data);  
		}  
	}
	public void addList()
	{
		int sum = 0;
		Node current = head;
		while(current!=null)
		{
			sum+=current.data;
			current = current.next;
		}
		System.out.println(sum);
	}
	public static void main(String[] args)
	{
		Program3_SinglyLiskedList list = new Program3_SinglyLiskedList();

		list.prepend(44); 
		list.prepend(22);
		list.prepend(11);
		list.insert(2, 33);
		list.remove(44);
		list.removePosition(2);
		list.append(55);
		list.display();
		list.reverseListRecursion(head);
		list.reverseList();
		list.display();
		list.addList();
	}
}
