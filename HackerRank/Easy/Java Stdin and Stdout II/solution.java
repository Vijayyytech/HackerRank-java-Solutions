// HackerRank Problem: Java Stdin and Stdout II
// Link: https://www.hackerrank.com/challenges/java-stdin-stdout/problem
// Difficulty: Easy
// Language: java

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        sc.nextLine();
        double d = sc.nextDouble();
        sc.nextLine();
        String s = sc.nextLine();
        
        System.out.println("String: " +s);
        System.out.println("Double: " +d);
        System.out.println("Int: " +i); 
    }
}
