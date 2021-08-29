public class RepeatString 
{
	//Input  -  a1b10c3
	//Output -  abbbbbbbbbbccc 
	
	public static String repeatString(String input)
	{
		String num = input.replaceAll("[^\\d]", " ").trim().replaceAll(" +", ",");
		String alpha = input.replaceAll("[\\d]", " ").trim().replaceAll(" +", ",");
		int i=0,m=0;
		int[] numbers = new int[num.split(",").length];
		String[] alphabets = alpha.split(",");
		String output = "";
		for(String n : num.split(","))
		{
			numbers[m++] = Integer.parseInt(n);
		}
		while(i<numbers.length)
		{
			for(int k=1; k<=numbers[i]; ++k)
			{
				output+= alphabets[i];
			}
			++i;
		}
		return output;
	}

	public static void main(String[] args)
	{
		String input = "a1b10c3";
		System.out.println(repeatString(input));
				
		
	}

}
