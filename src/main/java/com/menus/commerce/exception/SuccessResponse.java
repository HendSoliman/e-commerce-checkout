package com.menus.commerce.exception;

import java.io.Serializable;

public class SuccessResponse implements Serializable {

	private static final long serialVersionUID = 1905122041950251207L;

	protected String message;

	public SuccessResponse() {
	}

	public SuccessResponse(String message) {
		super();

		this.message = message;

	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public static SuccessResponse creatSuccessResponse(String message) {

		return new SuccessResponse(message);
	}

}
