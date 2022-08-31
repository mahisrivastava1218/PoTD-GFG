class Solution
{
    public int[] DistinctSum(int[] nums)
    {
      boolean[][] dp=new boolean[101][10001];
      Set<Integer>set=new HashSet<>();
      func(nums,0,0,set,dp);
      int[] ans=new int[set.size()];
      int i=0;
      for(int el:set){
          ans[i]=el;
          i++;
      }
      Arrays.sort(ans);
      return ans;
   }
   void func(int[] nums,int i,int sum,Set<Integer>set,boolean[][]dp){
       if(i==nums.length){
           set.add(sum);
           return;
       }
       if(dp[i][sum]) return;
       dp[i][sum]=true;
       func(nums,i+1,sum,set,dp);
       func(nums,i+1,sum+nums[i],set,dp);
   }
}
