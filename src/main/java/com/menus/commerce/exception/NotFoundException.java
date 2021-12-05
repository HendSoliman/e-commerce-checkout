package com.menus.commerce.exception;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1905122041950251207L;

	private final List<ErrorItem> errors;

	
	public NotFoundException(List<ErrorItem> errors) {
		super();
		this.errors = errors;
	}

	public List<ErrorItem> getErrors() {
		return errors;
	}

}
