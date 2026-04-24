class Vehicle {
    protected String vehicleNumber;
    protected String brand;
    protected String fuelType;

    Vehicle(String v, String b, String f) {
        vehicleNumber = v;
        brand = b;
        fuelType = f;
    }

    void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle {
    int numberOfSeats;
    boolean ACavailable;

    Car(String v, String b, String f, int s, boolean a) {
        super(v, b, f);
        numberOfSeats = s;
        ACavailable = a;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Seats: " + numberOfSeats);
        System.out.println("AC Available: " + ACavailable);
    }
}

class ElectricCar extends Car {
    double batteryCapacity;
    double chargingTime;

    ElectricCar(String v, String b, String f, int s, boolean a, double bc, double ct) {
        super(v, b, f, s, a);
        batteryCapacity = bc;
        chargingTime = ct;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity);
        System.out.println("Charging Time: " + chargingTime);
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Name : Jay");
        System.out.println("Enrollment : 240390107051");

        Vehicle v1 = new Vehicle("GJ01AB1234", "Honda", "Petrol");
        Car c1 = new Car("GJ02CD5678", "Hyundai", "Diesel", 5, true);
        ElectricCar e1 = new ElectricCar("GJ03EF9012", "Tesla", "Electric", 5, true, 75, 1.5);

        v1.displayDetails();
        System.out.println();

        c1.displayDetails();
        System.out.println();

        e1.displayDetails();
        System.out.println();

        Vehicle v = new Car("GJ04GH3456", "Maruti", "Petrol", 4, false);
        v.displayDetails();
        System.out.println();

        if (v instanceof Car) {
            Car c2 = (Car) v;
            System.out.println("Downcasting Successful");
            System.out.println("Seats: " + c2.numberOfSeats);
        }
    }
}
