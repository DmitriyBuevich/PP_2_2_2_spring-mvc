package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarServiceImpl;
import web.model.Car;


import java.util.ArrayList;
import java.util.List;

@Controller

public class CarController {


//    private CarServiceImpl carService;
//
//    public CarController(CarServiceImpl carService) {
//        this.carService = carService;
//    }

//    CarServiceImpl carService = new CarServiceImpl();

//    private List<Car> carList;
//
//    @Autowired
//    public CarController(List<Car> carList) {
//        this.carList = carList;
//
//    }



    @RequestMapping(value = "/cars")
    public String carsTable(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {


        CarServiceImpl carService = new CarServiceImpl();
        List<Car> carList = new ArrayList<>();


        model.addAttribute("carList", carService.getCarList(carList, count));

        return "cars";
    }
}

