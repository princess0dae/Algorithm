package boj.문자열;

import java.util.Scanner;

public class BOJ_2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++){
            int r = sc.nextInt();
            String c = sc.next();
            for(int j = 0; j < c.length(); j++){
                for(int k = 0; k < r; k++){
                    System.out.print(c.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
