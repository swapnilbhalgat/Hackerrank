//https://leetcode.com/problems/minimum-window-substring/

import java.util.HashMap;

public class minimumWindowString {

	public static void main(String[] args) {
	
		String str1="ABDEFCBDAGH";
		String str2="ABC";
		String result=null;
		int min_len=str1.length()+1;
		HashMap<Character,Integer>h1=new HashMap<Character,Integer>();
		HashMap<Character,Integer>h2=new HashMap<Character,Integer>();
		
		for(char s:str2.toCharArray()){
			if(!h2.containsKey(s)){
				h2.put(s, 1);
			}else{
				h2.put(s, h2.get(s)+1);
			}
		}
		int count=0;
		int left=0;
		for(int i=0;i<str1.length();i++){
			char c=str1.charAt(i);
			if(h2.containsKey(c)){
				if(!h1.containsKey(c)){
					h1.put(c, 1);
					count++;
				}else{
					if(h2.get(c)>h1.get(c)){
						h1.put(c, h1.get(c)+1);
						count++;
					}else{
						h1.put(c, h1.get(c)+1);
					}
				}
			}
			
			if(count==str2.length()){
				char temp=str1.charAt(left);
				while(!h2.containsKey(temp) || h1.get(temp)>h2.get(temp)){
					if(h2.containsKey(temp) && h1.get(temp)>h2.get(temp)){
						h1.put(temp, h1.get(temp)-1);
					}
					left++;
					temp=str1.charAt(left);
				}
				if(i-left+1<min_len){
					min_len=i-left+1;
					result=str1.substring(left,i+1);
				}
			}
		}
		System.out.println("Minimum window string: "+result);
	}

}
