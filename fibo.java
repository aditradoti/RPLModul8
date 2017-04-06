/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpl;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Rpl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println("Jumlah Deret Fibonacci:");
        Scanner inputFibonacci = new Scanner(System.in);
        
        int fibonacciCount = inputFibonacci.nextInt();
        
        for (int ii=1; ii < fibonacciCount; ii++)
        {
            System.out.println("Bilangan Fibonacci: " + methodFibonacci(ii));
        }
        
    }
    
    public static int methodFibonacci(int fibonacciInput)
    {   
        int x;
        int jumlah = 0;
        int n = fibonacciInput;
        if(n <=0 || n<=1)
        {
           return n; 
        }
       
        else
        {
            return methodFibonacci(n-2) + methodFibonacci(n-1) ;
            jumlah += methodFibonacci();
        }
        
    }
    
}
