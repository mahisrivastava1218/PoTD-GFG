class Solution{
    static int minimumDays(double S, double N, double M){
        // code here
        double res=N/M;
        int count=1;
        
        if(((N*6)<(M*7) && (S>6)) || M>N){
            return -1;
        
        }else{
             
             while(res<S){
                 res += (N/M);
                 count++;
                
             }
             
        }
        return count;
    }
}
