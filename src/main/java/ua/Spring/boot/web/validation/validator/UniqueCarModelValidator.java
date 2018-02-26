package ua.Spring.boot.web.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ua.Spring.boot.web.service.CarService;
import ua.Spring.boot.web.validation.anotation.UniqueCarModel;

@Component
public class UniqueCarModelValidator implements ConstraintValidator<UniqueCarModel, String>{

	@Autowired
	private CarService carService;
	
	@Override
	public void initialize(UniqueCarModel arg0) {
		
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if(value == null){ return false; }
		
		if(carService.findCarByModel(value) != null){
			return false;
		}else{
			return true;
		}
	}
	
}
