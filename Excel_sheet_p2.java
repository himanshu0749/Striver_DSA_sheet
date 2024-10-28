import java.util.* ;
import java.io.*; 
public class Solution {
    public static long titleToNumber(String str)
    {
        int len=str.length();
        long res=0;
        for(int i=0;i<len;i++){
            int val=str.charAt(i)-'A'+1;
            res=res*26+val;
        }        
        return res;
    }
}
