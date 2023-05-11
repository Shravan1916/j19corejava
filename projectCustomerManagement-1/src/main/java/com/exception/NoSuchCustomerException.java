package com.exception;

public class NoSuchCustomerException extends RuntimeException{

	private static final long serialVersionUID =1l;
	private String message;
	
	public NoSuchCustomerException() {}
	
	public NoSuchCustomerException(String msg)
	{
		super(msg);
		this.message=msg;
	}
	
	
}
