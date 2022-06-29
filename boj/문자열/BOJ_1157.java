package boj.문자열;

import java.util.Scanner;

public class BOJ_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        int[] arr= new int[26];

        for(int i = 0; i < c.length(); i++){
            if(c.charAt(i) >= 65 && c.charAt(i) <= 90) {
                arr[c.charAt(i) - 'A']++;
            }
            else if(c.charAt(i) >= 97 && c.charAt(i) <= 122){
                arr[c.charAt(i) - 'a']++;
            }
        }

        int max = 0;
        char ch = '?';

        for(int i = 0; i < 26; i++){
            if(arr[i] > max){
                max = arr[i];
                ch = (char)(i + 65);
            }
            else if(arr[i] == max){
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
