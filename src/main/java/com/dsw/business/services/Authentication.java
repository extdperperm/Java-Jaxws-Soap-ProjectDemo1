package com.dsw.business.services;

import java.util.List;
import java.util.Map;

import jakarta.xml.ws.WebServiceContext;
import jakarta.xml.ws.handler.MessageContext;

public class Authentication {
	
	//Se simula los datos de usuario y contraseña válido. En esta clase se podría implementar una gestión de seguridad
	//más evolucionada que contemple varios usuarios y cache de seguridad.
	private static String UserNameAuto = "root";
	private static String PasswordAuto = "1234";
    
    private boolean Error;
    private String msgError;
    
    private void _initializeError() {
    	this.Error = false;
    	this.msgError = "";
    }
      
    public Authentication() {
    	_initializeError();
    }

    public boolean Authenticate(WebServiceContext ctx) {
    	
    	_initializeError();
    	
    	try {
    	
		//Se accede al contexto de la aplicación (Memoria de aplicación y del cliente).
		MessageContext msgctx =	ctx.getMessageContext();
		
		//Se obtiene la cabecera http de la petición del cliente y se trata de buscar que entre los datos 
		//se encuentre el usuario y contraseña que le autorizará a la explotación de este WebServices
		@SuppressWarnings("unchecked")
		Map<String, List<String>> requestHeader = (Map<String, List<String>>) msgctx.get(MessageContext.HTTP_REQUEST_HEADERS);
		List<?> userList  = (List<?>) requestHeader.get("username");
		List<?> passwordList  = (List<?>) requestHeader.get("password");
		
		//Se comprueba si aportó la información requerida
		if ((userList != null) && (passwordList != null)) {
			String username = (String) userList.get(0);
			String password = (String) passwordList.get(0);
			
			if (username.trim().toUpperCase().equals(Authentication.UserNameAuto.trim().toUpperCase()) && password.equals(Authentication.PasswordAuto)) {
				this.Error = false;
				this.msgError = "";
			} else {
				this.Error = true;
				this.msgError = "Usuario o contraseña no válidos.";
			}
			
		} else {
			this.Error = true;
			this.msgError = "Datos de validación faltantes.";
		}
		
    	} catch(Exception ex) {
			this.Error = true;
			this.msgError = "Error no controlado en Authentication.Authenticate. +Info: " + ex.getMessage();
    	}
		
		return !this.Error;
    }

	public boolean isError() {
		return Error;
	}

	public String getMsgError() {
		return msgError;
	}


    
}
