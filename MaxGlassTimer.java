package com.company;
import java.util.*;

public class MaxGlassTimer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i,j,p=0,q,a,b,r,s,sum,max;
        int A[][] = new int[6][6];

        for (i = 0; i < 6; i++) {
            String[] arrRowItems = in.nextLine().split(" ");
            //in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                A[i][j] = arrItem;
            }
        }
//        for (i = 0; i < 6; i++) {
//            for (j = 0; j < 6; j++) {
//                System.out.print(A[i][j]+" ");
//            }
//            System.out.println();
//        }


        max=-999;
        while(p<4){
            a=p;
            q=0;
            while(q<4){
                b=q;
                r=0;
                sum=0;
                for(i=a;i<a+3;i++){
                    s=0;
                    for(j=b;j<b+3;j++){
                        if(i==a||i==a+2||(i==(a+1)&&j==(b+1))){
                            sum=sum+A[i][j];
                            s++;
                        }
                    }
                    r++;
                }
                System.out.println(sum);
                if(max<sum){
                    max=sum;

                }

                q++;
            }
            p++;
        }
        System.out.println(max);
    }
}
