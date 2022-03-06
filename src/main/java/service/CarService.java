package service;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
@Component
public interface CarService {
    List<Car> getCarList(List<Car> carList, int count);
}
