package com.dsw.business.services;

import com.dsw.business.models.StudentContainerData;
import com.dsw.business.models.StudentData;

import jakarta.annotation.Resource;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.ws.WebServiceContext;

@WebService(name="Student", targetNamespace="http://services.dsw.com")
@SOAPBinding
public class Student {

    @Resource
    private WebServiceContext ctx;
    
	@WebMethod(operationName = "getStudentById")
	@WebResult(name="StudentContainer")
	public StudentContainerData getStudent(@WebParam(name = "idStudent") int id) {
		
		StudentContainerData respuesta = null;
		
		try {

			Authentication objAutentica = new Authentication();
			
			if (objAutentica.Authenticate(this.ctx)) {
				respuesta = new StudentContainerData();
				respuesta.Lista = new StudentData[1];
				respuesta.Lista[0] = new StudentData(id, "78232112L", "María del Carmen", "Lorenzo", "Batista", "12/07/1982", false, "");
				respuesta.setError(false);
				respuesta.setMsgError("");
			} else {
				respuesta = new StudentContainerData();
				respuesta.Lista = null;
				respuesta.setError(true);
				respuesta.setMsgError(objAutentica.getMsgError());
			}
		} catch (Exception ex) {
			respuesta = new StudentContainerData();
			respuesta.Lista = null;
			respuesta.setError(true);
			respuesta.setMsgError("Error no controlado en Student.getStudentById. +Info: " + ex.getMessage());
		}
		return respuesta;
		
	}
	
	@WebMethod(operationName = "getStudentList")
	@WebResult(name="StudentContainer")
	public StudentContainerData getStudent() {
		
		StudentContainerData respuesta = null;
		
		try {

			Authentication objAutentica = new Authentication();
			
			if (objAutentica.Authenticate(this.ctx)) {
				respuesta = new StudentContainerData();
				respuesta.Lista = new StudentData[6];
				respuesta.Lista[0] = new StudentData(1, "78232112L", "María del Carmen", "Lorenzo", "Batista", "12/07/1982", false, "");
				respuesta.Lista[1] = new StudentData(2, "43892334M", "Julio", "Pérez", "Hernandez", "12/07/1982", false, "");
				respuesta.Lista[2] = new StudentData(3, "03422343L", "Antonio Juan", "Rodriguez", "Marquez", "14/08/1987", false, "");
				respuesta.Lista[3] = new StudentData(4, "A8839288T", "Beatriz", "Conceptción", "Martel", "05/12/1978", false, "");
				respuesta.Lista[4] = new StudentData(5, "65338290K", "Alejandra", "Martel", "Martel", "11/01/1970", false, "");
				respuesta.Lista[5] = new StudentData(6, "42198832B", "Jorge", "Hernandez", "Bravo", "09/08/1966", false, "");
				respuesta.setError(false);
				respuesta.setMsgError("");
			} else {
				respuesta = new StudentContainerData();
				respuesta.Lista = null;
				respuesta.setError(true);
				respuesta.setMsgError(objAutentica.getMsgError());
			}
		} catch (Exception ex) {
			respuesta = new StudentContainerData();
			respuesta.Lista = null;
			respuesta.setError(true);
			respuesta.setMsgError("Error no controlado en Student.getStudentById. +Info: " + ex.getMessage());
		}
		
		return respuesta;
	}
}
