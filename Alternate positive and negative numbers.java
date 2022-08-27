class Solution {
    void rearrange(int arr[], int n) {
        // code here
        ArrayList<Integer>pos=new ArrayList<>();
        ArrayList<Integer>neg=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                pos.add(arr[i]);
            }else{
                neg.add(arr[i]);
            }
        }
        int i=0;
        int index=0;
        while(i<pos.size() && i<neg.size()){
            arr[index]=pos.get(i);
            index++;
            arr[index]=neg.get(i);
            index++;
            i++;
        }
        while(i<pos.size()){
            arr[index]=pos.get(i);
            index++;
            i++;
        }
        while(i<neg.size()){
            arr[index]=neg.get(i);
            index++;
            i++;
        }
    }
}
