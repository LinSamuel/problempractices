package problempractices;

import java.util.Stack;

public class reverseStr2 {
//    public static String reverseStr(String s, int k) {
//        //Iterate through the string
//    	
//    	StringBuilder finalStr = new StringBuilder();
//    	Stack<Character> firstStack = new Stack<Character>();
//    	for(int i = 0; i < s.length(); i++){
//        	//For the first k characters, add to stack
//    		if( i < k){
//    			firstStack.push(s.charAt(i));
//    			System.out.println("pushing 1" + s.charAt(i));
//    			continue;
//    		}    		
//    		if ( i % 2*k < 2*k - k){
//    			firstStack.push(s.charAt(i));
//    			System.out.println("pushing 2" + s.charAt(i));
//    			continue;
//    		}
//    		//After k is over, pop from stack and add to finalStr
//    		if( i % k == 0 || i - k % 2*k == 0){
//    			while(!firstStack.isEmpty()){
//    				System.out.println("---- popping! " + firstStack.peek());
//    				finalStr.append(firstStack.pop());
//    			}
//    		}
//    		//Append to finalStr until the next 2k iteration
//    		finalStr.append(s.charAt(i));
//        }
//    	return finalStr.toString();
//    }
	
    public static String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int i = 0;
        while(i < n) {
            int j = Math.min(i + k - 1, n - 1);
            swap(arr, i, j);
            i += 2 * k;
        }
        System.out.println("*****");
        return String.valueOf(arr);
    }
    private static void swap(char[] arr, int l, int r) {
        while (l < r) {
            char temp = arr[l];
            System.out.println("-l is: " + l);
            arr[l++] = arr[r];
            System.out.println("-l later is: " + l);
            printArray(arr);
            arr[r--] = temp;
            
        }
    }
    
    public static void printArray(char[] theArray){
    	System.out.println("=====");
    	for(int i = 0; i < theArray.length; i++){
    		System.out.print(theArray[i] + " ");
    	}
    	
    }
    
    public static void main(String[] args){
    	System.out.println("***");
    	System.out.println(reverseStr("abcdefghijkl", 4));
    }
}
