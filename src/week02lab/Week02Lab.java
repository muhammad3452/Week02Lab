/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week02lab;
import java.util.*;
/**
 *
 * @author muham
 */
public class Week02Lab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();
        
        System.out.println("The sum of numbers " + number1 + " and " + number2 + " is " + sum(number1, number2));
        
    }
    
    public static double sum(double number1, double number2) {
        double sumOfNo = number1 + number2;
        return sumOfNo;
    }
    
}
