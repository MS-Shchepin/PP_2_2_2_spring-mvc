package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;
import web.storage.CarStorage;

import java.util.List;
@Component
public class CarDaoImpl implements CarDao {
    @Override
    public List<Car> getCars(int count) {
        return CarStorage.getCars(count);
    }

    @Override
    public List<Car> getAllCars() {
        return CarStorage.getAllCars();
    }
}
