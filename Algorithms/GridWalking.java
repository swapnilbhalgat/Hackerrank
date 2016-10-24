//https://www.hackerrank.com/challenges/grid-walking

import java.util.Scanner;

public class GridWalking {
	  public static boolean isValid(int x,int d){
	        if(x<=d && x>=1)
	            return true;
	        return false;
	    }
	    static int sum=0;
	    public static void count(int[] x,int[] D,int stepnumber,int m){
	     
	        
	        if(stepnumber==m)
	            sum++;
	        else{
	            for(int i=0;i<D.length;i++){
	                if(isValid(x[i]+1,D[i])){
	                    int[] newarr = x.clone();
	                    newarr[i]=newarr[i]+1;
	                    count(newarr,D,stepnumber+1,m);
	                }
	                if(isValid(x[i]-1,D[i])){
	                    int[] newarr = x.clone();
	                    newarr[i]=newarr[i]-1;
	                    count(newarr,D,stepnumber+1,m);
	                }
	            }
	        }
	 
	        
	    }

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner sc=new Scanner(System.in);
	        int T=sc.nextInt();
	        for(int i=0;i<T;i++){
	            int n=sc.nextInt();
	            int m=sc.nextInt();
	            int[] x=new int[n];
	            for(int j=0;j<n;j++)
	                x[j]=sc.nextInt();
	            int[] D=new int[n];
	            for(int j=0;j<n;j++)
	                D[j]=sc.nextInt();
	            
	           count(x,D,0,m);
	            System.out.println(sum);
	            
	        }
	    }
}
