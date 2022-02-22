package service;


import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;

@Component
public interface CarService {
    List<Car> getCarList(List<Car> carList, int count);


//    CarServiceImpl carService = new CarServiceImpl();
    //  Cannot invoke "service.CarService.getCarList(java.util.List, int)" because "this.carService" is null
    // public List<Car> getCarList(List<Car> carList, int count)


}
