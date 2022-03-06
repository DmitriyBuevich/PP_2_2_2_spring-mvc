package service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCarList(List<Car> carList, int count) {

        carList = new ArrayList<>();

        carList.add(new Car("LADA", "BLUE", 2020));
        carList.add(new Car("BMW", "RED", 2021));
        carList.add(new Car("Audi", "WHITE", 2010));
        carList.add(new Car("Mercedes-Bents", "BLACK", 2015));
        carList.add(new Car("Huawei", "GREEN", 2019));

        if (count >= 5) {
            return carList;
        } else {
            return carList.stream().limit(count).collect(Collectors.toList());
        }
    }
}

