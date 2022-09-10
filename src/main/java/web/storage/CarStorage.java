package web.storage;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarStorage {
    private static final int CAR_COUNT = 5;
    private static final List<Car> cars;

    static {
        cars = new ArrayList<>();
        for (int i = 0; i < CAR_COUNT; i++) {
            cars.add(new Car(Brand.getName(), "X%d".formatted(i), Car.CarColor.values()[i]));
        }
    }

    public static List<Car> getCars(int count) {
        if (count < 1 || count > cars.size()) throw new IndexOutOfBoundsException(
                "Count should be [1..%d] instead of %d".formatted(cars.size(), count));
        return cars.subList(0, count);
    }

    public static List<Car> getAllCars() {
        return cars;
    }

    private enum Brand {
        AUDI, BMW, Mercedes, Honda, Toyota, Nissan;
        static String getName() {
            return Brand.values()[(int) (Math.random() * Brand.values().length)].name();
        }
    }
}
