package com.example.DebitMicroservice.utils;

public class InsufficientAccountBalance extends RuntimeException {
	private static final long serialVersionUID = 1L;
	String message;

	public InsufficientAccountBalance(String message) {
		super(message);
		this.message = message;
	}
}
