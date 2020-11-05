/**
 * Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature. Try to solve this problem using Arraylist.
 * You are given "n" lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in yth position of xth line.*/

package com.company;
import java.util.*;

public class JavaArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d,q,x,y;
        ArrayList[] set = new ArrayList[n];
        for(int i=0;i<n;i++){
            d = in.nextInt();
            set[i] = new ArrayList();
            for(int j=0;j<d;j++){
                set[i].add(in.nextInt());
            }
        }
        q=in.nextInt();
        for(int i=0;i<q;i++){
            x=in.nextInt();
            y=in.nextInt();
            try{
                System.out.println(set[x-1].get(y-1));
            } catch(Exception e){
                System.out.println("ERROR!");
            }
        }
    }

}
