public class RepeatStringCount 
{
	//Input  - aaaaaaabcccccccccccccc
	//Output - a7b1c14
	//Author - https://github.com/MythiliPrabaharan
	public static void repeatStringcount(String input)
	{
		int n = input.length();
		for (int i = 0; i < n; i++) 
		{
			int count = 1;
			while (i < n - 1 && input.charAt(i) == input.charAt(i + 1)) 
			{
				++count;
				++i;
			}
			System.out.print(input.charAt(i));
			System.out.print(count);
		}
	}

	public static void main(String[] args)
	{
		String input = "aaaaaaabcccccccccccccc";
		repeatStringcount(input);
	}
}
