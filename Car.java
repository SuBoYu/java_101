public class Car {
    private String brand;
    private String model;
    private int year;
    private boolean isRunning;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.isRunning = false;
    }

    public void start() {
        isRunning = true;
        System.out.println(brand + " " + model + " is now running.");
    }

    public void stop() {
        isRunning = false;
        System.out.println(brand + " " + model + "has stopped.");
    }

    public void displayInfo() {
        System.out.println("Car: " + brand + " " + model + " (" + year + ")");
        System.out.println("Status: " + (isRunning ? "Running" : "Stopped"));
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2022);
        Car yourCar = new Car("Honda", "Civic", 2023);

        myCar.displayInfo();
        myCar.start();
        myCar.displayInfo();

        yourCar.displayInfo();
        yourCar.start();
        yourCar.stop();
    }
}
