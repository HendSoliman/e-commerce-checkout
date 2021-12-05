package com.menus.commerce.exception;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

public class MessageResolver implements MessageSourceAware {

	protected MessageSource messageSource;

	@Override
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public String getMessage(String key, Object... args)  {

		return messageSource.getMessage(key, args, Locale.getDefault());

	}

}
