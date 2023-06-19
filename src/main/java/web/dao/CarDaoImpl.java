package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

/**
 * \* Create by Prekrasnov Sergei
 * \
 */

@Repository
public class CarDaoImpl implements CarDao {

    List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Black", "BMW", 2022));
        cars.add(new Car("White", "LADA", 1988));
        cars.add(new Car("Grey", "Skoda", 2015));
        cars.add(new Car("Blue", "Audi", 2021));
        cars.add(new Car("Green", "Jeep", 2018));
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> getCarList(int count) {
        return (count >= 0) ? cars.subList(0, Math.min(count, cars.size())) : cars;
    }
}