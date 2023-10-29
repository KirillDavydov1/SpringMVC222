package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl {

    private List<Car> carList = new ArrayList<>();

    public CarDaoImpl() {
        carList.add(new Car(true, "BMW", 5));
        carList.add(new Car(false, "AUDI", 3));
        carList.add(new Car(true, "Tesla", 7));
        carList.add(new Car(false, "HAVAL", 1));
        carList.add(new Car(true, "LADA SEDAN", 1));
    }

    public List<Car> getListCar(int count) {
        return carList.stream().limit(count).toList();
    }

}
