package boj.반복문;

import java.util.Scanner;

public class BOJ_1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int temp = n;

        while(true){
            temp = temp = ((temp % 10) * 10) + (((temp / 10) + (temp % 10)) % 10);
            i++;
            if(n == temp){
                System.out.println(i);
                break;
            }

        }
        /*for( ; ; ){
        temp = ((temp % 10) * 10) + (((temp / 10) + (temp % 10)) % 10);
        i++;
            if(n == temp){
                System.out.println(i);
                break;
            }*/
        }
}