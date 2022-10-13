package week3.day2;

import java.util.LinkedHashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums= {2,6,11,7,15};
		int target=8;
		Map<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
		for (int i = 0; i < nums.length; i++) {
		int	n=target-nums[i];
		//Subtract the number from target and check the diff number exist using Map!
		
		}
		System.out.println(map);
	}

}
