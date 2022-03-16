//ARRANGING THREE NUMBERS IN ASCENDING ORDER

package com.company;

public class MS_class07 {
    public static void main(String[] args) {
        int a=4,b=5,c=6;
        int min = Math.min(a,Math.min(b,c));
        int max = Math.max(a,Math.max(b,c));
        int med = a + b +c - min -max;
        System.out.println(min+" "+med+" "+max);
    }
}
