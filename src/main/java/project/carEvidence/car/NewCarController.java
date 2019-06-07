package project.carEvidence.car;

import java.util.Locale;

import javax.ws.rs.GET;
import javax.ws.rs.POST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import project.carEvidence.validators.NewCarValidator;

@Controller
public class NewCarController {

	@Autowired
	private CarService carService;

	@SuppressWarnings("unused")
	@Autowired
	private MessageSource messageSource;

	@GET
	@RequestMapping(value = "newcar")
	public String newCarForm(Model model) {
		model.addAttribute("car", new Car());
		return "car/newcar";
	}

	@POST
	@RequestMapping(value = "addcar")
	public String newCarAdd(Car car, BindingResult result, Model model, Locale locale) {
		Car carExist = carService.findCarByNumberPlate(car.getNumberPlate());

		new NewCarValidator().validateCarExist(carExist, result);
		new NewCarValidator().validate(car, result);
		if (result.hasErrors()) {
			return "car/newcar";
		} else {
			carService.saveCar(car);
			model.addAttribute("message", messageSource.getMessage("user.register.success", null, locale));
			model.addAttribute("car", new Car());
			return "car/newcar";
		}

	}

}
