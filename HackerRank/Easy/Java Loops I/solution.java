// HackerRank Problem: Java Loops I
// Link: https://www.hackerrank.com/challenges/java-loops-i/problem
// Difficulty: Easy
// Language: java

import java.util.Scanner;
public class solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1; i<11; i++){
            System.out.println(N+" "+"x"+" "+i+" "+"="+" "+N*i);
        }
        sc.close();
    }
}
