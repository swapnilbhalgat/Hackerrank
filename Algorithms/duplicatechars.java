//Check if the given string has duplicate characters or not

public class duplicatechars {
	public static void main(String[] args) {
		String str="abcdefghijk";
		int flag=0;
		int checker=0;
		for(int i=0;i<str.length();i++){
			int val=str.charAt(i)-'a';
			if((checker & (1<<val))>0){
				System.out.println("False");
				flag=1;
				break;
			}
			checker=checker | (1<<val);
		}
		if(flag!=1){
			System.out.println("True");
		}

	}

}
