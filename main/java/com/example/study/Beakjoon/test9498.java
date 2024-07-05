package com.example.study.Beakjoon;
import java.util.Scanner;

public class test9498 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a score: ");
        int i = scanner.nextInt();
        char grade;

        if (i >= 90 && i <= 100) {
            grade = 'A';
        } else if (i >= 80 && i <= 89) {
            grade = 'B';
        } else if (i >= 70 && i <= 79) {
            grade = 'C';
        } else if (i >= 60 && i <= 69) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.print("Grade: " + grade);
    }
}

