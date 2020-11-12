package com.company;
import java.util.*;
import java.io.*;

class JavaMap{
    public static void main(String []args)throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(in.readLine());
        HashMap<String,Integer> map = new HashMap<>();
        while(n-- > 0){
            String s = in.readLine();
            int num = Integer.valueOf(in.readLine());
            map.put(s,num);
        }
        String str;
        while((str=in.readLine())!=null){
            if (map.containsKey(str)){
                System.out.println(str+"="+map.get(str));
            }else{
                System.out.println("Not Found");
            }
        }
        in.close();
    }
}




