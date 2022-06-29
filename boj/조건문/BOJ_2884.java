package boj.조건문;

import java.util.Scanner;

public class BOJ_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        if(m < 45) {
            if(h == 0){
                System.out.println("23" + " " + (60 + m - 45));
            }
            else{
                System.out.println((h - 1) + " " + (60 + m - 45));
            }
        }
        else {
            System.out.print(h + " " + (m - 45));
        }
    }
}
