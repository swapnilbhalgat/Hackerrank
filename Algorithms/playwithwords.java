//https://www.hackerrank.com/challenges/strplay

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class playwithwords {

   public static int[][] LCS(String A){
        int[][] dp = new int[A.length()][A.length()];
       
       int i,j,k;
       int n=A.length();
       for(i=0;i<A.length();i++)
           dp[i][i]=1;
       
       for(i=2;i<=n;i++){
           for(j=0;j<n-i+1;j++){
               k=j+i-1;
               
               if(A.charAt(j)==A.charAt(k) && i==2)
                   dp[j][k]=2;
               else if(A.charAt(j)==A.charAt(k))
                   dp[j][k]=dp[j+1][k-1]+2;
               else
                   dp[j][k]=Math.max(dp[j+1][k],dp[j][k-1]);
               
           }
       }
    
        return dp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        long max = 0;
        int[][] dp = LCS(str);
        for(int i = 0; i < str.length()-1;i++){
            max = Math.max(dp[0][i]*dp[i+1][str.length()-1], max);
        }
        System.out.println(max);
    }
}