package project.carEvidence.car.mileage;

import java.util.Locale;

import javax.ws.rs.GET;
import javax.ws.rs.POST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import project.carEvidence.car.CarController;
import project.carEvidence.car.CarService;
import project.carEvidence.user.User;
import project.carEvidence.user.UserService;
import project.carEvidence.utilities.TransferObject;
import project.carEvidence.utilities.UserUtilities;

@Controller
public class CarMileageController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private CarService carService;

	@Autowired
	private MileageService mileageService;
	
	@Autowired
	private CarController carController;


	@GET
	@RequestMapping(value = "newcarmileage")
	public String newMileageForm(@RequestParam(name = "car") int carId, Model model) {
		Mileage m = new Mileage();
		m.setCarId(carId);
		model.addAttribute("mileage", m);
		model.addAttribute("carId", carId);
		return "car/newcarmileage";
	}

	@POST
	@RequestMapping(value = "editcarmileage")
	public String editMileageForm(TransferObject transferObject, @RequestParam(name = "car") int carId, Model model) {
		Mileage m = mileageService.findMileageById(transferObject.getVal());
		m.setCarId(carId);
		model.addAttribute("mileage", m);
		model.addAttribute("carId", carId);
		return "car/editcarmileage";
	}
	
	
	@POST
	@RequestMapping(value = "editmileage")
	public String editMileage(Mileage mileage, BindingResult result, Model model, Locale locale) {
		String username = UserUtilities.getLoggedUser();
		User user = userService.findUserByEmail(username);
		mileage.setUserId(user.getId());
		carService.findCarById(mileage.getCarId()).setCurrentMileage(mileage.getEndMileage());
		mileageService.updateMileage(mileage.getStartPlace(), mileage.getEndPlace(), mileage.getStartMileage(), mileage.getEndMileage(), mileage.getAttentions(), mileage.getId());		
		Mileage m = new Mileage();
		m.setCarId(mileage.getCarId());
		model.addAttribute("mileage", m);
		return carController.showMileagesPage(mileage.getCarId(), model);
	}
	
	@POST
	@RequestMapping(value = "addmileage")
	public String newMileageAdd(Mileage mileage, BindingResult result, Model model, Locale locale) {
		String username = UserUtilities.getLoggedUser();
		User user = userService.findUserByEmail(username);
		mileage.setUserId(user.getId());
		carService.findCarById(mileage.getCarId()).setCurrentMileage(mileage.getEndMileage());
		mileageService.save(mileage);
	

		return carController.showMileagesPage(mileage.getCarId(), model);
	}
	
	
	
	@POST
	@RequestMapping(value = "removemileage")
	public String removeMileages(TransferObject transferObject, Model model, @RequestAttribute(name = "rmMil", required = false) Integer mileageId) {
		int carId = 1;
		
	    if (transferObject != null )
	    {
	    	carId = mileageService.findMileageById(transferObject.getVal()).getCarId();
	    	mileageService.remove(transferObject.getVal());
	    	
	    }
	    
		
		return carController.showMileagesPage(carId, model);

	}
	

}
