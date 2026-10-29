// HackerRank Problem: Java Strings Introduction
// Link: https://www.hackerrank.com/challenges/java-strings-introduction/problem
// Difficulty: Easy
// Language: java

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length() + B.length());
        if(A.compareTo(B) > 0){ 
            System.out.println("Yes");
        }
        else{ 
            System.out.println("No");
        }
        String result1 = A.substring(0,1).toUpperCase() + A.substring(1);
        String result2 = B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(result1+" "+result2);
        
    }
}



