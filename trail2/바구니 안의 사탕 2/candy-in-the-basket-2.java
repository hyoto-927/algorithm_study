import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int K = sc.nextInt();
        
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int max = 0;

        for(int i = 0; i < n; i++){
            
            if(max < arr[i][1]){
                max = arr[i][1];
            }
        }

        int[] blank = new int[max+1];

        for(int i = 0; i < n; i++){
            blank[arr[i][1]] += arr[i][0];
        }

        // 중심 위치를 이동하며 사탕 개수 계산
        int ans = 0;

        for (int i = 0; i <= max; i++) {

            int sum = 0;

            for (int j = i - K; j <= i + K; j++) {

                if (j >= 0 && j <= max) {
                    sum += blank[j];
                }
            }

            ans = Math.max(ans, sum);
        }

        // 정답 출력
        System.out.println(ans);

    }
}