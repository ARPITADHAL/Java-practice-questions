//CHECK IF A NUMBER IS PRIME OR NOT

package com.company;

import java.util.Scanner;

public class MS_class09 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number: ");
        double n = sc.nextDouble();
        double p = Math.sqrt(n);
        int k=0;
        if (n==0||n==1){
            System.out.println("not prime");
        }else {
            for (double i = 2; i <= p; i++) {
                if (n % i == 0) {
                    System.out.println("not prime");
                    k = 1;
                    break;
                }
            }
            if (k == 0) {
                System.out.println("prime");
            }
        }
    }
}
