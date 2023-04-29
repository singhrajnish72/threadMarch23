package threadMarch23.DSA.Graph;

public class DisjointSet {
        int[] parent;
        int[] size;
        int N;
        int extraEdjes;

        public DisjointSet(int N){
            this.parent = new int[N];
            this.size = new int[N];
            this.N = N;
            this.extraEdjes = 0;
            for(int i = 0; i < N; i++){
                 parent[i] = i;
                 size[i] = 1;
             }
        }

        public void unionBySize(int u, int v){
            int u_p = findParent(u);
            int v_p = findParent(v);
            if(u_p != v_p){
                parent[Math.max(u_p,v_p)] = parent[Math.min(u_p,v_p)];
                size[Math.min(u_p,v_p)] += 1;
            }else{
                extraEdjes++;
            }
        } 
        
        //Path compression
        public int findParent(int n){
            if(n == parent[n]){
                return n;
            }
            parent[n] = findParent(parent[n]);
            return parent[n];
        }
}