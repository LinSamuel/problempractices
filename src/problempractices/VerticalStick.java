package problempractices;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class VerticalStick {
	
	static class Node{
		int name;
		int shortest;
		boolean visited;
		ArrayList<Integer> children;

		Node(int name){
			this.name = name;
			children = new ArrayList<Integer>();
			visited = false;
		}

		void add (int value){
			children.add(value);
		}

		ArrayList<Integer> getChildren(){
			return children;
		}
		
//		void visited(int edgeNumAway){
//			this.visited = true;
//			shortest = edgeNumAway * 6;
//		}
	}
	
	
	
//	public static void calculateRay(int[] array){
//		float total = 0;
//		for(int i = 0; i < array.length; i++){
//			if(i == 0){
//				total += 1;
//				continue;
//			}
//			if(array[i] > array[i-1]){
//				return;
//			}
//		}
//	}
//	
//	public static int calcGreaterOrEqual(int[] array, int value){
//		int sum = 0;
//		for(int i = 0; i < array.length; i++){
//			if (array[i] >= value){
//				sum += 1;
//			}
//		}
//		return sum;
//	}
//	
//	public static void printMap(HashMap mp) {
//	    Iterator it = mp.entrySet().iterator();
//	    while (it.hasNext()) {
//	        Map.Entry pair = (Map.Entry)it.next();
//	        System.out.println(pair.getKey() + " = " + pair.getValue());
//	        //it.remove(); // avoids a ConcurrentModificationException
//	    }
//	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();   // number of tests
		for(int i=0;i<q;i++){
		    ArrayList<Node> theList = new ArrayList<Node>();
		    java.util.Queue<Node> queue = new LinkedList<Node>();
		    int n = scan.nextInt();  // nodes
		    int m = scan.nextInt();  // edges
		

		    for(int j=1;j<=n;j++){
		        theList.add(new Node(j)); //Node names go from 1 <= n (slight mismatch from theList, which has 0 indexing
		    }
		    for(int j=0;j<m;j++){
		        int start = scan.nextInt();
		        int end = scan.nextInt();
		        Node currentStartNode = theList.get(start-1);
		        currentStartNode.add(end); 
		        Node currentEndNode = theList.get(end-1);
		        currentEndNode.add(start);
		    }
		
		    int s = scan.nextInt();
		    Node startingNode = theList.get(s-1);
		    startingNode.shortest = 0;
		    queue.add(startingNode);
		    while(!queue.isEmpty()){
		    	Node current = queue.poll();
		    	//current.visited = true;
		    	int currDistance = current.shortest;
		    	ArrayList<Integer> adjacent = current.getChildren();
		    	//theList.set(current.name - 1, current);
		    	for(int k = 0; k < adjacent.size(); k++){
		    		int nodeNum = adjacent.get(k); //children node name
		    		Node adjacentNode = theList.get(nodeNum - 1);
		    		if (adjacentNode.visited == false){
		    			adjacentNode.visited = true;
			    		adjacentNode.shortest = currDistance + 6; //Adjacent node distance
			    		theList.set(adjacentNode.name - 1, adjacentNode);
		    			queue.add(adjacentNode);
		    		}
		    	}
		    }
		    
		    for(int k = 0; k < theList.size(); k++){
		    	if( k == s-1) {
		    		continue;
		    	}
		    	Node currNode = theList.get(k);
		    	if (!currNode.visited){
		    		System.out.print("-1");
		    	} else {
		    		System.out.print(currNode.shortest);
		    	}
		    	System.out.print(" ");
		    }
		    
		    System.out.println();
		}
		scan.close();
//		Scanner scan = new Scanner(System.in);
//		int t = scan.nextInt();
//		for(int i = 0; i < t; i++){
//			int n = scan.nextInt();
//			int[] initialArray = new int[n];
//			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//			for(int j = 0; j < n; j++){
//				initialArray[j] = scan.nextInt();			
//			}
//			for(int j = 0; j < n; j++){
//				if(!map.containsKey(initialArray[j])){
//					map.put(initialArray[j], calcGreaterOrEqual(initialArray, initialArray[j]));
//				}	
//			}
//			float expected = 0;
//			for(int j = 0; j < initialArray.length; j++){
//				expected += (float) (n+1) / (map.get(initialArray[j]) + 1);
//			}
//			System.out.println(expected);		
//		}



}
}
