package boj.문자열;

import java.util.Scanner;

public class BOJ_2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();
        int[] a = new int[3];
        int[] b = new int[3];
        int c = 0, d = 0;

        for(int i = 0; i < 3; i++){
            a[i] = num1.charAt(2 - i) - '0';
            b[i] = num2.charAt(2 - i) - '0';
        }

        c = a[0] * 100 + a[1] * 10 + a[2];
        d = b[0] * 100 + b[1] * 10 + b[2];

        if(c > d){
            System.out.println(c);
        }
        else if(c < d){
            System.out.println(d);
        }
    }
}
