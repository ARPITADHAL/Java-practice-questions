//GENERATING RANDOM NUMBERS BETWEEN A GIVEN RANGE

package com.company;

public class MS_class06 {
    public static void main(String[] args) {
        double min=100 , max=500;
        MS_class06 t = new MS_class06();
        double num = t.generateNumber(min,max);
        System.out.println(num);
    }
    double generateNumber(double MIN,double MAX){
        return (MIN + (MAX-MIN+1) * Math.random());
    }
}
