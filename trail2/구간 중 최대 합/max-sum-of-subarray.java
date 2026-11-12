import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int max = 0;

        for(int i = 0; i <= n-k; i++){

            int sum = 0;

            for(int x = i; x < i+k; x++){
                sum += arr[x];
            }

            if(max < sum){
                max = sum;
            }

        }

        System.out.print(max);
    }
}