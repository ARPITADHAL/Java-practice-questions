//AUTOMORPHIC NUMBER

package com.company;

import java.util.Scanner;

public class MS_class14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        double n = sc.nextDouble();
        while(n!=0){
            if ((n % 10) == ((n*n) % 10)){
                System.out.println("Automorphic");
            }else{
                System.out.println("Non Automorphic");
            }
            break;
        }
    }

}
