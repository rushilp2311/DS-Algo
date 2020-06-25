public class RemoveDuplicatesLinkedList {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){this.val = val;}
        ListNode(int val, ListNode next){this.val = val; this.next = next;}

    }

    public static ListNode removeDuplicatesLinkedList(ListNode head){
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode curr = head;
        while(curr.next != null && curr.next.next != null){
            if(curr.val == curr.next.val){
                curr.next = curr.next.next;
            }
            else{
                curr = curr.next;
            }
        }
        if(curr.val == curr.next.val) curr.next = null;
        return head;
    }

}
