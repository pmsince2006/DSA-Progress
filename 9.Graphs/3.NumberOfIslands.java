class Result {
    static int countIslands(int mat[][], int m, int n) {
        int count = 0;
        boolean vis[][] = new boolean[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (mat[i][j] == 1 && !vis[i][j]) {
                    dfs(mat, vis, i, j, m, n);
                    count++;
                }
        return count;
    }
    static void dfs(int mat[][], boolean vis[][], int r, int c, int m, int n) {
        if (r < 0 || c < 0 || r >= m || c >= n ||
            mat[r][c] == 0 || vis[r][c]) return;
        vis[r][c] = true;
        dfs(mat, vis, r + 1, c, m, n);
        dfs(mat, vis, r - 1, c, m, n);
        dfs(mat, vis, r, c + 1, m, n);
        dfs(mat, vis, r, c - 1, m, n);
    }
}
