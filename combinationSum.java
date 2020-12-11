class Solution {
    List<List<Integer>> li = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        helper(candidates,target,0,new ArrayList<Integer>());
        return li;
    }

    private void helper(int[] candidates, int target,int idx,List<Integer> PathTillNow){
        

        if(target<0 ){
            return;
        }
        if(target == 0){
            li.add(new ArrayList<>(PathTillNow));
            return;
        }

        for(int i=idx;i<candidates.length;i++){
            PathTillNow.add(candidates[i]);

            helper(candidates,target-candidates[i],i,PathTillNow);

            PathTillNow.remove(PathTillNow.size() - 1);

            
        }
    }
}