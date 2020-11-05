//program to check how many contagious sub Array having the sum less than 0 present in the array input by the user
package com.company;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.*;

public class JavaSubArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n,g,i,j,sum,count=0;
        n = in.nextInt();
        int A[] = new int[n];
        for (i = 0; i < n; i++) {
            A[i] = in.nextInt();
        }

        for (g = 1; g <= n; g++) {
            for (i = 0; i < n-g+1; i++) {
                sum=0;
                for ( j = 0; j < g; j++) {
                    sum += A[i+j];
                }
                if (sum<0)
                    count +=1;
            }
        }
        System.out.println(count);
    }
}

