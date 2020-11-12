package com.company;
import com.company.StudentData;

import java.util.*;


public class JavaPriorityQueue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        PriorityQueue<StudentData> pqueue = new PriorityQueue<>(Comparator.comparing(StudentData :: getCgpa)
                .reversed()
                .thenComparing(StudentData :: getFname)
                .thenComparing(StudentData::getId));
        while (0 < n--){
            String S,name;
            double cgpa;
            int id;
            if((S= in.next()).equals("ENTER")){
                name = in.next();
                cgpa = in.nextDouble();
                id   = in.nextInt();
                StudentData sd = new StudentData(id , name , cgpa);
                pqueue.add(sd);
            }
            else{
                 pqueue.remove(0);
            }

        }
        for(StudentData sd : pqueue){
            System.out.println(sd.getFname());
        }
    }
}
