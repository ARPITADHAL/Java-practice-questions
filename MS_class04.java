//CHECKING IF A NUMBER IS EVEN OR ODD USING BITWISE OPERATORS

package com.company;

public class MS_class04 {
    public static void main(String[] args) {

        //BITWISE AND
        int m =5;
        if ((m&1) == 1){
            System.out.println("odd");
        }else{
            System.out.println("even");
        }

        //BITWISE OR
        int n =5;
        if ((n|1) > n){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }

        //BITWISE XOR
        int k =4;
        if ((k^1) < k){
            System.out.println("odd");
        }else{
            System.out.println("even");
        }

        //BITWISE SHIFT
        int l =5;
        if (((l>>1)<<1) == l){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
