import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){

                int sumAvg = 0;
                int sum = 0;

                for(int k = i; k <= j; k++){
                    sum += arr[k];
                }
                if (sum % (j - i + 1) == 0) {
                    sumAvg = sum / (j - i + 1);

                    for (int y = i; y <= j; y++) {
                        if (arr[y] == sumAvg) {
                            count++;
                            break;
        }
    }
}

            }
        }

        System.out.print(count);

        }
}