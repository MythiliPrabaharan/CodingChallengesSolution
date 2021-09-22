public class Program8_RecursionPower 
{
	//https://github.com/MythiliPrabaharan
	public static int recursionPower(int number, int power)
	{
		if(power==0)
			return 1;
		return number * recursionPower(number,power-1);
	}
	public static void main(String[] args) 
	{
		System.out.println(recursionPower(2, 3));
	}
}