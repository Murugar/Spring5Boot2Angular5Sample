package com.iqmsoft.exception;


public class ResourceNotFoundException extends Exception {
	
	private static final long serialVersionUID = -257640101941307258L;

	public ResourceNotFoundException() {
		super("Resource Not found");
	}

}
