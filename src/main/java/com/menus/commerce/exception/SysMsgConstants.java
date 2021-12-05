package com.menus.commerce.exception;

public interface SysMsgConstants {

	// Service Response
	String LOGOUT_SUCCESS ="LOGOUT_SUCCESS";
	String DATA_IS_EXIST = "DATA_IS_EXIST";
	String UPDATE_SUCCESS = "UPDATE_SUCCESS";
	String INSERT_SUCCESS = "INSERT_SUCCESS";
	String DELETE_SUCCESS = "DELETE_SUCCESS";
	String SEARCH_NO_DATA = "SEARCH_NO_DATA";
	String LOGIN_SUCCESS = "LOGIN_SUCCESS";

	// Persistence Exception - DAO
	String DATA_NO_EXIST = "DATA_NO_EXIST";
	String UPDATE_FAIL = "UPDATE_FAIL";
	String INSERT_FAIL = "INSERT_FAIL";
	String DELETE_FAIL = "DELETE_FAIL";
	String DATA_ERRORS = "DATA_ERRORS";

	// Controller - API
	String UNXPECTED_ERROR = "UNXPECTED_ERROR";
	String VALIDATION_ERROR = "VALIDATION_ERROR";

}
