//AREA OF A RECTANGLE(USING METHODS)

package com.company;

public class MS_class01 {
    public static void main(String[] args) {
        double l = 2, b = 3;
        MS_class01 t = new MS_class01();
        double x =  t.calculateArea(l,b);
        System.out.println(x);
    }
    double calculateArea(double L, double B){
        return L*B;
    }
}
