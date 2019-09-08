package com.onlinetutorial.udemi.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.onlinetutorial.udemi.beans.OnlineTestQuestionBean;
import com.onlinetutorial.udemi.commons.ValidationsUtils;

@Component
public class WithoutBeanValidaor implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		return  OnlineTestQuestionBean.class.equals(clazz);
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		
		OnlineTestQuestionBean onlineTestQuestionBean = (OnlineTestQuestionBean) target;
		
		if(ValidationsUtils.checkStringIsNullorEmpty(onlineTestQuestionBean.getQuestion())) {
			errors.rejectValue("optionsCount", "question.enter");
		}
	}

}
