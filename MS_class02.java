//FEET TO METER CONVERSION

package com.company;

public class MS_class02 {
    public static void main(String[] args) {
        double f = 1;
        MS_class02 t = new MS_class02();
        double x = t.convertMeter(f);
        System.out.println(x);
    }
     double convertMeter(double m){
        return m*0.305;
     }
}
