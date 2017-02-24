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
        //Guaranteed that the string input will be between 1-3999
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
    	romanMap.put("I", 0);
    	romanMap.put("V", 1);
    	romanMap.put("X", 2);
    	romanMap.put("L", 3);
    	romanMap.put("C", 4);
    	romanMap.put("D", 5);
    	romanMap.put("M", 6);
    	
    	String firstChar = String.valueOf(s.charAt(0));
    	
    	int firstIndex = romanIndex.get(firstChar); //get first character index.
    	
    	//check if the succeeding character is greater than the first Roman numeral or not
    	
    	
    	return 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
