package problempractices;
import java.util.ArrayList;
import java.util.HashMap;
public class InitialCommit {


		
		

	    public static int[] twoSum(int[] nums, int target) {
//	        int[] finalArray = new int[2];
//	        for(int i = 0; i < nums.length; i++){
//	        	int firstNum = nums[i];
//	        	for(int j = i+1; j < nums.length; j++){
//	        		if ( nums[i] + nums[j] == target){
//	        			finalArray[0] = i;
//	        			finalArray[1] = j;
//	        			return finalArray;
//	        		}
//	        		
//	        	}
//	        }
//	        return finalArray;
//	        int[] finalArray = new int[2];
//	        HashMap<Integer,ArrayList<Integer>> intMap = new HashMap<Integer, ArrayList<Integer>>();
//	        for (int i = 0; i<nums.length; i++){
//	        	if (!intMap.containsKey(nums[i])){
//	        		ArrayList<Integer> newList = new ArrayList<Integer>();
//	        		newList.add(i);
//	        		System.out.println("adding 1: " + i);
//	        		intMap.put(nums[i], newList);
//	        	} else {
//	        		System.out.println("adding 2: " + i);
//	        		intMap.get(nums[i]).add(i);
//	        	}
//	        }
//	        for(int i = 0; i < nums.length; i++){
//	        	
//	        	int numToLook = target - nums[i];
//	        	if (intMap.containsKey(numToLook)){
//	        		ArrayList<Integer> tempList = intMap.get(numToLook);
//	        		for(int j = 0; j < tempList.size(); j++){
//	        			System.out.println("j: " + j);
//	        			if (i != tempList.get(j)){
//	        				finalArray[0] = i;
//	        				finalArray[1] = tempList.get(j); 
//	        				return finalArray;
//	        			}
//	        		}
//	        	}
//	        }
//	        return finalArray;
	        int[] finalArray = new int[2];
	        HashMap<Integer,Integer> intMap = new HashMap<Integer, Integer>();
	        for (int i = 0; i<nums.length; i++){
	        	if (!intMap.containsKey(nums[i])){
	        		System.out.println("adding 1: " + i);
	        		intMap.put(nums[i], i);
	        	} else {
	        		if(target == (2 * nums[i])){
	        			finalArray[0] = intMap.get(nums[i]);
	        			finalArray[1] = i;
	        			return finalArray;
	        		}
	        	}
	        }
	        for(int i = 0; i < nums.length; i++){       	
	        	int numToLook = target - nums[i];
	        	if (intMap.containsKey(numToLook) && numToLook != nums[i]){

					finalArray[0] = i;
					finalArray[1] = intMap.get(numToLook); 
					return finalArray;

	        	}
	        }
	        return finalArray;
	    }
	    
	    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        ListNode finalListNode = null;
	        ListNode head = null;
	        boolean carryDigit = false;
	        while(l1 != null || l2 != null){
	        	
	        	if(l2 == null){
	            	int digitSum = 0;
	            	if (carryDigit){
	            		digitSum++;
	            		carryDigit = false;
	            	}
	            	if (l1.value == 9){
	            		digitSum = 0;
	            		carryDigit = true;
	            	} else{
	            		digitSum += l1.value;
	            	}        	
	            	if (finalListNode == null){
	            		finalListNode = new ListNode(digitSum);
	            		head = finalListNode;
	            	} else {
	            		finalListNode.next = new ListNode(digitSum);
	                	finalListNode = finalListNode.next;
	            	}
	            	l1 = l1.next;
	            	if (l1 == null && l2 == null && carryDigit){
	            		finalListNode.next = new ListNode(1);
	            	}
	        	} else if (l1 == null){
	            	int digitSum = 0;
	            	if (carryDigit){
	            		digitSum++;
	            		carryDigit = false;
	            	}
	            	if (l2.value + digitSum > 9){
	            		digitSum = 0;
	            		carryDigit = true;
	            	} else{
	            		digitSum += l2.value;
	            	}        	
	            	if (finalListNode == null){
	            		finalListNode = new ListNode(digitSum);
	            		head = finalListNode;
	            	} else {
	            		finalListNode.next = new ListNode(digitSum);
	                	finalListNode = finalListNode.next;
	            	}
	            	l2 = l2.next;
	            	if (l1 == null && l2 == null && carryDigit){
	            		finalListNode.next = new ListNode(1);
	            	}
	        	} else {
	            	int digitSum = 0;
	            	if (carryDigit){
	            		digitSum++;
	            		carryDigit = false;
	            	}
	            	if ((l1.value + l2.value + digitSum) > 9){
	            		digitSum = (l1.value + l2.value + digitSum) % 10;
	            		carryDigit = true;
	            	} else{
	            		digitSum += l1.value + l2.value;
	            	}        	
	            	if (finalListNode == null){
	            		finalListNode = new ListNode(digitSum);
	            		head = finalListNode;
	            	} else {
	            		finalListNode.next = new ListNode(digitSum);
	                	finalListNode = finalListNode.next;
	            	}
	            	
	            	l1 = l1.next;
	            	l2 = l2.next;
	            	if (l1 == null && l2 == null && carryDigit){
	            		finalListNode.next = new ListNode(1);
	            	}
	        	}

	        }
	        return head;
	    }
	    
	    public static int lengthOfLongestSubstring(String s) {
	    	int longestLength = -1;
	    	int counter = 0;
	    	if(s.equals("")){
	    		return 0;
	    	}

	    	HashMap<String, Boolean> presenceMap = new HashMap<String, Boolean>();
	    	for(int index = 0; index < s.length(); index++){
		    	for(int i = index; i < s.length(); i++){
		    		String currentStr = String.valueOf(s.charAt(i));
		    		if(!presenceMap.containsKey(currentStr)){
		    			//System.out.println("update 1 " + currentStr);
		    			presenceMap.put(currentStr, true);
		    			counter++;
		    		} else { //duplicate found
						counter = 0;
						presenceMap = new HashMap<String,Boolean>();
						break;
		    		}
		    		if (counter > longestLength){
		    			longestLength = counter;
		    		}
		    	}
		    	if((s.length()/2) < index && (longestLength > s.length()/2)){
		    		break;
		    	}
	    	}
	    	
	    	return longestLength;
	        
	    }
		
		public static void main(String[] args) {
//			int[] testArray = new int[] {3,2,4};
//			//twoSum(testArray, 6);
//			int[] testArray2 = new int[] {0,4,3,0};
//			int[] testArray3 = twoSum(testArray, 6);
//			for(int i = 0; i < testArray3.length; i++){
//				System.out.println(testArray3[i]);
//			}
			
//			ListNode l1 = new ListNode(2);
//			l1.next = new ListNode(4);
//			l1.next.next = new ListNode(3);
//			ListNode l2 = new ListNode(5);
//			l2.next = new ListNode(6);
//			l2.next.next = new ListNode(4);
//			
////			ListNode l1 = new ListNode(1);
////			l1.next = new ListNode(8);
////			ListNode l2 = new ListNode(0);
//			
////			ListNode l1 = new ListNode(5);
////			ListNode l2 = new ListNode(5);
//			
////			ListNode l1 = new ListNode(3);
////			l1.next = new ListNode(7);
////			ListNode l2 = new ListNode(9);
////			l2.next = new ListNode(2);
//			
//			ListNode answer = addTwoNumbers(l1, l2);
//			while(answer != null){
//				System.out.println(answer.val);
//				answer = answer.next;
//			}
			
			//System.out.println(lengthOfLongestSubstring("abcabcbb"));
			System.out.println(lengthOfLongestSubstring("pwwkew"));
			System.out.println(lengthOfLongestSubstring("abcabcbb"));
			System.out.println(lengthOfLongestSubstring("aab"));
			System.out.println(lengthOfLongestSubstring("dvdf"));
			System.out.println(lengthOfLongestSubstring("asjrgapa"));
			
			
			

		}

}
