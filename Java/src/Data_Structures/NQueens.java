package Data_Structures;
import java.util.Scanner;

public class NQueens {
    static int[][] grid;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 4){
            System.out.println("-1");
            return;
        }
        grid = new int[n][n];
        nqueen(n, 0);
    }

    static boolean nqueen(int n, int col){
        if (col == n){
            System.out.print("[");
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(grid[i][j] == 1){
                        System.out.print((j + 1) + " ");
                    }
                }
            }
            System.out.print("]");
            return false;
        }
        for(int i = 0; i < n; i++){
            if(issafe(i, col, n)){
                grid[i][col] = 1;
                if(nqueen(n, col + 1)){
                    return true;
                }
                grid[i][col] = 0;
            }
        }
        return false;
    }

    static boolean issafe(int row, int col, int n){
        for(int i = col; i >= 0; i--){
            if(grid[row][i] == 1){
                return false;
            }
        }
        for(int i = row, j = col; i >= 0 && j >= 0; i--, j--){
            if(grid[i][j] == 1){
                return false;
            }
        }
        for(int i = row, j = col; i < n && j >= 0; i++, j--){
            if(grid[i][j] == 1){
                return false;
            }
        }
        return true;
    }
}
