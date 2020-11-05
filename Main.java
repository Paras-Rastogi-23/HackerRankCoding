package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\u000C");
        int A1 = in.nextInt();
        int B1 = in.nextInt();
        int C1 = in.nextInt();
        int D1 = in.nextInt();
        int E1 = in.nextInt();
        int A2 = in.nextInt();
        int B2 = in.nextInt();
        int C2 = in.nextInt();
        int D2 = in.nextInt();
        int E2 = in.nextInt();
        int S1 = C1 + E1 + (D1*B1)/A1;
        int S2 = C2 + E2 + (D2*B2)/A2;
        if(S1<S2){
            System.out.println("petrol");
        }
        else{
            System.out.println("diesel");
        }
    }
}

