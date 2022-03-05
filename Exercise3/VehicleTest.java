import java.util.ArrayList;
import java.util.List;

public class VehicleTest {
    public static void main(String[] args){
        List<Vehicle> vehicleList = new ArrayList<>();

        Vehicle vehicle1 = new Vehicle("Dacia", "Logan", 150, 'C');
        Vehicle vehicle2 = new Vehicle("Dacia", "Sandero", 160, 'D');
        Vehicle vehicle3 = new Vehicle("Fiat", "Punto", 170, 'C');

        vehicleList.add(vehicle1);
        vehicleList.add(vehicle2);
        vehicleList.add(vehicle3);

        System.out.println("Number of created vehicles: " + vehicleList.size());

        if (vehicle1.equals(vehicle2)){
            System.out.println("Vehicles 1 and 2 are equal.");
        } else {
            System.out.println("Vehicles 1 and 2 are not equal.");
        }

        System.out.println("Modifying vehicle 2");

        vehicle2.setFuelType('C');
        vehicle2.setModel("Dacia");
        vehicle2.setType("Logan");
        vehicle2.setSpeed(150);

        if ((new Vehicle("A", "B", 100, 'C')
            .equals(new Vehicle("A", "B", 100, 'C')))){
            System.out.println("The created vehicles are equal");
        } else {
            System.out.println("The created vehicles are not equal");
        }

        System.out.println(vehicle1.toString());
        System.out.println(vehicle2.toString());
    }
}
