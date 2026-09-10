//Jacqueline CMP129 Week02 Lab 1 9/11/2026

import java.util.*;

public class FutureValue {
    public static double futureValue(double presentValue, double monthlyRate,double months){
        return presentValue * Math.pow(1 + monthlyRate,months); //calculations
        
    }
    public static void main(String [] args){
        Scanner keyboard = new Scanner (System.in);

        System.out.print("Enter the present value:");
        double presentValue = keyboard.nextDouble();

        System.out.print("Enter the monthly intreset rate (as a decimal):");
        double monthlyRate = keyboard.nextDouble();

        System.out.print("Enter the number of months:");
        double months = keyboard.nextDouble();

        double futureVal = futureValue(presentValue,monthlyRate,months);

        System.out.printf("Future Value: $%.2f\n",futureVal);

    }
}
