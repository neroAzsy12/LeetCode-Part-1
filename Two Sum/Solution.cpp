#include <iostream>
#include <unordered_map>
#include <vector>
using namespace std;

class Solution {
    public:
        vector<int> twoSum(vector<int>& nums, int target) {
            unordered_map<int, int> compliment;
            vector<int> results;

            for(int i = 0; i < nums.size(); i++) {
                int tmp = target - nums[i];
                
                if (compliment.find(tmp) != compliment.end()) {
                    results.push_back(i);
                    results.push_back(compliment[tmp]);
                    return results;
                }
                compliment[nums[i]] = i;
            }
            return results;
        }
};