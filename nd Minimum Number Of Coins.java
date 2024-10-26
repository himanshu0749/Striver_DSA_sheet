public class Solution {
    public static List<Integer> MinimumCoins(int n) {
        // Write your code here.
        int[] coins={1,2,5,10,20,50,100,500,1000};
        List<Integer> res=new ArrayList<>();
        for(int i=coins.length-1;i>=0;i--){
            while(n>=coins[i]){
                n-=coins[i];
                res.add(coins[i]);
            }
        }
        return res;
    }
