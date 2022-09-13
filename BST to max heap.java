class Solution
{
   
    public static void convertToMaxHeapUtil(Node root)
    {
        //code here
        List<Integer> list=new ArrayList<>();
        dfs(root,list);
        bfs(root,list,new int[]{0});
    }
    static void dfs(Node root,List<Integer> list){
        if(root==null){
            return;
        }
        dfs(root.left,list);
        list.add(root.data);
        dfs(root.right,list);
    }
    static void bfs(Node root,List<Integer>list,int[] i){
        if(root==null){
            return;
        }
        bfs(root.left,list,i);
        bfs(root.right,list,i);
        root.data=list.get(i[0]);
        i[0]++;
    }
}
