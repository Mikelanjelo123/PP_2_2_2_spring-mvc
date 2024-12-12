package web.services;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private Car car1 = new Car("BMW", 2012, 2024);
    private Car car2 = new Car("Audi", 2012, 2023);
    private Car car3 = new Car("Mercedes", 2012, 2024);
    private Car car4 = new Car("Ford", 2012, 2025);
    private Car car5 = new Car("Honda", 2012, 2026);

    @Override
    public List getCar(int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        return cars.stream().limit(count).toList();
    }
}
