
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }
}
class Solution {
    public static ListNode reverseList(ListNode head) {
                ListNode prev = null;
                ListNode cur = head;
                ListNode temp = null;
                while (cur != null) {
                    temp = cur.next;// 保存下一个节点
                    cur.next = prev;
                    prev = cur;
                    cur = temp;
                }
                return prev;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode();
        listNode.val = 1;
        listNode.next = new ListNode(2);
        ListNode listNode1 = reverseList(listNode);
        while(listNode!=null){
            System.out.println(listNode.val);
        }

    }
}