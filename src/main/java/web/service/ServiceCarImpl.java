package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

@Component
public class ServiceCarImpl implements ServiceCar {

    @Autowired
    private CarDaoImpl carDao;

    @Override
    public List<Car> getListCar(int count) {
        return carDao.getListCar(count);
    }


}
