package problempractices;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Anagram {

    public static int numberNeeded(String first, String second) {
        HashMap<String, Integer> firstMap = new HashMap<String,Integer>();
        
        for(char letter : first.toCharArray()){
        	if (firstMap.containsKey(String.valueOf(letter))){
        		firstMap.put(String.valueOf(letter), firstMap.get(String.valueOf(letter)) + 1);
        	} else {
        		firstMap.put(String.valueOf(letter), 1);
        	}
        }
        for(char letter : second.toCharArray()){
        	if (firstMap.containsKey(String.valueOf(letter))){
        		firstMap.put(String.valueOf(letter), firstMap.get(String.valueOf(letter)) - 1);
        	} else {
        		firstMap.put(String.valueOf(letter), -1);
        	}
        }
        Iterator it = firstMap.entrySet().iterator();
        int minMoves = 0;
        while (it.hasNext()){
        	Map.Entry pair = (Map.Entry)it.next();
        	minMoves += Math.abs((int) pair.getValue());
        }
        
        
    	return minMoves;
    }
  
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String a = in.next();
//        String b = in.next();
//        System.out.println(numberNeeded(a, b));
//        
//    }

}
