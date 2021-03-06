package com.dotcms.exception;

/**
 * This class extends from RuntimeException and implements the internationalizationExceptionSupport interface, 
 * allowing to pass a messageKey and messageArguments to translate those runtime exceptions messages into the 
 * current request locale language
 * @author oswaldogallango
 *
 */
public class BaseRuntimeInternationalizationException extends RuntimeException implements InternationalizationExceptionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final String messageKey;
	private final Object[] messageArguments;

	public BaseRuntimeInternationalizationException() {
		super();
		this.messageKey=null;
		this.messageArguments=null;
	}

	public BaseRuntimeInternationalizationException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		this.messageKey=null;
		this.messageArguments=null;
	}

	public BaseRuntimeInternationalizationException(String message, Throwable cause) {
		super(message, cause);
		this.messageKey=null;
		this.messageArguments=null;
	}

	public BaseRuntimeInternationalizationException(String message) {
		super(message);
		this.messageKey=null;
		this.messageArguments=null;
	}

	public BaseRuntimeInternationalizationException(Throwable cause) {
		super(cause);
		this.messageKey=null;
		this.messageArguments=null;
	}

	public BaseRuntimeInternationalizationException(String message, Throwable cause, String messageKey, Object... messageArguments) {
		super(message, cause);
		this.messageKey=messageKey;
		this.messageArguments=messageArguments;
	}

	public BaseRuntimeInternationalizationException(String message, String messageKey, Object... messageArguments) {
		super(message);
		this.messageKey=messageKey;
		this.messageArguments=messageArguments;
	}

	@Override
	public String getMessageKey() {
		return messageKey;
	}

	@Override
	public Object[] getMessageArguments() {
		return messageArguments;
	}


}

