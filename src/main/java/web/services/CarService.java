package web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.controller.CarController;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class CarService {


    public List getCar(int count) {

        List<Car> cars = new ArrayList<>();
        Car car1 = new Car("BMW", 2012, 2024);
        Car car2 = new Car("Audi", 2012, 2023);
        Car car3 = new Car("Mercedes", 2012, 2024);
        Car car4 = new Car("Ford", 2012, 2025);
        Car car5 = new Car("Honda", 2012, 2026);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        return cars.stream().limit(count).toList();
    }
}
