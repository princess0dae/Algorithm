package boj.조건문;

import java.util.Scanner;

public class BOJ_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int h1;

        if(m + a >= 60) {
            h1 = h + ((m + a) / 60);
           if(h1 >= 24){
               System.out.println((h + ((m + a) / 60) - 24) + " " + ((m + a) % 60));
           }
           else{
               System.out.println((h + ((m + a) / 60)) + " " + ((m + a) % 60) );
           }
        }
        else{
            System.out.println((h + ((m + a) / 60)) + " " + (m + a));
        }
    }
}


