package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.ServiceCarImpl;

@Controller
public class CarController {

    @Autowired
    private ServiceCarImpl serviceCar;

    @GetMapping(value = "/cars")
    public String showCar(@RequestParam("count") int count, Model model) {
        model.addAttribute("carList", serviceCar.getListCar(count));
        System.out.println(count);
        return "tableCar";
    }

}
