package boj.일차원배열;

import java.util.Scanner;

public class BOJ_2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int mul = a * b * c;
        int num = 0;
        int[] arr = new int[10];

        while(true){
            num = mul % 10;
            arr[num]++;
            mul = mul / 10;
            if(mul == 0){
                break;
            }
        }
        for(int i = 0; i <= 9; i++){
            System.out.println(arr[i]);
        }
    }
}
