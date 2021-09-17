object Solution {
    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
        val compliments = scala.collection.mutable.HashMap[Int, Int]()  // declare a HashMap
        val result = new Array[Int](2)                                  // declare an array of size 2

        for (index <- 0 until nums.length) {                            // iterate through nums
            if (compliments.contains(target - nums(index))) {           // if compliments contains the key (difference of target - nums[index])
                result(0) = index
                result(1) = compliments(target - nums(index))
                result                                                  // return result containing the indices
            }
            compliments(nums(index)) = index                            // map the key num[index] to value index
        }
        result
    }
}