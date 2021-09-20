#include <iostream>
using namespace std;

struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

class Solution {
    public:
        ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
            ListNode *head = new ListNode(-1);
            ListNode *tmp = head;

            int carry = 0; 
            while (l1 || l2 || carry != 0) {
                int sum = carry;
                sum = l1 ? sum + l1->val : sum;
                sum = l2 ? sum + l2->val : sum;

                if (sum >= 10) {
                    sum -= 10;
                    carry = 1;
                } else {
                    carry = 0;
                }

                tmp->next = new ListNode(sum);
                tmp = tmp->next;

                l1 = l1 ? l1->next : nullptr;
                l2 = l2 ? l2->next : nullptr;
            }
            return head->next;
        }
};