//http://www.geeksforgeeks.org/remove-all-duplicates-from-the-input-string/

import java.util.HashMap;

public class removeDuplicateChars {

	public static void main(String[] args) {

		String str="abcccdefgghiijk";
		HashMap<Character,Integer> h1=new HashMap<Character,Integer>();
		for(char s:str.toCharArray()){
			if(!h1.containsKey(s)){
				h1.put(s, 1);
			}
		}
		for(char s:str.toCharArray()){
			if(h1.get(s)!=0){
				h1.put(s,0);
				System.out.print(s);
			}
		}
	}

}
