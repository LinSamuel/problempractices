package problempractices;

import java.util.Scanner;
import java.util.Stack;

/*
 * HackerRank Challenge
 */

public class BracketBalance {

    public static boolean isBalanced(String expression) {
        Stack<String> bracketStack = new Stack<String>();
        for (int i = 0; i < expression.length(); i++){
        	if (expression.charAt(i) == '{' || expression.charAt(i) == '(' || expression.charAt(i) == '[' ){
        		bracketStack.push(String.valueOf(expression.charAt(i)));
        	} else {
        		if (expression.charAt(i) == '}') {
        			if (!bracketStack.pop().equals("{")) {
        				return false;
        			}
        		} else if (expression.charAt(i) == ')') {
        			if (!bracketStack.pop().equals("(")) {
        				return false;
        			}
        		} else if (expression.charAt(i) == ']') {
        			if (!bracketStack.pop().equals("[")) {
        				return false;
        			}
        		}
        	}
        }
    	return true;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }

}
