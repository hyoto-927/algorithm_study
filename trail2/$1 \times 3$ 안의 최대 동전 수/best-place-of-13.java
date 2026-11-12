import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        }

        int max = 0;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= n-3; j++){

                int sum = 0;

                for(int x = i; x < i+1; x++){
                    for(int y = j; y < j+3; y++){
                        if(grid[x][y] == 1){
                            sum += 1;
                        }
                    }
                }

                if(sum > max){
                    max = sum;
                }

            }
        }

        System.out.print(max);
    }
}