public class Program1_ReverseCharacterArray 
{
	//https://github.com/MythiliPrabaharan
	public static void reverseChar(char[] s)
	{
		char tmp = '0'; 
		for(int i = 0; i < s.length / 2; i++)
		{ 
			tmp = s[i]; 
			s[i] =s[s.length - 1 - i]; 
			s[s.length - 1 - i] = tmp;
		}
		System.out.println(s);
	}

	public static void main(String[] args)
	{
		char[] s = {'h','e','l','l','o'};
		reverseChar(s);
	}
}
