package com.menus.commerce.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @author hsoliman Common Validator.
 */
@Component
public class AbstractValidator {

	@Autowired
	protected MessageResolver messageResolver;

	public String getMessage(String key, Object... args) {
		return messageResolver.getMessage(key, args);
	}

}