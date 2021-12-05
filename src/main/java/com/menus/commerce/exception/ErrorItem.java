package com.menus.commerce.exception;

import java.io.Serializable;

public class ErrorItem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1905122041950251207L;

	protected String field;

	protected String message;

	public ErrorItem() {
	}

	public ErrorItem(String field, String message) {
		super();
		this.field = field;
		this.message = message;

	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

}
