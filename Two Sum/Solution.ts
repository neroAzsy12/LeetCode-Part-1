function twoSum(nums: number[], target: number): number[] {
    const compliment: Map<number, number> = new Map();

    for (let i = 0; i < nums.length; i++) {
        if (compliment.has(target - nums[i])) {
            return [i, compliment.get(target - nums[i])];
        }
        compliment.set(nums[i], i);
    }
    
    return [];
};
