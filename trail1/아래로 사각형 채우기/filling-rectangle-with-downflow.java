import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] arr1 = new int[N][N];

        int num = 1;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                arr1[j][i] = num;
                num += 1;
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }

    }
}