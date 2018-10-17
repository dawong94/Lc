class Solution {
    public boolean validTree(int n, int[][] edges) {
        if (n==0) return false;
        if(edges.length != n-1) return false;
        Map<Integer, Set<Integer>> graph = makeGraph(n,edges);
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(0);
        boolean[] visited = new boolean[n];
        visited[0] = true;
        while(!queue.isEmpty()) {
            int curr = queue.poll();
            n--;
            for(Integer next : graph.get(curr)) {
                if(visited[next]) {
                    return false;
                }
                graph.get(next).remove(curr);
                queue.add(next);
                visited[next] = true;
            }
            
        }
        
        return n== 0;
    }
    
    public Map<Integer, Set<Integer>> makeGraph(int n, int[][]edges){
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for (int i =0;i< n;i++){
            graph.put(i,new HashSet<>());         
        }
        for (int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            graph.get(u).add(v);
            graph.get(v).add(u);
            
        }
        
        return graph;
    }
}