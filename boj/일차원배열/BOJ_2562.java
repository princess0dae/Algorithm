package boj.일차원배열;

import java.util.Scanner;

public class BOJ_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] c = new int[9];
        int count = 0;

        for(int i = 0; i <= 8; i++){
            c[i] = sc.nextInt();
        }
        int max = c[0];

        for(int i = 0; i <=8; i++){
            if(max < c[i]){
                max = c[i];
            }
        }
        for(int i = 0; i <= 8; i++){
            if(c[i] == max){
                count = i;
            }
        }
        System.out.println(max + "\n" + (count + 1));
    }
}
