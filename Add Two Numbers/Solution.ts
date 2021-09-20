class ListNode {
    val: number;
    next: ListNode | null;

    constructor(val?: number, next?: ListNode | null) {
        this.val = (val === undefined ? 0 : val);
        this.next = (next === undefined ? null : next);
    }
}

function addTwoNumbers (l1: ListNode | null, l2: ListNode | null): ListNode | null {
    let carry = 0;
    let head = new ListNode(-1);
    let tmp = head;

    while (l1 != null || l2 != null || carry !== 0) {
        let sum = carry;
        sum = l1 != null ? sum + l1.val : sum;
        sum = l2 != null ? sum + l2.val : sum;

        if (sum >= 10) {
            sum -= 10;
            carry = 1;
        } else {
            carry = 0;
        }

        tmp.next = new ListNode(sum, null);
        tmp = tmp.next;

        l1 = l1 != null ? l1.next : null;
        l2 = l2 != null ? l2.next : null;
    }

    return head.next;
}