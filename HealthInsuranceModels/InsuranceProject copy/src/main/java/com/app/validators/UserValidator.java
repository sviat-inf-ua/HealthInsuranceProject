package com.app.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.app.models.Customer;
@Component
public class UserValidator implements Validator {

	@Override
	public boolean supports(Class<?> customer) {
		
		return Customer.class.isAssignableFrom(customer);
	}

	@Override
	public void validate(Object target, Errors error) {
		
			Customer customer = (Customer)target;
			ValidationUtils.rejectIfEmpty(error, "fname", "", "First Name is required");
			if(customer.getPswd().length() < 8) {
				error.rejectValue("pswd", "Password must contain at least 8 characters");
			}
	}

}
