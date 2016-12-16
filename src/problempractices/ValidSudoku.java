package problempractices;

import java.util.*;

public class ValidSudoku {
	
    public static boolean isValidSudoku(char[][] board) {
    	// Row check first
    	//System.out.println("checking rows");
    	HashMap<Integer, ArrayList<Integer>> SudokuMap = new HashMap<Integer, ArrayList<Integer>>();
    	for (int i = 0; i < 9; i++){
    		SudokuMap.put(i, new ArrayList<Integer>());
    		for (int j = 0; j < 9; j++){
    			if ((board[i][j]) == '.'){
    				continue;
    			}
    			ArrayList<Integer> currentList = SudokuMap.get(i);
    			if (currentList.contains(Character.getNumericValue(board[i][j]))){
    			    //System.out.println("false..." + String.valueOf(i) + " -- " + String.valueOf(j));
    				return false;
    			}
    			currentList.add(Character.getNumericValue(board[i][j]));
    			//System.out.println("adding... " + Character.getNumericValue(board[i][j]));
    		}
    	}
    	// Column Check
    	//System.out.println("checking columns");
    	for (int i = 9; i < 18; i++){
    		SudokuMap.put(i, new ArrayList<Integer>());
    		for (int j = 0; j < 9; j++){
    			if ((board[j][i-9]) == '.'){
    				continue;
    			}
    			ArrayList<Integer> currentList = SudokuMap.get(i);
    			if (currentList.contains(Character.getNumericValue(board[j][i-9]))){
    				return false;
    			}
    			currentList.add(Character.getNumericValue(board[j][i-9]));
    		}
    	}
    	// Box Check
//    	for (int i = 16; i < 24; i++){
//    		SudokuMap.put(i, new ArrayList<Integer>());
//    		for (int j = 0; j < 8; j++){
//    			if (Character.getNumericValue(board[j][i-16]) == '.'){
//    				continue;
//    			}
//    			if(j % 3 == 0){ // left block
//    				
//    			}
//    		}
//    	}
    	//System.out.println("checking squares");
    	SudokuMap.put(18, new ArrayList<Integer>());
    	for(int i = 0; i < 3; i++){
    		for (int j = 0; j < 3; j++){
    			if ((board[i][j]) == '.'){
    				continue;
    			}
    			ArrayList<Integer> currentList = SudokuMap.get(18);
    			if (currentList.contains(Character.getNumericValue(board[i][j]))){
    				return false;
    			}
    			currentList.add(Character.getNumericValue(board[i][j]));
    		}
    	}
    	
    	SudokuMap.put(19, new ArrayList<Integer>());
    	for(int i = 0; i < 3; i++){
    		for (int j = 3; j < 6; j++){
    			if ((board[i][j]) == '.'){
    				continue;
    			}
    			ArrayList<Integer> currentList = SudokuMap.get(19);
    			if (currentList.contains(Character.getNumericValue(board[i][j]))){
    				return false;
    			}
    			currentList.add(Character.getNumericValue(board[i][j]));
    		}
    	}
    	
    	SudokuMap.put(20, new ArrayList<Integer>());
    	for(int i = 0; i < 3; i++){
    		for (int j = 6; j < 9; j++){
    			if ((board[i][j]) == '.'){
    				continue;
    			}
    			ArrayList<Integer> currentList = SudokuMap.get(20);
    			if (currentList.contains(Character.getNumericValue(board[i][j]))){
    				return false;
    			}
    			currentList.add(Character.getNumericValue(board[i][j]));
    		}
    	}
    	
    	SudokuMap.put(21, new ArrayList<Integer>());
    	for(int i = 3; i < 6; i++){
    		for (int j = 0; j < 3; j++){
    			if ((board[i][j]) == '.'){
    				continue;
    			}
    			ArrayList<Integer> currentList = SudokuMap.get(21);
    			if (currentList.contains(Character.getNumericValue(board[i][j]))){
    				return false;
    			}
    			currentList.add(Character.getNumericValue(board[i][j]));
    		}
    	}
    	
    	SudokuMap.put(22, new ArrayList<Integer>());
    	for(int i = 3; i < 6; i++){
    		for (int j = 3; j < 6; j++){
    			if ((board[i][j]) == '.'){
    				continue;
    			}
    			ArrayList<Integer> currentList = SudokuMap.get(22);
    			if (currentList.contains(Character.getNumericValue(board[i][j]))){
    				return false;
    			}
    			currentList.add(Character.getNumericValue(board[i][j]));
    		}
    	}
    	
    	SudokuMap.put(23, new ArrayList<Integer>());
    	for(int i = 3; i < 6; i++){
    		for (int j = 6; j < 9; j++){
    			if ((board[i][j]) == '.'){
    				continue;
    			}
    			ArrayList<Integer> currentList = SudokuMap.get(23);
    			if (currentList.contains(Character.getNumericValue(board[i][j]))){
    				return false;
    			}
    			currentList.add(Character.getNumericValue(board[i][j]));
    		}
    	}
    	
    	SudokuMap.put(24, new ArrayList<Integer>());
    	for(int i = 6; i < 9; i++){
    		for (int j = 0; j < 3; j++){
    			if ((board[i][j]) == '.'){
    				continue;
    			}
    			ArrayList<Integer> currentList = SudokuMap.get(24);
    			if (currentList.contains(Character.getNumericValue(board[i][j]))){
    				return false;
    			}
    			currentList.add(Character.getNumericValue(board[i][j]));
    		}
    	}
    	
    	SudokuMap.put(25, new ArrayList<Integer>());
    	for(int i = 6; i < 9; i++){
    		for (int j = 3; j < 6; j++){
    			if ((board[i][j]) == '.'){
    				continue;
    			}
    			ArrayList<Integer> currentList = SudokuMap.get(25);
    			if (currentList.contains(Character.getNumericValue(board[i][j]))){
    				return false;
    			}
    			currentList.add(Character.getNumericValue(board[i][j]));
    		}
    	}
    	
    	SudokuMap.put(26, new ArrayList<Integer>());
    	for(int i = 6; i < 9; i++){
    		for (int j = 6; j < 9; j++){
    			if ((board[i][j]) == '.'){
    				continue;
    			}
    			ArrayList<Integer> currentList = SudokuMap.get(26);
    			if (currentList.contains(Character.getNumericValue(board[i][j]))){
    				return false;
    			}
    			currentList.add(Character.getNumericValue(board[i][j]));
    		}
    	}
        return true;
    }
    
    public static void printArrayList(ArrayList list){
    	for(int i = 0; i < list.size(); i++){
    		System.out.println(list.get(i));
    		System.out.println("=");
    	}
    	System.out.println("end!");
    }

	public static void main(String[] args) {
//		HashMap<Integer, ArrayList<Integer>> SudokuMap = new HashMap<Integer, ArrayList<Integer>>();
//		SudokuMap.put(0, new ArrayList<Integer>());
//		SudokuMap.put(1, new ArrayList<Integer>());
//		SudokuMap.get(0).add(2);
//		printArrayList(SudokuMap.get(0));
//		ArrayList<Integer> currentList = SudokuMap.get(1);
//		currentList.add(5);
//		printArrayList(SudokuMap.get(1));
		//System.out.println('.' == '.');
		
		String[] input = {".87654321","2........","3........","4........","5........","6........","7........","8........","9........"};
		String[] input2 = {"...9.....",".........","..3.....1",".........","1.....3..","....2.6..",".9.....7.",".........","8..8....."};

		char[][] inputArray = new char[9][9];
		for (int i = 0; i < input2.length; i++){
			String currString = input2[i];
			for (int j = 0; j < 9; j++){
				inputArray[i][j] = currString.charAt(j);
			}
			
		}
		
		System.out.println(isValidSudoku(inputArray));
		
//		char[] firstRow = new char[9];
//		firstRow[0] = '.';
//		firstRow[1] = '8';
//		firstRow[2] = '7';
//		firstRow[3] = '6';
//		firstRow[4] = '5';
//		firstRow[5] = '4';
//		firstRow[6] = '3';
//		firstRow[7] = '2';
//		firstRow[8] = '1';
//		
//		char[] secondRow = new char[9];
//		secondRow[0] = '2';
//		secondRow[1] = '.';
//		secondRow[2] = '.';
//		secondRow[3] = '.';
//		secondRow[4] = '.';
//		secondRow[5] = '.';
//		secondRow[6] = '.';
//		secondRow[7] = '.';
//		secondRow[8] = '.';
//		
//		char[] Row3 = new char[9];
//		Row3[0] = '2';
//		Row3[1] = '.';
//		Row3[2] = '.';
//		Row3[3] = '.';
//		Row3[4] = '.';
//		Row3[5] = '.';
//		Row3[6] = '.';
//		Row3[7] = '.';
//		Row3[8] = '.';
//		
////		char[] Row3 = new char[9];
////		Row3[0] = '2';
////		Row3[1] = '.';
////		Row3[2] = '.';
////		Row3[3] = '.';
////		Row3[4] = '.';
////		Row3[5] = '.';
////		Row3[6] = '.';
////		Row3[7] = '.';
////		Row3[8] = '.';

	}

}
