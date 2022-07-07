
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
        System.out.println("嘻嘻");
        System.out.println("第一次提交");
        System.out.println("master test");
        System.out.println("我这次修改了git");
        System.out.println("在github修改");
        System.out.println("我在idea修改了代码");
    }
}
