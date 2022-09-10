class Solution{
    static int minimumDays(int S, int N, int M){
        // code here
        int res=(M*S)/N;
        int count=1;
        
        if(((N*6)<(M*7) && (S>6)) || M>N){
            return -1;
        
        }else{
             
             if(((M*S)%N)!=0){
                
                 res++;
                
             }
             
        }
        return res;
    }
}
