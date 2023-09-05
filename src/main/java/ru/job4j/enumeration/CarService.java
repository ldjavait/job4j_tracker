package ru.job4j.enumeration;

/**
 * 12. Enum  [#504960 #375698]
 */
public class CarService {
    public static void main(String[] args) {
        Status toyota = Status.FINISHED;
        Status volvo = Status.WAITING;
        System.out.println("Статус Toyota: " + toyota);
        System.out.println("Статус Volvo: " + volvo);
        Order order = new Order(1, "Mercedes-Benz GLS", Status.IN_WORK);
        System.out.println((
                "Заказ-наряд №" + order.number() + " на автомобиль "
                        + order.car() + ", статус ремонта: "
                        + order.status().getInfo() + ", подробности: "
                        + order.status().getMessage()));
    }
}
