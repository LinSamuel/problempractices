package problempractices;

import java.util.ArrayList;
import java.util.Collections;

public class Factors {
	public static ArrayList<ArrayList<Integer>> allFactorials(int value){
		  if(value < 0){
		     return null;
		  }
		 ArrayList<ArrayList<Integer>> finalMatrix = new ArrayList<ArrayList<Integer>>();
		  ArrayList<Integer> factorList = new ArrayList<Integer>();
		  int temp = value;
		  for(int i = 2; i <= value / 2; i++){
		    
		    //If this is a valid factor, add the factor into factor list
		    if(temp % i == 0){
		      factorList.add(i);
		    }
		  }
		  Collections.reverse(factorList);
		  
		  printArrayList(factorList);
		      
		  // for each factor in factorList
		      // while (!endLoop)
		      // for each secondary factor in factorList
		          // if valid, add to tempList
		      // if (secondary is equal to lowest), go to next factor in factorList
		  for(int i = 0 ; i < factorList.size(); i++){
		    boolean endLoop = false;
		    int factor = factorList.get(i);
		    int lowest = factorList.get(factorList.size() - 1);
		    int counter = 0;
		    while(!endLoop){
		      ArrayList<Integer> tempList = new ArrayList<Integer>();
		      int tempFactor = value; //temp variable to hold current calculation
		      for(int j = i + counter; j < factorList.size(); j++){
		    	  //System.out.println(j);
		          int currFactor = factorList.get(j);
		        while(tempFactor >= 2 && tempFactor % currFactor == 0){ //If this is a valid factor, add to list
		        	System.out.println(tempFactor + "--" + currFactor);
		          tempList.add(currFactor);
		          tempFactor /= currFactor;
		        }
		        counter++;
		        
		      }
		      finalMatrix.add(tempList);
		      
		      if((tempList.size() > 1 && tempList.get(1) == lowest) || counter>tempList.size()){
		        endLoop = true;
		        continue;
		      }
		    }
		 }
		   
		  return finalMatrix;
	}
	
	public static void printArrayList(ArrayList<Integer> theList){
		System.out.println("=");
		for(int i = 0; i < theList.size(); i++){
			System.out.println(theList.get(i));
		}
	}

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> lol = new ArrayList<ArrayList<Integer>>();
		lol = allFactorials(16);
		for(int i = 0; i < lol.size(); i++){
			printArrayList(lol.get(i));
		}
	}

}
