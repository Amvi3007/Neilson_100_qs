package Day6;
import java.util.*;

public class rotting_oranges {

    public static int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j =0;j<grid[0].length;j++){
                if(grid[i][j] == 2){
                    q.add(new int[]{i,j});
                }
                if(grid[i][j] == 1)fresh++;
            }
        } 

        int[][] dirs = {{1,0},{0,1},{-1,0},{0,-1}};
        int time = 0;

        while(!q.isEmpty() && fresh>0){
            int n = q.size();
            for(int i = 0;i<n;i++){
                int[] arr = q.poll();
                int nr = arr[0];
                int nc = arr[1];

                for(int dir[] : dirs){
                    int r = nr + dir[0];
                    int c = nc + dir[1];

                    if(r>=0 && r<grid.length && c>=0 && c<grid[0].length && grid[r][c] == 1){
                        grid[r][c] = 2;
                        q.add(new int[]{r,c});
                        fresh--;
                    }
                }
            }
            time++;
        }

        if(fresh>0)return -1;
        return time;
    }

    public static void main(String[] args) {

        int[][] grid = {
            {2, 1, 1},
            {1, 1, 0},
            {0, 1, 1}
        };

        int ans = orangesRotting(grid);

        System.out.println("Minimum time: " + ans);
    }

}
