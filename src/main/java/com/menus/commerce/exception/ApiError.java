package com.menus.commerce.exception;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;

public class ApiError implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private HttpStatus status;
	
	private Timestamp timestamp;
	
	private String message;
	
	private List<ErrorItem> errorItems;

	private ApiError() {
		timestamp = new Timestamp(System.currentTimeMillis());
	}

	ApiError(HttpStatus status) {
		this();
		this.status = status;
	}

	ApiError(HttpStatus status, String message, Throwable ex) {
		this();
		this.status = status;
		this.message = message;
		addSubError(new ErrorItem("Data", ex.getMessage()));
	}

	void addSubError(ErrorItem subError) {
		if (errorItems == null) {
			errorItems = new ArrayList<>();
		}
		errorItems.add(subError);
	}

	HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	void setMessage(String message) {
		this.message = message;
	}

	public List<ErrorItem> getSubErrors() {
		return errorItems;
	}

	public void setErrorItems(List<ErrorItem> errorItems) {
		this.errorItems = errorItems;
	}

	public void addErrorItems(List<ErrorItem> errorItems) {
		if (this.errorItems == null) {
			this.errorItems = new ArrayList<>();
		}
		this.errorItems.addAll(errorItems);
	}

}
