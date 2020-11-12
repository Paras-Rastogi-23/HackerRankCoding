package com.company;
import java.util.*;
import java.io.*;
public class BracketBalancing {
    public static void main(String[] args)throws IOException {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input=sc.next();
            Stack<Character> stacky = new Stack<>();
            for (int i = 0; i < input.length(); i++) {
                if (!stacky.isEmpty()) {
                    switch(input.charAt(i)) {
                        case '}' : if (stacky.peek() == '{') {
                            stacky.pop();
                        } break;
                        case ']' : if (stacky.peek() == '[') {
                            stacky.pop();
                        } break;
                        case ')' : if (stacky.peek() == '(') {
                            stacky.pop();
                        } break;
                        default: stacky.push(input.charAt(i));
                    }
                } else {
                    stacky.push(input.charAt(i));
                }
            }
            System.out.println(stacky.isEmpty());
        }
        sc.close();
    }
}
