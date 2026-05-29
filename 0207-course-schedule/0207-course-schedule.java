class Solution {
    public boolean canFinish(int course, int[][] prerequisites) {
        List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<course;i++){
            adj.add(new ArrayList<>());
        }
        int [] indegree=new int[course];
        for(int []pre:prerequisites){
            int courses=pre[0];
            int prerequisite=pre[1];
            adj.get(prerequisite).add(courses);
            indegree[courses]++;
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<course;i++){
            if(indegree[i]==0){
                q.offer(i);
            }
        }
        int completed=0;
        while(!q.isEmpty()){
            int temp=q.poll();
            completed++;
            for(int neigh:adj.get(temp)){
                indegree[neigh]--;
                if(indegree[neigh]==0){
                    q.offer(neigh);
                }
            }
        }
        return completed==course;
    }
}