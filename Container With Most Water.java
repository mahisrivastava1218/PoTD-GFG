class Solve{
    
    long maxArea(int A[], int len){
        // Code Here
        int ans=0;
        
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                ans=Math.max(ans,Math.min(A[i],A[j])*(j-i));
                System.out.println(ans);
            }
        }
        return ans;
         
    }
    
}
