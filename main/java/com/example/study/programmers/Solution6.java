package com.example.study.programmers;
import java.util.Scanner;
public class Solution6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 2 == 0){         // n을 나눴을때 나머지가 0이면 짝수 인데
            System.out.println(n + " is even");     // 짝수인 경우에 n에 " is even" 을 붙여서 출력
        }else{
            System.out.println(n + " is odd");      // 홀수인 경우에 is odd를 붙여서 출력
        }
    }
}
