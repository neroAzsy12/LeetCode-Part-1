class Solution {
	// n = 1, return 1
	// n = 2, return 2, [(1 + 1), (2)]
	// n = 3, [(1 + 1 + 1), (2 + 1), (1 + 2) return 3
	// n = 4, [(1 + 1 + 1 + 1), (2 + 2), (1 + 2 + 1), (2 + 1 + 1), (1 + 1 + 2)], return 5
	// n = 5, [(1 + 1 + 1 + 1 + 1), (2 + 1 + 1 + 1), (1 + 2 + 1 + 1), (1 + 1 + 2 + 1), (1 + 1 + 1 + 2), (2 + 2 + 1), (1 + 2 + 2), (2 + 1 + 2)] return 8
    
	// using fibonacci approach, the nth term of climbing n steps, is very similar to the fibonacci sequence
	public int climbStairs(int n) {
		if (n <= 3) {
			return n;
		}

		int fib_1 = 1;
		int fib_2 = 1;
		int sum = 0;

		for (int i = 2; i <= n; i++) {
			sum = fib_1 + fib_2;
			fib_1 = fib_2;
			fib_2 = sum;
		}
		return sum;
	}
}