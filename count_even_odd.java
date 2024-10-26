import java.util.* ;
import java.io.*; 
public class Solution {
	public static int[] countEvenOdd(int[] arr, int n) {
		// Write your code here.
		Map<Integer,Integer>mp=new HashMap<>();
		for(int i=0;i<n;i++){
			mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
		}
		int odd=0,even=0;
		for(int val:mp.values()){
			if(val%2==0) even++;
			else{
				odd++;
			}
		}
		return new int[]{odd,even};
	}
}
