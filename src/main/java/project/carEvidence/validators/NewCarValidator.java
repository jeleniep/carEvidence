package project.carEvidence.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import project.carEvidence.car.Car;

public class NewCarValidator implements Validator {

	@Override
	public boolean supports(Class<?> cls) {
		return Car.class.equals(cls);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		Car c = (Car) obj;

		ValidationUtils.rejectIfEmpty(errors, "make", "error.userName.empty");
		ValidationUtils.rejectIfEmpty(errors, "model", "error.userLastName.empty");
		ValidationUtils.rejectIfEmpty(errors, "currentMileage", "error.userEmail.empty");
		ValidationUtils.rejectIfEmpty(errors, "numberPlate", "error.userPassword.empty");

		if (c.getCurrentMileage() < 0)
			errors.rejectValue("currentMileage", "error.userEmailIsNotMatch");
	}

	/*
	 * if (!u.getEmail().equals(null)) { boolean isMatch =
	 * Utils.checkEmailOrPassword(CarEvidenceConstants.EMAIL_PATTERN, u.getEmail());
	 * if(!isMatch) { errors.rejectValue("email", "error.userEmailIsNotMatch"); } }
	 * 
	 * if (!u.getPassword().equals(null)) { boolean isMatch =
	 * Utils.checkEmailOrPassword(CarEvidenceConstants.PASSWORD_PATTERN,
	 * u.getPassword()); if(!isMatch) { errors.rejectValue("password",
	 * "error.userPasswordIsNotMatch"); } }
	 */

	

	public void validateCarExist(Car car, Errors errors) {
		if (car != null) {
			errors.rejectValue("numberPlate", "error.userEmailExist");
		}
	}

}
