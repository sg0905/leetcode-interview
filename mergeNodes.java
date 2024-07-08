
        class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    

    public class mergeNodes{
        public static ListNode mergeNodes(ListNode head) {
            if(head.val == 0){
                head = head.next;
            }
            ListNode res = head;
            ListNode temp = head;
            int sum = 0;
            while(temp != null) {
                if(temp.val != 0) {
                    sum += temp.val;
                    temp = temp.next;
                }
                else {
                    res.val = sum;
                    res.next = temp.next;
                    temp = res.next;
                    res = res.next;
                    sum = 0;
                }
            }
            return head;
    }
    static void printList(ListNode head)
    {
        while (head.next != null) {
            System.out.print(head.val + "-> ");
            head = head.next;
        }
        System.out.println(head.val);
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        ListNode head = new ListNode(3);
                head.next = new ListNode(2);
                head.next.next = new ListNode(0);
                head.next.next.next = new ListNode(4);
                head.next.next.next.next = new ListNode(5);
                head.next.next.next.next.next = new ListNode(0);
                head.next.next.next.next.next.next = new ListNode(6);
                head.next.next.next.next.next.next.next = new ListNode(7);
        printList(mergeNodes(head));
         
    }
}
