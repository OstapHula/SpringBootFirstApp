package ua.Spring.boot.web.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ua.Spring.boot.web.entity.Car;
import ua.Spring.boot.web.service.CarService;

@Controller
@RequestMapping("/car")
public class CarController {
	@Autowired
	private CarService carService;

	@GetMapping("/create")
	public String showAddCarForm(Model model) {
		model.addAttribute("carModel",new Car());
		return "car/create";
	}
	
	@PostMapping("/create")
	public String saveCar(@ModelAttribute("carModel") @Valid Car car, BindingResult result) {
		if(result.hasErrors()) {
			return "car/create";
		}
		carService.saveCar(car);
		return "redirect:/";
	} 
}

