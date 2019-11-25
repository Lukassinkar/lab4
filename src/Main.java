import Car.Car;
import Transport.Transport;

public class Main {
    public static void main(String[] args) {
        Transport[] transports = new Transport[10];
        transports[0] = new Transport("sausumos", true, 2003);
        transports[1] = new Transport("oro", true, 2017);
        transports[2] = new Transport("vandens", false, 2019);
        transports[3] = new Transport("vandens", true, 2015);
        transports[4] = new Transport("sausumos", true, 2007);
        transports[5] = new Car("sausumos", true, 2009, "Audi", 4, false);
        transports[6] = new Car("sausumos", true, 2014, "Ferrari", 4, false);
        transports[7] = new Car("sausumos", true, 2018, "Bentley", 2, true);
        transports[8] = new Car("sausumos", true, 2018, "Tesla", 2, true);
        transports[9] = new Car("sausumos", true, 2008, "Jaguar", 2, false);

        System.out.println("Automobiliai varomi elektra:");
        for (Transport transport : transports) {
            if (transport instanceof Car) {
                Car cars = (Car) transport;

                if (cars.getPoweredByElectricity()) {
                    System.out.println(cars.getBrand());
                }
            }
        }
    }
}
