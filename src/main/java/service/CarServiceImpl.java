package service;


import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {


//    private List<Car> carsList;
//    private int count;
//
//    public CarServiceImpl(List<Car> carsList, int count) {
//        this.carsList = carsList;
//        this.count = count;
//    }


//--------

//    private CarServiceImpl carService;
//
//    public CarServiceImpl() {
//
//    }
//
//    public CarServiceImpl CarServiceImpl() {
//        return new CarServiceImpl();
//    }

//    @Autowired
//    public CarServiceImpl(CarServiceImpl carService) {
//        this.carService = carService;
//    }

//    @Autowired
//    public CarServiceImpl(CarService carService) {
//        this.carService = carService;
//    }

    //
//    public void setCarService(CarService carService) {
//        this.carService = carService;
//    }

    @Override

//    @Autowired
    public List<Car> getCarList(List<Car> carList, int count) {

        carList.add(new Car("AURUS", "BLUE", 2020));
        carList.add(new Car("BMW", "RED", 2021));
        carList.add(new Car("Audi", "WHITE", 2010));
        carList.add(new Car("Mercedes", "BLACK", 2015));
        carList.add(new Car("Huawei", "GREEN", 2019));

        if (count >= 5) {
            return carList;
        } else {
            return carList.stream().limit(count).collect(Collectors.toList());
        }
    }
}

