package boj.일차원배열;

import java.util.Scanner;

public class BOJ_4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] sum = new double[n];
        double[] aver = new double[n];

        for(int i = 0; i < n; i++) {
            double cnt = 0;
            int n1 = sc.nextInt();
            int[] arr = new int[n1];
            for (int j = 0; j < n1; j++) {
                arr[j] = sc.nextInt();
                sum[i] += arr[j];
            }
            aver[i] = sum[i] / n1;
            for(int k = 0; k < n1; k++) {
                if (arr[k] > aver[i]) {
                    cnt++;
                }
            }
            System.out.printf("%.3f%%\n",((cnt / n1) * 100));
        }
    }
}






        /*double[][] arr = new double[n][];
        double[] sum = new double[n];
        double[] aver = new double[n];

        for(int i = 0; i <= n - 1; i++){
            int cnt = 0;
            for(int j = 0; j < arr.length; j++){
                arr[i][j] = sc.nextInt();
                sum[i] = sum[i] + arr[i][j + 1];
                aver[i] = sum[i] / (arr[i].length - 1);
                if(arr[i][j + 1] > aver[i]){
                    cnt ++;
                }
            }
            System.out.println(((cnt / (arr[i].length - 1)) * 100) + "%");
        }
    }
}*/

