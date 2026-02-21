class Vehicle {

    String brand;
    int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void accelerate() {
        speed += 10;
        System.out.println(brand + " accelerated to " + speed);
    }

    public void brake() {
        speed -= 10;
        System.out.println(brand + " slowed down to " + speed);
    }
}

// Child class inheriting Vehicle
class Car extends Vehicle {

    int doors;

    public Car(String brand, int speed, int doors) {
        super(brand, speed);   // Parent constructor call
        this.doors = doors;
    }

    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Doors: " + doors);
    }
}

public class InheritanceDemo {

    public static void main(String[] args) {

        Car c = new Car("BMW", 100, 4);

        c.display();
        c.accelerate();  // Inherited method
        c.brake();       // Inherited method
    }
}