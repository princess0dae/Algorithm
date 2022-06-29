package boj.일차원배열;

import java.util.Scanner;

public class BOJ_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] arr1 = new int[42];
        int cnt = 0;

        for(int i = 0; i < 10; i++){
            int a = sc.nextInt();
            arr[i] = a % 42;
        }
        for(int i = 0; i < arr.length; i++){
            arr1[arr[i]]++;
        }
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] != 0){
                cnt ++;
            }
        }
        System.out.println(cnt);
    }
}
