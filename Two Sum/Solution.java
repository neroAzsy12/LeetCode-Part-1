package Java;
import java.util.*;
public class TwoSum{
    /* 
    * since this approach uses HashMap, the operations containsKey(), get(), and put() are O(1) which is constant time
    * there is only one for loop, it runs in O(n), where n is the num of elements in nums
    * total time complexity of this method is O(n)
    */
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> compliment = new HashMap<>();         // store the mapping of (nums[i], ith position)
        for(int i = 0; i < nums.length; i++) {
            if(compliment.containsKey(target - nums[i])) {              // if compliment contains the difference of target - nums[i]
                return new int[] {compliment.get(target - nums[i]), i}; // return the ith position of (target-nums[i]) as well as i
            }
            compliment.put(nums[i], i);                                 // else add <nums[i], ith position> to the map
        }
        
        throw new IllegalArgumentException("no Two Sum Solution");
    }
}