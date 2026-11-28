package Day6;
import java.util.*;

public class Matrix01 {
    public static int[][] updateMatrix(int[][] mat){
        Queue<int[]> q = new LinkedList<>();
        int[][] dis = new int[mat.length][mat[0].length];
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat[0].length;j++){
                if(mat[i][j] == 0)q.add(new int[]{i,j});
                else{
                    dis[i][j] = -1;
                }
            }
        }
        
        int[][] dir = {{-1,0},{0,-1},{1,0},{0,1}};
        while(!q.isEmpty()){
            int n = q.size();
            for(int i = 0;i<n;i++){
                int[] cur = q.poll();
                for(int[] d : dir){
                    int nr = d[0]+cur[0];
                    int nc = d[1]+cur[1];

                    if(nr<mat.length && nr>=0 && nc<mat.length && nc>=0 && dis[nr][nc] == -1){
                        dis[nr][nc] = dis[cur[0]][cur[1]]+1;
                        q.add(new int[]{nr,nc});
                    }
                }
            }
        }
        return dis;

    }
    public static void main(String[] args) {
        int[][] mat = new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        int[][] ans = updateMatrix(mat);
        for(int i = 0;i<ans.length;i++){
            for(int j = 0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
