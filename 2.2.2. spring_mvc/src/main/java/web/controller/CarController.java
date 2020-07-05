package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import service.CarServiceImpl;

import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars") // на get запрос
    public String printWelcome(ModelMap model) {
        List<Car> messages = new CarServiceImpl().getCars();
        model.addAttribute("cars", messages);
        return "cars";
    }
}