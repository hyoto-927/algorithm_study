import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;

        for(int i = n-1; i > 0; i--){
            
            int minDiff = arr[i]-arr[i-1] ;

            if(minDiff < min){
            min = minDiff;
        }

        }
        System.out.println(min);
    }
}

