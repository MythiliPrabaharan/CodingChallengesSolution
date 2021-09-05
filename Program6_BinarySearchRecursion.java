import java.util.Arrays;

public class BinarySearchRecursion 
{
	//https://github.com/MythiliPrabaharan
	public static int i = 0;
	public static void main(String[] args)
	{
		int[] array = {5, 7, 55, 99, 34};
		Arrays.sort(array);
		//System.out.println(Arrays.toString(array));
		int length = array.length;
		int search = 55;
		int left = 0;
		int right = length - 1;
		System.out.println(binarySearchRecursion(array,left,right,search)==-1 ? "Number not found" : "The position of the search element is "+binarySearchRecursion(array,left,right,search));

	}
	public static int binarySearchRecursion(int[] array, int left, int right, int search)
	{
		if(right>=left)
		{
			int middle = (left+right)/2;
			if(array[middle] == search)
				return middle;
			if(search > array[middle])
				return binarySearchRecursion(array,middle+1,right,search);
			if(search < array[middle])
				return binarySearchRecursion(array,left,middle-1,search);
		}
		return -1;
	}

}
