package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaHashSet {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

//Write your code here
        HashSet<String> set = new HashSet<>();
        int check =1;
        set.add(pair_left[0]+"_"+pair_right[0]);
        for (int j = 0; j < pair_left.length; j++) {
            int before_size = set.size();
            set.add(pair_left[j]+"_"+pair_right[j]);
            int after_size = set.size();
            if(before_size != after_size)
                ++check;
            System.out.println(check);
        }
   }
}
