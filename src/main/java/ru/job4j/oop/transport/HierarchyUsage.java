package ru.job4j.oop.transport;

/**
 * 5.0. Приведение типов. Повышение типа и понижение типа. [#181322 #253560]
 */
public class HierarchyUsage {
    public static void main(String[] args) {
        Car car = new Car();
        Transport transport = car;
        Object o = car;
        Object oCar = new Car();
        Car carFromO = (Car) oCar;
        Object bicycle = new Bicycle();
        /*
         Car cb = (Car) bicycle;
         */
        System.out.println(new Car());
        System.out.println(new Bicycle());
        System.out.println(new Object());
    }
}
