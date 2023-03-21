package com.validation.forms;

import javax.servlet.http.HttpServletRequest;

public class RegisterForm {
	
	private String resultat; 
	
	public String getResultat() {
		return resultat;
	}

	public void setResultat(String resultat) {
		this.resultat = resultat;
	}

	public void verificateIdentifiants(HttpServletRequest request) {
		
		String completName = request.getParameter("Nomcomplet");
		String pseudo = request.getParameter("Pseudo");
		String email = request.getParameter("Email");
		String password = request.getParameter("Password");
		String passwordConfirm = request.getParameter("ConfirmPassword");
		
		if(password.equals(passwordConfirm)) {
			resultat="Authentification reussi";
		}else {
			resultat ="Authentification échoué";
		}
		
	}

	public RegisterForm() {
		
	}
}
