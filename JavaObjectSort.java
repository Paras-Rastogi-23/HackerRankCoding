package com.company;
import com.company.StudentData;

import java.util.*;
public class JavaObjectSort
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<StudentData> studentList = new ArrayList<>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            StudentData st = new StudentData(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

       Collections.sort(studentList,Comparator.comparing(StudentData :: getCgpa).reversed()
               .thenComparing(StudentData :: getFname)
               .thenComparing(StudentData::getId));

        for(StudentData st: studentList){
            System.out.println(st.getFname());
        }
    }
}