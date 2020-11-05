package com.company;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.ArrayList;



class Result {

    /*
     * Complete the 'maxPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY skillLevel
     *  2. INTEGER minDiff
     */

    public static int maxPairs(List<Integer> A, int minDiff) {
        int n = A.size();
        int Pairs = 0;
        int i=0;
        Collections.sort(A);
        while(i+1 < n)
        {
            if( Math.abs(A.get(i)-A.get(i+1))<= minDiff){
                Pairs++; i+=2;
            }
            else
                i++;
        }
        return(Pairs);
    }

}

public class NiceTeam {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int skillLevelCount = in.nextInt();

        List<Integer> skillLevel = new ArrayList<>();

        for (int i = 0; i < skillLevelCount; i++) {
            int skillLevelItem = in.nextInt();
            skillLevel.add(skillLevelItem);
        }

        int minDiff = in.nextInt();

        int result = Result.maxPairs(skillLevel, minDiff);

        System.out.println(result);
    }
}
