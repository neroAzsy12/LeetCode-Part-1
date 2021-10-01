import java.util.*;
class TwoSum {
    private HashMap<Integer, Integer> nums_count;   // Contains the pairing of <number, num of occurence>
    private int min, max;                           // min and max nums that have been added to nums
    private boolean min_max_set;                    // boolean flag, to intialize min and max accordingly
    public TwoSum() {
        this.nums_count = new HashMap<>();
        this.min_max_set = false;           // set to false, since no vals have been assigned to min and max
    }
    
    public void add(int number) {
        if (min_max_set) {
            min = min > number ? number : min;  // reassign min, if number is less than min
            max = max < number ? number : max;  // reassign max, if number is greater than max
        } else {
            min = number;       // initialize both min and max to number, since it is the first num to be added to nums
            max = number;
            min_max_set = true; // set the flag to true, since both min and max will have a value assigned to them 
        }

        // add number to nums_count 
        this.nums_count.put(number, this.nums_count.getOrDefault(number, 0) + 1);
    }
    
    public boolean find(int value) {
        // if value is less than (min * 2) or greater than (max * 2), return false
        if (value < this.min * 2 || value > this.max * 2) {
            return false;
        }

        for (Integer num : this.nums_count.keySet()) {
            if (this.nums_count.containsKey(value - num)) {
                int count = this.nums_count.get(value - num);
                
                if (num == value - num) {
                    if (count > 1) {
                        return true; // return true, since the same number appears twice, and adds up to the value
                    } else {
                        continue;
                    }
                }
                return true; // return true, since two different numbers add up to the value
            }
        }
        return false;   // return false, since no two numbers add up to value
    }
}