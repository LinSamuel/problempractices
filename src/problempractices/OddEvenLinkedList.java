package problempractices;

public class OddEvenLinkedList {
	
	public ListNode oddEvenList(ListNode head) {
        if(head == null){
            return null;
        }
        /*
        //initialize
        ListNode odd = head;
        ListNode oddTail = odd;
        ListNode even = head.next;
        ListNode evenTail = even;
        ListNode curr = head;
        
        int counter = 1;
        while(curr.next != null && curr.next.next != null){
            if(counter % 2 != 0){ //odd
                oddTail.next = curr.next;
                oddTail = oddTail.next;
            } else {
                evenTail.next = curr.next;
                evenTail = evenTail.next;
            }
            curr = curr.next;
        }
        oddTail.next = even;
        return odd;*/
        
        ListNode curr = head; //current represents start of sorting
        //ListNode currTail = curr;
        ListNode startingPoint = curr;
        while(startingPoint != null){
            while(curr.next.next != null){
                /*ListNode startSwitch = curr;
                if(startSwitch.next != null && startSwitch.next.next != null){ //swap linkedlist nodes
                    
                }*/
                curr = startingPoint;
                if(curr.next != null && curr.next.next != null){
                    ListNode temp = curr.next;
                    ListNode tempNext = curr.next.next.next;
                    curr.next = curr.next.next;
                    curr.next.next = temp;
                    curr.next.next.next = tempNext; // the elements past the swap stays the same
                }
    
                curr = curr.next.next;
            }
            startingPoint = startingPoint.next;
        }

        return head;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
