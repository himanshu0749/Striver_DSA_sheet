public static ArrayList<Integer> addOneToNumber(ArrayList<Integer> arr)
    {
        // Write your code here.
        int n=arr.size();
        int carry=1;
        int i=n-1;
        while(i>=0 && carry>0){
            int sum=arr.get(i)+carry;
            if(sum==10){
                arr.set(i,0);
                carry=1;
            }else{
                arr.set(i,sum);
                carry=0;
            }
            i--;
        }
        if(carry==1) arr.add(0,1);
        while(arr.size()>1 && arr.get(0)==0) arr.remove(0);
        return arr;
    }
}    
