package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;
import service.CarServiceImpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @RequestMapping(value = "/cars")
    public String showCarsTable(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {

        Car car1 = new Car("AURUS", "BLUE", 2020);
        Car car2 = new Car("BMW", "RED", 2021);
        Car car3 = new Car("Audi", "WHITE", 2010);
        Car car4 = new Car("Mercedes", "BLACK", 2015);
        Car car5 = new Car("Huawei", "GREEN", 2019);

        List<Car> carList = new ArrayList();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);

        CarService carService = new CarServiceImpl();

        model.addAttribute("carList", carService.getCarList(carList, count));

        return "cars";
    }
}

