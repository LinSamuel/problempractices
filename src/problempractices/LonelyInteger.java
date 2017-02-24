package problempractices;

import java.util.Scanner;

public class LonelyInteger {

    public static int lonelyInteger(int[] a) {
    	int answer = 0;
    	for (int i = 0; i < a.length; i++){
    		System.out.println("answer is " + answer);
    		answer ^= a[i];
    	}
    	
    	return answer;
    	
    	
//        int bitVector = 0;
//        for(int i = 0; i < a.length; i++) {
//        	int mask = 1 << a[i];
//        	if ((bitVector & mask) == 0) { // if 0, then set
//        		bitVector |= mask;
//        	} else { //unset
//        		bitVector &= ~mask;
//        	}
//        	System.out.println("adding " + a[i]);
//        	System.out.println(bitVector);
//        }
//        int index = 1;
//        int position = 1;
//        while((index & bitVector) == 0){
//        	index = index << 1;
//        	position++;
//        }
//        return position - 1;
    }
    
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int a[] = new int[n];
//        for(int a_i=0; a_i < n; a_i++){
//            a[a_i] = in.nextInt();
//        }
//        System.out.println(lonelyInteger(a));
//    }

}
