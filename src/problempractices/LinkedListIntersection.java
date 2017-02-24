package problempractices;

public class LinkedListIntersection {
	
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        int lengthA = 0;
        int lengthB = 0;
        
        while(nodeA != null){
            lengthA++;
            nodeA = nodeA.next;
        }
        
        while(nodeB != null){
            lengthB++;
            nodeB = nodeB.next;
        }
        
        if(nodeA != nodeB){
            return null;
        }
        
        ListNode shortList = lengthA < lengthB ? headA : headB;
        ListNode longList = lengthA < lengthB ? headB : headA;
        
        int difference = Math.abs(lengthA - lengthB);
        //int longListTravel = lengthA < lengthB ? lengthB : lengthA;
        
        int counter = difference;
        while(longList != null && counter > 0){
            counter--;
            longList = longList.next;
        }
        while(shortList != longList){
            shortList = shortList.next;
            longList = longList.next;
        }
        
        return shortList;
        
    }
    
    public static void printLinkedList(ListNode head){
    	System.out.println("==== Printing linked list ====");
    	if(head == null){
    		return;
    	}
    	while(head!= null){
    		System.out.println(head.val);
    		head = head.next;
    	}
    	
    }
    
    public static ListNode removeElements(ListNode head, int val) {
    	if(head == null){
    		return null;
    	}
        ListNode current = head;
        
        //front has the values, remove all of the ones in the front that has the same values
        System.out.println("val is "+ val);
        
        while(current.val == val && current.next != null){
        	System.out.println("current val is " + current.val);
        	current = current.next;
        	if(current == null){
        		return null;
        	}
        }
        
        ListNode newHead = current;
        
        while(current.next != null){
        	if(current.next.val == val){
        		current.next = current.next.next;
        	} else {
        		current = current.next;
        	}
        }

//        while(current.next != null){
//        	System.out.println("current val is " + current.val);
//        	while(current.next.val == val){
//        		System.out.println("deleting!");
//        		current.next = current.next.next;
//        		if(current.next == null){
//        			break;
//        		}
//        	}
//        	current = current.next;
//        	//if deleted the last element
//        	if(current == null){
//        		break;
//        	}
//        }
//        
        return newHead;
    }
    
    public static boolean isPalindrome(ListNode head){
    	ListNode first = head;
    	ListNode second = head; //fast pointer
    	
    	while(second != null && second.next != null){
    		first = first.next;
    		second = second.next.next;
    	}
    	
    	if(second != null){ //odd length
    		first = first.next;
    	}
    	
    	//Reverse the second half
    	ListNode curr = first;
    	ListNode nextNode = null;
    	ListNode prevNode = null;
    	
    	while(curr != null){
    		nextNode = curr.next;
    		curr.next = prevNode;
    		prevNode = curr;
    		curr = nextNode;
    	}
    	first = prevNode; //set first at the front of the reversed second half
    	second = head;
    	
    	while(first != null && second != null){
    		if(first.val != second.val){
    			return false;
    		}
    		first = first.next;
    		second = second.next;
    	}
    	
    	return true;	
    }
    
    public static ListNode detectCycle(ListNode head){
    	if(head == null){
    		return null;
    	}
    	
    	ListNode first = head; //slow
    	ListNode second = head; //fast
    	boolean hasCycle = false;
    	
    	while(second != null && second.next != null){
    		first = first.next;
    		second = second.next.next;
    		if(first == second){
    			hasCycle = true;
    			break;
    		}
    	}
    	
    	if(!hasCycle){
    		return null;
    	}
    	
    	first = head;
    	while(first != second){
    		first = first.next;
    		second = second.next;
    	}
    	
    	return second;
    }
    
    public static ListNode reverseBetween(ListNode head, int m, int n) {
    	
    	if(m == 1){ //switch starts from beginning
            ListNode curr = head;
//            
//            int counter = 1;
//            while(counter < m - 1){
//            	counter++;
//            	curr = curr.next;
//            }
            
            ListNode currNode = curr;
            ListNode prevNode = null;
            ListNode nextNode = null;
            
            int distance = n-m;
            ListNode newTail = curr.next;

            
            int counter2 = 0;
            while(counter2 < distance + 1){
            	nextNode = currNode.next;
            	currNode.next = prevNode;
            	prevNode = currNode;
            	currNode = nextNode;
            	counter2++;
            }
            curr.next = nextNode;
       	
        	return prevNode;
    	}
        ListNode curr = head;
        
        int counter = 1;
        while(counter < m - 1){
        	counter++;
        	curr = curr.next;
        }
        
        ListNode currNode = curr.next;
        ListNode prevNode = null;
        ListNode nextNode = null;
        
        int distance = n-m;
        ListNode newTail = curr.next;

        
        int counter2 = 0;
        while(counter2 < distance + 1){
        	nextNode = currNode.next;
        	currNode.next = prevNode;
        	prevNode = currNode;
        	currNode = nextNode;
        	counter2++;
        }
        
        curr.next = prevNode;
        newTail.next = nextNode;
    	
    	return head;
    }
    
    

	public static void main(String[] args) {
		System.out.println("in main\n");
//		ListNode node1 = new ListNode(1);
//		ListNode node2 = new ListNode(2);
//		ListNode node3 = new ListNode(6);
//		ListNode node4 = new ListNode(3);
//		ListNode node5 = new ListNode(4);
//		ListNode node6 = new ListNode(5);
//		ListNode node7 = new ListNode(6);
//		
//		node1.next = node2;
//		//printLinkedList(node1);
//		node2.next = node3;
//		node3.next = node4;
//		node4.next = node5;
//		node5.next = node6;
//		node6.next = node7;
		
//		ListNode node1 = new ListNode(1);
//		ListNode node2 = new ListNode(2);
//		ListNode node3 = new ListNode(3);
//		ListNode node4 = new ListNode(1);
//		//ListNode node5 = new ListNode(1);
//		
//		
//		node1.next = node2;
//		node2.next = node3;
//		node3.next = node4;
//		node4.next = node2;
//		
////		System.out.println(isPalindrome(node1));
////		
////		ListNode result = removeElements(node1, 2);
////		printLinkedList(result);
////		
////		System.out.println(isPalindrome(result));
//		System.out.println(detectCycle(node1).val);
		
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		
		node1.next = node2;
		
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;

		//printLinkedList(node1);
		
		printLinkedList(reverseBetween(node1, 2, 5));
		//printLinkedList(node1);
	}

}
