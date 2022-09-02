class Solution {
    public static int minimumCostOfBreaking(int[] X, int[] Y,int M,int N) {
        // code here
        Arrays.sort(X);
        Arrays.sort(Y);
        int i=X.length-1, j=Y.length-1, vcuts=1, hcuts=1;
        int cost=0;
        while(i>=0 && j>=0){
            if(X[i]>Y[j]){
                         cost += (X[i] * vcuts);
                         hcuts++;
                         i--;
            }else{
                        cost+= (Y[j]*hcuts);
                        vcuts++;
                        j--;
            }
        }
        
        while(i>=0){
            cost+=(X[i]*vcuts);
            i--;
        }
        while(j>=0){
            cost+=(Y[j]*hcuts);
            j--;
        }
        return cost;
    }
