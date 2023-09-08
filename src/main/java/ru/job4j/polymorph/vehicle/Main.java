package ru.job4j.polymorph.vehicle;

/**
 * 4.0. Что такое Interface. [#504946 #376743]
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("town car");
        Vehicle townCar = new TownCar();
        townCar.changeGear();
        townCar.accelerate();
        townCar.steer();
        townCar.brake();
        System.out.println("sport car");
        Vehicle sportCar = new SportCar();
        sportCar.changeGear();
        sportCar.accelerate();
        sportCar.steer();
        sportCar.brake();
        System.out.println("sport car если реализуем 2 интерфейса");
        SportCar sportCar1 = new SportCar();
        Vehicle vehicle = sportCar1;
        Fuel fuel = sportCar1;
        vehicle.changeGear();
        vehicle.accelerate();
        vehicle.steer();
        vehicle.brake();
        fuel.refill();
        System.out.println();
        Vehicle townCar1 = new TownCar();
        townCar1.changeGear();
        townCar1.accelerate();
        townCar1.steer();
        townCar1.brake();
        townCar1.refill();
        Vehicle.getDragCoefficient();
    }
}
