package slidingwindow_twopointerr;
import java.util.*;
import java.util.HashMap;
//Using hash Map 

public class FruitsInsideBasket {
	static int fruit(int[] nums,int k) {
		int l=0;
		int r=0;
		int len=0;
		int maxlen=0;
				
		Map<Integer,Integer> map=new HashMap<>();
		for(r=0;r<nums.length;r++) {
			int currenFruit=nums[r];
			map.put(currenFruit,map.getOrDefault(currenFruit,0)+1);
			
		
		// If the window has more than 2 types of fruits, shrink from the left
		while(map.size()>k) {
			int leftFruit=nums[l];
			map.put(leftFruit,map.get(leftFruit)-1);
			if(map.get(leftFruit)==0) {
				map.remove(leftFruit);
			}
			l++;
			
		}
		// Update the maximum window size
		len=r-l+1;
		maxlen=Math.max(maxlen, len);
		}
		
		return maxlen;
	}

	public static void main(String[] args) {
		int[] nums= {3,3,3,1,2,1,1,2,3,3,4};
		System.out.println(fruit(nums,2));

	}

}
