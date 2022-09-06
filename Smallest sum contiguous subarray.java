class Solution
{
    static int smallestSumSubarray(int a[], int size)
    {
        // your code here
        int ans=a[0];
       for(int i=0;i<size;i++){
            int sum=0;
            for(int j=i;j<size;j++){
               sum+=a[j];
               
               if(sum<=ans){
                  ans =sum;
                }
                // System.out.print(ans);
            }
            
          
           
       }
      return ans;  
    }
}
