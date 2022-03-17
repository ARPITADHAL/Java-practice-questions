//REVERSE OF A NUMBER

package com.company;

import java.util.Scanner;

public class MS_class15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int reversenum = 0;
        while(num!=0){
            int n = num % 10;
            reversenum = reversenum * 10 + n;
            num/=10;
        }
        System.out.print("The reversed number is: " + reversenum);
    }
}
