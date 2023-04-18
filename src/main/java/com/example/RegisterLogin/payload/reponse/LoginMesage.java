package com.example.RegisterLogin.payload.reponse;

public class LoginMesage {

	String message;
	Boolean status;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public LoginMesage(String message, Boolean status) {
		super();
		this.message = message;
		this.status = status;
	}
	
	
	public LoginMesage()

{}
	@Override
	public String toString() {
		return "LoginMesage [message=" + message + ", status=" + status + "]";
	}
	
	
	
	}
