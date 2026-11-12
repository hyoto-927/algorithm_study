import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        int num = 1;

        for(int i = n-1; i >= 0; i--){
            if ((n - 1 - i) % 2 == 0){
                for(int j = n - 1; j >= 0; j--){
                    arr[j][i] = num;
                    num++;
                }
            }
            else{
                for(int j = 0; j < n ; j++){
                    arr[j][i] = num;
                    num++;
                }
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}