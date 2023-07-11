package com.dsw.business.services;

import com.dsw.business.models.TeacherData;
import com.dsw.business.models.TeacherContainerData;
import jakarta.annotation.Resource;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.ws.WebServiceContext;
 
@WebService(name="Teacher", targetNamespace="http://services.dsw.com")
@SOAPBinding
public class Teacher {

    @Resource
    private WebServiceContext ctx;
    
	@WebMethod(operationName = "getTeacherById")
	@WebResult(name="TeacherContainer")
	public TeacherContainerData getTeacher(@WebParam(name = "idTeacher") int id) {
		
		TeacherContainerData respuesta = null;
		
		try {

			Authentication objAutentica = new Authentication();
			
			if (objAutentica.Authenticate(this.ctx)) {
				respuesta = new TeacherContainerData();
				respuesta.Lista = new TeacherData[1];
				respuesta.Lista[0] = new TeacherData(id, "37652611M", "Felipe", "San Juan", "García", false, "");                                    
				respuesta.setError(false);
				respuesta.setMsgError("");
			} else {
				respuesta = new TeacherContainerData();
				respuesta.Lista = null;
				respuesta.setError(true);
				respuesta.setMsgError(objAutentica.getMsgError());
			}
		} catch (Exception ex) {
			respuesta = new TeacherContainerData();
			respuesta.Lista = null;
			respuesta.setError(true);
			respuesta.setMsgError("Error no controlado en Teacher.getTeacherById. +Info: " + ex.getMessage());
		}
		return respuesta;
		
	}
	
	@WebMethod(operationName = "getTeacherList")
	@WebResult(name="TeacherContainer")
	public TeacherContainerData getTeacher() {
		
		TeacherContainerData respuesta = null;
		
		try {

			Authentication objAutentica = new Authentication();
			
			if (objAutentica.Authenticate(this.ctx)) {
				respuesta = new TeacherContainerData();
				respuesta.Lista = new TeacherData[4];
				respuesta.Lista[0] = new TeacherData(1, "37652611M", "Felipe", "San Juan", "García", false, "");
				respuesta.Lista[1] = new TeacherData(2, "63772344A", "María Gloria", "Pérez", "Pérez", false, "");
				respuesta.Lista[2] = new TeacherData(3, "08827321L", "Adolfo", "Martín", "Suarez", false, "");
				respuesta.Lista[3] = new TeacherData(4, "44331233Y", "Goyo", "Rodriguez", "Guerra", false, "");
				respuesta.setError(false);
				respuesta.setMsgError("");
			} else {
				respuesta = new TeacherContainerData();
				respuesta.Lista = null;
				respuesta.setError(true);
				respuesta.setMsgError(objAutentica.getMsgError());
			}
		} catch (Exception ex) {
			respuesta = new TeacherContainerData();
			respuesta.Lista = null;
			respuesta.setError(true);
			respuesta.setMsgError("Error no controlado en Teacher.getTeacherList. +Info: " + ex.getMessage());
		}
		
		return respuesta;
	}
}
