package com.company;
import java.util.regex.*;
import java.util.*;
public class PatternMatcher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(Pattern.matches("[a-z&&[def]]","d"));
    }
}
