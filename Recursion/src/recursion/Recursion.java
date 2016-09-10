/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

import java.util.*;
public class Recursion {

  
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long fact = 1, sum = 0, numIn;
        System.out.print("Enter the number : ");
        numIn = sc.nextLong();
          for (int i = 1; i <= numIn; sum += i++);
            System.out.println("Summation of " + numIn + " = " + sum);

    }
}
    
    

