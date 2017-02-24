package problempractices;

import java.util.Scanner;

public class HRContactList {
	public static class Node {
		private static int NUMBER_OF_CHARACTERS = 26;
		Node[] children = new Node[NUMBER_OF_CHARACTERS];
		int size = 0;
		
		private static int getCharIndex(char index){
			return index - 'a';
		}
		
		private Node getNode(char c) {
			return children[getCharIndex(c)];
		}
		
		private void setNode(char c, Node node) {
			children[getCharIndex(c)] = node;
		}
		
		public void add(String s){
			add(s,0);
		}
		
		private void add(String s, int index) {
			if (index == s.length()) return; //if it's at the end, return
			char current = s.charAt(index);
			int charCode = getCharIndex(current);
			Node child = getNode(current);
			if (child == null) {
				child = new Node();
				setNode(current, new Node());
			}
			child.add(s, index+1);
		}
		
		public int findCount(String s, int index) {
			if (index == s.length()) {
				return size;
			}
			Node child = getNode(s.charAt(index));
			if (child == null) {
				return 0;
			}
			return child.findCount(s, index + 1);
		} 
	}
	
	public static void main(String[] args){
		Node theTry = new Node();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            if (op.equals("add")) {
            	for(int i = 0; i < contact.length(); i++){
            		theTry.add(contact, i);
            	}
            	//theTry.add(contact);
            } else if (op.equals("find")) {
            	System.out.println(theTry.findCount(contact, 0));
            }
        }
	}
}
