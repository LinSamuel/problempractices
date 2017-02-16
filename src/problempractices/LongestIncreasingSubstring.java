package problempractices;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LongestIncreasingSubstring {
	
	public static void printArray(List<Integer> theList){
		System.out.println("---New List---");
		for(int i = 0; i < theList.size(); i++){
			System.out.print(theList.get(i) + " ");
		}
		System.out.println();
	}
	
	public static void printMatrix(ArrayList<ArrayList<Integer>> theList){
		System.out.println("---New Matrix---");
		for(int i = 0; i < theList.size(); i++){
			for(int j = 0; j < theList.get(i).size(); j++){
				System.out.print(theList.get(i).get(j) + " ");
			}
			System.out.println();
		}
		System.out.println("-----");
	}

	public static void main(String[] args) {
		System.out.println("Hi");
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] intArray = new int[n];
        for(int i = 0; i < n; i++){
            intArray[i] = scan.nextInt();
        }
        ArrayList<ArrayList<Integer>> intMatrix = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < n; i++){
            ArrayList<Integer> newList = new ArrayList<Integer>();
            if(i == 0){
                newList.add(intArray[0]);
                intMatrix.add(newList);
                continue;
            }
            for(int j = 0; j < i; j++){
            	System.out.println(" i is " + i + " j is " + j + " and list is: ");
            	printArray(newList);
                if( (intArray[i] > intArray[j]) && (intMatrix.get(j).size() + 1 > newList.size())) {
                	System.out.println("if loop passed");
                	ArrayList<Integer> addingOnList = new ArrayList<Integer>(intMatrix.get(j));
                	System.out.println("newlist upgrade=========");
                	printArray(addingOnList);
                    newList = addingOnList;
                    System.out.println("=");
                }
            }
            newList.add(intArray[i]);
            System.out.println("adding to matrix....");
            printArray(newList);
            intMatrix.add(newList); 
            printMatrix(intMatrix);
        }
        int longest = 0;
        for(int i = 0; i < intMatrix.size(); i++){
            if(intMatrix.get(i).size() > longest){
                longest = intMatrix.get(i).size();
            }
        }
        System.out.println(longest);
    }

}
