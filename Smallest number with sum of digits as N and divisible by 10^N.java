class Solution
{
    public String digitsNum(int N)
    {
        // Code here
       StringBuilder s=new StringBuilder();
       for(int i=0;i<N;i++){
           s.append("0");
       }
       while(N!=0){
           if(N>9){
               s.insert(0,9);
               N-=9;
           }else{
               s.insert(0,N);
               N-=N;
           }
       }
       return s.toString();
    }
}
