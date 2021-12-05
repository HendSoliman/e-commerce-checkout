package com.menus.commerce.exception;

import java.util.List;

public class ViolationException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1905122041950251207L;

	private final List<ErrorItem> errors;

	public ViolationException(List<ErrorItem> errors) {
		super();
		this.errors = errors;
	}

	public List<ErrorItem> getErrors() {
		return errors;
	}

}
