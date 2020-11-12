package com.company;

import java.util.BitSet;
import java.util.Scanner;

public class JavaBitset {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        BitSet b[]= new BitSet[3];
        b[1]      =b1;
        b[2]      =b2;
        while (0<m--){
            String op = in.next();
            int x     = in.nextInt();
            int y     = in.nextInt();
            switch (op){
                case "AND":
                    b[x].and(b[y]);
                    break;

                case "OR":
                    b[x].or(b[y]);
                    break;
                case "XOR":
                    b[x].xor(b[y]);
                    break;
                case "FLIP":
                    b[x].flip(y);
                    break;
                case "SET":
                    b[x].set(y);
                    break;
            }
            System.out.printf("%d %d%n",b1.cardinality(),b2.cardinality());
        }
    }
}
