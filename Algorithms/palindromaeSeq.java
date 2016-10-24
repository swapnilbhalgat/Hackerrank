//https://leetcode.com/problems/longest-palindromic-substring/

public class palindromaeSeq {

	public static void main(String[] args) {
		String seq = "GEEKSFORGEEKS";
        int n = seq.length();
        int i,j,c1;
        
        int[][] LPS=new int[n][n];
        for(i=0;i<n;i++)
        	LPS[i][i]=1;
        for(c1=2;c1<=n;c1++){
        	for(i=0;i<n-c1+1;i++){
        		j=i+c1-1;
        		if((seq.charAt(i)==seq.charAt(j)) && c1==2)
        			LPS[i][j]=2;
        		else if(seq.charAt(i)==seq.charAt(j))
        			LPS[i][j]=2+LPS[i+1][j-1];
        		else
        			LPS[i][j]=Math.max(LPS[i+1][j], LPS[i][j-1]);
        	}
        }
        System.out.println(LPS[0][n-1]);
	}

}
