package problempractices;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class HashMap_RansomNote {

//	public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int m = in.nextInt();
//        int n = in.nextInt();
//        String magazine[] = new String[m];
//        for(int magazine_i=0; magazine_i < m; magazine_i++){
//            magazine[magazine_i] = in.next();
//        }
//        String ransom[] = new String[n];
//        for(int ransom_i=0; ransom_i < n; ransom_i++){
//            ransom[ransom_i] = in.next();
//        }
//        HashMap<String, Integer> wordMap = new HashMap<String,Integer>();
//        for(String word : magazine){
//        	if (wordMap.containsKey(word)){
//        		wordMap.put(word, wordMap.get(word)+1);
//        	} else {
//        		wordMap.put(word, 1);
//        	}
//        }
//        for(String word : ransom){
//        	if (wordMap.containsKey(word)){
//        		wordMap.put(word, wordMap.get(word)-1);
//        	} else {
//        		wordMap.put(word, -1);
//        	}
//        }
//        Iterator iter = wordMap.entrySet().iterator();
//        boolean makeNote = true;
//        while (iter.hasNext()){
//        	Map.Entry pair = (Map.Entry)iter.next();
//        	if (((int) pair.getValue() < 0)){
//        		makeNote = false;
//        		break;
//        	}
//        }
//        if (makeNote){
//        	System.out.println("Yes");
//        } else{
//        	System.out.println("No");
//        }
//        
//	}

}
