class Solution {
    public void sortColors(int[] nums) {
        int red = 0;
	    int blue = 0;
		int white = 0;
		
		for(int val : nums) {
			if(val == 0) {
				red++;
			}else if(val == 1) {
				white++;
			}else {
				blue++;
			}
		}
	
		for(int i = 0; i < nums.length; i++) {
			if(red > 0) {
				nums[i] = 0;
				red--;
			}else if(white > 0) {
				nums[i] = 1;
				white--;
			}else if(blue > 0) {
				nums[i] = 2;
				blue--;
			}
		} 
    }
}