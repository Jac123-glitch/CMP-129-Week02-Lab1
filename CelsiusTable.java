import java.util.*;
public class CelsiusTable {
    public static double celsius(double fahrenheit){
        return (5.0/9.0) * (fahrenheit -32);
    }

    public static void main(String [] args){
        System.out.println("Fahrenheit\tCelsius");
        System.out.println("---------------------");

        for(int f = 0; f <=20; f++){
            double c = celsius(f);
            System.out.printf("%d\t\t%.2f\n",f,c);
        }
    }
    
}
