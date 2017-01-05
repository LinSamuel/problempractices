package problempractices;

import java.util.Scanner;
import java.util.Stack;

public class TwoStackQueue {
    public static class MyQueue<T> {
        Stack<T> stackNewestOnTop = new Stack<T>();
        Stack<T> stackOldestOnTop = new Stack<T>();
        
        T currentHead;
        
        public void enqueue(T value) { // Push onto newest stack
            stackNewestOnTop.push(value);
        }

        public T peek() {
            while (!stackNewestOnTop.empty()){
            	stackOldestOnTop.push(stackNewestOnTop.pop());
            }
        	T printThis = stackOldestOnTop.peek();
        	while (!stackOldestOnTop.empty()){     		
        		stackNewestOnTop.push(stackOldestOnTop.pop());
        	}
        	return printThis;
        }

        public T dequeue() {
            while (!stackNewestOnTop.empty()){
            	stackOldestOnTop.push(stackNewestOnTop.pop());
            }
        	T returnThis = stackOldestOnTop.pop();
        	while (!stackOldestOnTop.empty()){
        		stackNewestOnTop.push(stackOldestOnTop.pop());
        	}
        	return returnThis;            
        }
    }

    
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }

}
