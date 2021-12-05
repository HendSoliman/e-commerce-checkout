package com.menus.commerce.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import com.menus.commerce.exception.MessageResolver;
import com.menus.commerce.exception.Messages;

/**
 * Common Validator.
 */
public class AbstractValidator implements Messages {

	protected static final HttpStatus ERROR_STATUS = HttpStatus.BAD_REQUEST;

	@Autowired
	protected MessageResolver messageResolver;

	public String getMessage(String key, Object... args) {
		return messageResolver.getMessage(key, args);
	}
}