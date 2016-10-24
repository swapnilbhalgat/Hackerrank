
public class longestCommonSubseq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="ABDFGH";
		String str2="ZPAQRDMNOG";
		int[][] L=new int[str1.length()+1][str2.length()+1];
		int n=str1.length();
		int m=str2.length();
		
		for(int i=0;i<=n;i++){
			for(int j=0;j<=m;j++){
				if(i==0 || j==0){
					L[i][j]=0;
					continue;
				}
					
				if(str1.charAt(i-1)==str2.charAt(j-1)){
					L[i][j]=1+L[i-1][j-1];
				}else{
					L[i][j]=Math.max(L[i-1][j],L[i][j-1]);
				}
				
			}
		}
		System.out.println(L[n][m]);
		
	}

}
