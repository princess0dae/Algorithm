package boj.일차원배열;

import java.util.Scanner;

public class BOJ_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float[] arr = new float[n];
        float sum = 0, aver = 0, max = 0;

        for(int i = 0; i <= n - 1; i++){
            arr[i] = sc.nextInt();
        }
        max = arr[0];

        for(int i = 0; i <= n - 1; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        for(int i = 0; i <= n - 1; i++){
            arr[i] = arr[i] / max * 100;
            sum = sum + arr[i];
        }
        aver = sum / n;
        System.out.println(aver);
    }
}
