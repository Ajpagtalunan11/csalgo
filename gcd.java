/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcd;

import java.util.*;
public class Gcd {

   
    public static void main(String[] args) {
            int num1, num2;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter number 1: ");
        num1 = scan.nextInt();
        System.out.print("Enter number 2: ");
        num2 = scan.nextInt();
        
        System.out.println(gcd(num1, num2));
     
    }
    
    static int gcd(int m, int n){
        if(n==0){
            return m;
        }
        else return gcd(n, m%n);
    }
    
}
