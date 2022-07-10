package servlet;


import java.awt.desktop.ScreenSleepEvent;
import java.util.HashMap;
import java.util.HashSet;

public class SOlut {
    public static void main(String[] args) {
        int[] arr = new int[8];
        for(int i=0;i<8;i++)
            arr[i]=i+1;
        Solution solution = new Solution();
        int res = solution.lenLongestFibSubseq(arr);
        System.out.println(res);
        System.out.println("hello");

    }
}

class Solution2 {
    public int longestSubsequence(String s, int k) {
        int res=0;
        int tempSum=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='0') {
                res++;
            }else{
                tempSum+=(1<<res-1);
                if(tempSum<=k)
                    res++;
                else
                    break;
            }
        }
        return res;
    }
}

// 873
class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int size=arr.length;
        for(int i=0;i<size;i++)
            mp.put(arr[i],i);
        int res=0;
        int[][] dp=new int[size][size];
        for(int i=1;i<size;i++){
            for(int j=i-1;j>=0;j--){
                if(mp.containsKey(arr[i]-arr[j]) && arr[i]-arr[j]<arr[j]){
                    if(dp[j][mp.get(arr[i]-arr[j])]==0)
                        dp[i][j]=3;
                    else
                        dp[i][j]=dp[j][mp.get(arr[i]-arr[j])]+1;
                }
                // System.out.println(j+" "+i+" "+dp[i][j]);
                if(res<dp[i][j])
                    res=dp[i][j];
            }
        }
        return res;
    }
}
