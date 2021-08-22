import java.util.Stack;

public class Program2_BalancedBrackets 
{
	public static void main(String[] args)
	{
		String str = "{[]}";
		//String str = "{]}";
		System.out.println(areBracketsBalanced(str) ? "Balanced" : "Not Balanced");
	}
	public static boolean areBracketsBalanced(String str)
	{
		System.out.println(str);

		Stack<Character> st = new Stack<Character>();
		char[] c = str.toCharArray();
		if(c.length % 2 == 0)
		{
			for(int i=0; i<c.length; ++i)
			{
				if(c[i] == '{' || c[i] == '[' || c[i] == '(')
				{
					//Element into the stack
					st.push(c[i]);
					continue;
				}
				
				if(st.isEmpty())
					return false;
				
				if(c[i] == '}'  )
				{
					if(st.peek() == '{')
					{
						st.pop();
					}
				}
				if(c[i] == ']')
				{
					if(st.peek() == '[')
					{
						st.pop();
					}
				}
				if(c[i] == ')' )
				{
					if(st.peek() == '(')
					{
						st.pop();
					}
				}
			}
		}
		else
		{
			return false;
		}
		return (st.isEmpty());
	}
}
