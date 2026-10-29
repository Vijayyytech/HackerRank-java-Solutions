# Java String Reverse

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Java String Reverse](https://www.hackerrank.com/challenges/java-string-reverse/problem)

## Problem Description

A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string , print `Yes` if it is a palindrome, print `No` otherwise.

**Constraints**

*  will consist at most  lower case english letters.

**Sample Input**

```
madam

```

**Sample Output**

```
Yes

```

## Examples



## Constraints



## Solution

```java
// HackerRank Problem: Java String Reverse
// Link: https://www.hackerrank.com/challenges/java-string-reverse/problem
// Difficulty: Easy
// Language: java

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        boolean palindrome = true;
        for(int i=0; i < A.length()/2; i++){
            if(A.charAt(i) != A.charAt(A.length()-1-i)){
                palindrome = false;
                break;
            }
        }
        
        if(palindrome){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
}




```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
