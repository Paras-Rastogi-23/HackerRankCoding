// In this problem, you are given N  integers.
// You need to find the maximum number of unique integers among all the possible contiguous subarrays of size M.
package com.company;
import java.util.*;

public class JavaDeque {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        Deque<Integer> list = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();

        int max=0;
        for (int i = 0; i < N; i++) {
            int item = in.nextInt();
            list.add(item);
            set.add(item);
            if(list.size()==M){
                if(set.size()>max){
                    max= set.size();
                }
                int item2 = list.remove();
                if(!list.contains(item2))set.remove(item2);
            }
        }
        System.out.println(max);

    }
}
