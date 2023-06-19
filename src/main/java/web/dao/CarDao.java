package web.dao;

import web.model.Car;

import java.util.List;

/**
 * \* Create by Prekrasnov Sergei
 * \
 */

public interface CarDao {
    List<Car> getAllCars();

    List<Car> getCarList(int count);
}