class ListNode:
    def __init__(self, val = 0, next = None):
        self.val = val
        self.next = next

class Solution:
    def addTwoNumbers(self, l1, l2):
        head = ListNode(-1)
        tmp = head

        carry_val = 0

        while l1 or l2 or carry_val:
            sum = carry_val
            sum = sum + l1.val if l1 else sum
            sum = sum + l2.val if l2 else sum

            if sum >= 10:
                sum -= 10
                carry_val = 1
            else:
                carry_val = 0
            
            tmp.next = ListNode(sum)
            tmp = tmp.next

            l1 = l1.next if l1 else None
            l2 = l2.next if l2 else None
        
        return head.next