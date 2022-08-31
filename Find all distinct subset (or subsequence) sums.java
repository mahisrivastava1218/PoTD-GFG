class Solution
{
    public int[] DistinctSum(int[] nums)
    {
      Set<Integer>set=new HashSet<>();
      func(nums,0,0,set);
      int[] ans=new int[set.size()];
      int i=0;
      for(int el:set){
          ans[i]=el;
          i++;
      }
      Arrays.sort(ans);
      return ans;
   }
   void func(int[] nums,int i,int sum,Set<Integer>set){
       if(i==nums.length){
           set.add(sum);
           return;
       }
       func(nums,i+1,sum,set);
       func(nums,i+1,sum+nums[i],set);
   }
}
