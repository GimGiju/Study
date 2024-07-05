package com.example.study.programmers;

public class Soultion7 {
    public int solution(int num1, int num2) {
        num1 = 2;
        num2 = 3;
        if (num1 != num2) { // num1 과 num2 가 같지 않을때
            return -1;      // -1로 리턴
        } else if (num1 == num2) {  // 만약에 num1과 num2가 동일하다면
            return 1;       //   1로 리턴
        } else {          //   그 외에 것들은
            return -1;      // 다 -1로 리턴 시킴
        }
    }
}
// 삼항연산자로 풀어볼것