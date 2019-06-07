package project.carEvidence.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import project.carEvidence.car.Car;
import project.carEvidence.car.mileage.Mileage;

public class NewCarMileageValidator implements Validator {

	@Override
	public boolean supports(Class<?> cls) {
		return Mileage.class.equals(cls);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		Mileage m = (Mileage) obj;

		ValidationUtils.rejectIfEmpty(errors, "startPlace", "error.userName.empty");
		ValidationUtils.rejectIfEmpty(errors, "endPlace", "error.userLastName.empty");
		ValidationUtils.rejectIfEmpty(errors, "startMileage", "error.userEmail.empty");
		ValidationUtils.rejectIfEmpty(errors, "endMileage", "error.userPassword.empty");

		if (m.getStartMileage() < 0)
			errors.rejectValue("startMileage", "error.userEmailIsNotMatch");
		
		if (m.getEndMileage() < 0)
			errors.rejectValue("endMileage", "error.userEmailIsNotMatch");
		
		if (m.getStartMileage() < m.getEndMileage())
			errors.rejectValue("endMileage", "error.userEmailIsNotMatch");
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
