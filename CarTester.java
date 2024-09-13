import java.util.Scanner;
public class CarTester{
    Scanner s = new Scanner(System.in);
    public Car addCar(){
        System.out.println("car name:");
        String n = s.next();
        System.out.println("car miles:");
        double m = s.nextDouble();
        System.out.println("gas (gallons):");
        double g = s.nextDouble();
        return new Car(n,m,g);
    }
    public static void main(){
        CarTester g = new CarTester();
        Car a = g.addCar();
        System.out.println(a.toString());
        System.out.println("NEXT CAR");
        System.out.println("");
        Car b = g.addCar();
        System.out.println(b.toString());
    }
    /*car name:
honda
car miles:
209
gas (gallons):
10
honda averaged 20.9 m/g
NEXT CAR

car name:
batmobile
car miles:
129
gas (gallons):
12.9
batmobile averaged 10.0 m/g
*/
}

