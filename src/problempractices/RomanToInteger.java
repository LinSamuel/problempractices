package problempractices;

import java.util.HashMap;

public class RomanToInteger {
	
	//Helper function that take in a string of length 2, returns true if the first character is less than the following character in roman numerals
	public static boolean checkIfLess(String substr, HashMap<String,Integer> romanIndex){
		String firstChar = String.valueOf(substr.charAt(0));
		int firstIndex = romanIndex.get(firstChar);
		String secondChar = String.valueOf(substr.charAt(1));
		int secondIndex = romanIndex.get(secondChar);
		return firstIndex < secondIndex;
	}
	
    public static int romanToInt(String s) {
        //Guaranteed that the string input will be valid roman numerals between 1-3999
    	int finalAnswer = 0;
    	
    	HashMap<String, Integer> romanMap = new HashMap<String,Integer>();
    	romanMap.put("I", 1);
    	romanMap.put("V", 5);
    	romanMap.put("X", 10);
    	romanMap.put("L", 50);
    	romanMap.put("C", 100);
    	romanMap.put("D", 500);
    	romanMap.put("M", 1000);
    	
    	//MDCLXVI ... decreasing order of roman numerals, each index will stand for current stage (to deal with order like IV, XL, etc.)
    	
    	int currentIndex = 0; //Start with M
    	
    	HashMap<String, Integer> romanIndex = new HashMap<String,Integer>();
    	romanIndex.put("I", 0);
    	romanIndex.put("V", 1);
    	romanIndex.put("X", 2);
    	romanIndex.put("L", 3);
    	romanIndex.put("C", 4);
    	romanIndex.put("D", 5);
    	romanIndex.put("M", 6);
    	
    	//check if the succeeding character is greater than the first Roman numeral or not
    	for(int i = 0; i < s.length(); i++){
    		//first check if current char is less than following character
    		String currentChar = String.valueOf(s.charAt(i));
    		if((i+1) < s.length() && checkIfLess(s.substring(i, i+2), romanIndex)){
    			finalAnswer += romanMap.get(String.valueOf(s.charAt(i + 1))) - romanMap.get(currentChar);
    			//skip 2 indeces
    			i++;
    		} else {
    			finalAnswer += romanMap.get(currentChar);
    		}
    	}	 	
    	return finalAnswer;
    }
	public static void main(String[] args) {
		System.out.println(romanToInt("CDV"));

	}

}
