//package problempractices;
//
//import java.util.Scanner;
//import java.math.*;
//import java.util.Stack;
//
///*
// * HackerRank Challenge
// */
//
//public class BracketBalance {
//
////    public static boolean isBalanced(String expression) {
////    	if (expression.length() % 2 == 1) {
////    		return false;
////    	}
////        Stack<String> bracketStack = new Stack<String>();
////        for (int i = 0; i < expression.length(); i++){
////        	if (expression.charAt(i) == '{' || expression.charAt(i) == '(' || expression.charAt(i) == '[' ){
////        		bracketStack.push(String.valueOf(expression.charAt(i)));
////        	} else {
////        		if (bracketStack.empty()){ //Unbalanced too
////        			return false;
////        		}
////        		if (expression.charAt(i) == '}') {
////        			if (!bracketStack.pop().equals("{")) {
////        				return false;
////        			}
////        		} else if (expression.charAt(i) == ')') {
////        			if (!bracketStack.pop().equals("(")) {
////        				return false;
////        			}
////        		} else if (expression.charAt(i) == ']') {
////        			if (!bracketStack.pop().equals("[")) {
////        				return false;
////        			}
////        		}
////        	}
////        }
////    	return bracketStack.empty();
////    }
//  
////    public static void main(String[] args) {
//////        Scanner in = new Scanner(System.in);
//////        int t = in.nextInt();
//////        for (int a0 = 0; a0 < t; a0++) {
//////            String expression = in.next();
//////            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
//////        }
////    	Scanner scan = new Scanner(System.in);
////    	
////    	int x = 10000007;
////    	System.out.println(x);
////    	BigInteger t = new BigInteger(scan.next());
////    	BigInteger t2 = t.subtract(BigInteger.ONE);
////    	System.out.println(t);
////    	System.out.println(t2);
////    }
//	public static BigInteger theChallenge(BigInteger n){
////	    if (n == 1) {
////	        return 1;
////	    } else {
////	        double theT = Math.pow(n,2) - (Math.pow(n-1,2));
////	        return theT + theChallenge(n-1);
////	    }
//	    BigInteger square = new BigInteger("2");
//	    BigInteger mod = new BigInteger("10000007");
//	    
//	    BigInteger first = n.modPow(square,mod);
//	    BigInteger second = n.subtract(BigInteger.ONE).modPow(square,mod);
//	    return first.subtract(second);
//	        
//	    //return (int) (Math.pow(n,2) - Math.pow(n-1,2));
//	    }
//	    
//	    public static void main(String args[] ) throws Exception {
//	        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
//	        Scanner scan = new Scanner(System.in);
//	        int t = scan.nextInt();
//	        for(int i = 0; i < t; i++){
//	            BigInteger nextNum = scan.nextBigInteger();
//	            Integer theNum = nextNum.intValue();
//	            BigInteger sum = new BigInteger("0");
////	            Integer theNum = scan.nextInt();
////	            Integer sum = 0;
//	            for(Integer j = 1; j < theNum + 1; j++){
//	                sum = sum.add(theChallenge(BigInteger.valueOf(j.intValue())));
//	                //sum += theChallenge(j);
//	            }
//	            System.out.println(sum);
//	        }
//	        
//	    }
//
//}
