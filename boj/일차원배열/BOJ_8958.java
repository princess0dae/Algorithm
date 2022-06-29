package boj.일차원배열;

import java.util.Scanner;

public class BOJ_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = null;
        int sum;

        for(int i = 0; i <= n - 1; i++){
            str = sc.next();
            sum = 0;
            int score = 0;
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(j) == 'O'){
                    score ++;
                    sum = sum + score;
                }
                if(str.charAt(j) == 'X'){
                    score = 0;
                }
            }
            System.out.println(sum);
        }
    }
}
