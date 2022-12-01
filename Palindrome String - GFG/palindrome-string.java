//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int check(String s, int start, int end){
        if(start>=end){
            return 1; // reached upto middle
        }
        if(s.charAt(start)!=s.charAt(end)){
            return 0;
        }
        return check(s,start+1,end-1);
    }
    int isPalindrome(String S) {
        int n = S.length();
        return check(S , 0, n-1);
    }
};