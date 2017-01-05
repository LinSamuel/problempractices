package problempractices;

import java.util.Scanner;
import java.util.Stack;

public class TwoStackQueue {
    public static class MyQueue<T> {
        Stack<T> stackNewestOnTop = new Stack<T>();
        Stack<T> stackOldestOnTop = new Stack<T>();

        public void enqueue(T value) { // Push onto newest stack
            stackNewestOnTop.push(value);
        }

        public T peek() {
            while (!stackNewestOnTop.empty()){
            	T currentElement = stackNewestOnTop.pop();
            	stackOldestOnTop.push(currentElement);
            }
        	T printThis = stackOldestOnTop.peek();
        	while (!stackOldestOnTop.empty()){
        		T currentElement = stackOldestOnTop.pop();
        		stackNewestOnTop.push(currentElement);
        	}
        	return printThis;
        }

        public T dequeue() {
            while (!stackNewestOnTop.empty()){
            	T currentElement = stackNewestOnTop.pop();
            	stackOldestOnTop.push(currentElement);
            }
        	T returnThis = stackOldestOnTop.pop();
        	while (!stackOldestOnTop.empty()){
        		T currentElement = stackOldestOnTop.pop();
        		stackNewestOnTop.push(currentElement);
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
