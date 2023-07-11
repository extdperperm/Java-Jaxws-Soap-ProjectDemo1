package com.dsw.business.models;

import java.io.Serializable;

public class StudentData implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int IdStudent;
	private String Dni;
	private String Name;
	private String FirstLastName;
	private String SecondLastName;
	private String Birthdate;
	
	private boolean Error;
	private String msgError;
	
	public StudentData() {
		this.Error = false;
		this.msgError = "";
	}

	public StudentData(int _IdStudent, String _Dni, String _Name, String _FirstLastName, String _SecondLastName, String _Birthdate, boolean _Error, String _msgError) {
		
		this.IdStudent = _IdStudent;
		this.Dni = _Dni;
		this.Name = _Name;
		this.FirstLastName = _FirstLastName;
		this.SecondLastName = _SecondLastName;
		this.Birthdate = _Birthdate;	
		this.Error = _Error;
		this.msgError = _msgError;
	}

	public int getIdStudent() {
		return IdStudent;
	}


	public void setIdStudent(int idStudent) {
		IdStudent = idStudent;
	}


	public String getDni() {
		return Dni;
	}


	public void setDni(String dni) {
		Dni = dni;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getFirstLastName() {
		return FirstLastName;
	}


	public void setFirstLastName(String firstLastName) {
		FirstLastName = firstLastName;
	}


	public String getSecondLastName() {
		return SecondLastName;
	}


	public void setSecondLastName(String secondLastName) {
		SecondLastName = secondLastName;
	}


	public String getBirthdate() {
		return Birthdate;
	}


	public void setBirthdate(String birthdate) {
		Birthdate = birthdate;
	}


	public boolean isError() {
		return Error;
	}


	public void setError(boolean error) {
		Error = error;
	}


	public String getMsgError() {
		return msgError;
	}


	public void setMsgError(String msgError) {
		this.msgError = msgError;
	}

	
	
}
