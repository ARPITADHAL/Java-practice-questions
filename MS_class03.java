//DISTANCE BETWEEN TWO POINTS

package com.company;

public class MS_class03 {
    public static void main(String[] args) {
        double x1=1, x2=2, y1=3, y2=4;
        MS_class03 t = new MS_class03();
        double dist = t.calculateDistance(x1,y1,x2,y2);
        System.out.println(dist);
    }
    double calculateDistance(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
    }
}
