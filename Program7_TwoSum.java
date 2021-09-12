import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Program7_TwoSum 
{
	//https://github.com/MythiliPrabaharan
	public static int[] twoSum(int[] nums, int target) 
	{
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0; i<nums.length; ++i)
		{
			if(!map.containsKey(nums[i]))
			{
				map.put(target-nums[i],i);
			}
			else if(map.containsKey(nums[i]))
			{
				int[] arr = new int[2];
				arr[0] = map.get(nums[i]);
				arr[1] = i;
				return arr; 
			}

		}
		return null;
	}


	public static void main(String[] args) 
	{
		int[] nums = {2,7,11,15};
		int target = 9;
		
		System.out.println(Arrays.toString(twoSum(nums, target)));
	}
}
