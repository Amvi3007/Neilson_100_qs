package Day6;

public class Number_of_islands {
    public static void dfs(int i, int j,boolean[][]visited,char[][]grid){
        if(i<0 || i>= grid.length || j<0 || j>=grid[0].length || visited[i][j] || grid[i][j] == '0')return;
        visited[i][j] = true;
        dfs(i-1,j,visited,grid);
        dfs(i,j-1,visited,grid);
        dfs(i+1,j,visited,grid);
        dfs(i,j+1,visited,grid);
    }

    public static int numIslands(char[][] grid){
        int count = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j]!='0' && !visited[i][j]){
                    count++;
                    dfs(i, j, visited, grid);
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        char[][] grid = new char[][]{{'1', '1', '0', '0', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '1', '0', '0'}, {'0', '0', '0', '1', '1'}};
        System.out.print(numIslands(grid));
    }
}
