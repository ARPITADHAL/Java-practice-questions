//PRINT N FIBONACCI NUMBERS

package com.company;

public class MS_class08 {
    public static void main(String[] args) {
        int f=0,s=1,t=0,n=15;
        System.out.print(f+ " " + s);
        for (int i=2;i<n;i++){
            t=f+s;
            System.out.print(" "+t);
            f=s;
            s=t;
        }
    }
}
