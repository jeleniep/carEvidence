package project.carEvidence.car;

import javax.ws.rs.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import project.carEvidence.utilities.TransferObject;

@Controller
public class CarController {

	@Autowired
	private CarService carService;


	@SuppressWarnings("unused")
	@Autowired
	private MessageSource messageSource;

	@GET
	@RequestMapping(value = "car")
	public String showCarPage(Model model) {
		model.addAttribute("cars", carService.getCarList());
		return "car/car";
	}

	@GET
	@RequestMapping(value = "carmileages")
	public String showMileagesPage(@RequestParam(name = "car") int carId,  Model model) {

		Integer i = 0;
		model.addAttribute("carId", carId);
		model.addAttribute("transferObject", new TransferObject());
		model.addAttribute("numbers", carService.findCarById(carId).getMileages());
		return "car/carmileages";

	}
	


	
}
