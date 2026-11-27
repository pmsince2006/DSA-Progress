import java.util.*;
class Main {
    static boolean dfs(ArrayList<ArrayList<Integer>> adj,
                       int src, int dest, boolean[] visited) {
        // Destination reached
        if (src == dest) {
            return true;
        }
        visited[src] = true;
        for (int neighbour : adj.get(src)) {
            if (!visited[neighbour]) {
                if (dfs(adj, neighbour, dest, visited)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();
        ArrayList<ArrayList<Integer>> adj =
            new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        // Directed edges
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
        }
        int src = sc.nextInt();
        int dest = sc.nextInt();
        boolean[] visited = new boolean[V];
        if (dfs(adj, src, dest, visited)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
