import java.util.*;
public class KineticEnergy {
    public static double kineticEnergy (double mass, double velocity){
        return 0.5 * mass * velocity * velocity;
    }
    public static void main(String args[]){
        Scanner keyboard = new Scanner (System.in);

        //user input
    System.out.print("Enter the object's mass in kilograms:");
    double mass = keyboard.nextDouble();
    System.out.print("Enter its velocity in meters per second:");
    double velocity = keyboard.nextDouble();

    double ke = kineticEnergy(mass,velocity); //calling it

    System.out.printf("Kinetic Energy: %.2f J\n",ke);




    }
}
