----------------------------------------------------------------------------------------------
                             Java-Jaxws-Soap-ProjectDemo1   
                                                           
                                 Autor: Daniel Pérez                     
                                 Fecha: 11/07/2023                      
----------------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------------
Requisitos técnicos del desarrollo
----------------------------------------------------------------------------------------------

	- Versión JDK: OpenJdk (v17)
        - IDE: Eclipse 2023-06
        - org.apache.maven.archetypes: maven-archetypes-webapp
        - Tipo Proyecto: Dynamic web module, v5.0
        - Target runtime: Apache Tomcat, v10.1
	- Dependencia: jaxws-rt, v4.0.1

-----------------------------------------------------------------------------------------------
Descripción
-----------------------------------------------------------------------------------------------

Servicio SOAP implementado con la dependencia jaxws que trabaja sobre las dependencias jakarta.servlet. Este proyecto implementa la faceta Dynamic web module 5 compatible con Apache TomCat 10 y superiores.

-----------------------------------------------------------------------------------------------
Compilación y Ejecución
-----------------------------------------------------------------------------------------------

Se recomienda forzar un Maven Update, limpiar y recompilar el proyecto.

Este proyecto al ser ejecutado genera los siguientes End-points:

	http://localhost:8080/WS2-JAX-WS/ws/studentport?wsdl
	http://localhost:8080/WS2-JAX-WS/ws/teacherport?wsdl

-----------------------------------------------------------------------------------------------
Orden en el que se ha desarrollado el proyecto
-----------------------------------------------------------------------------------------------

1º Creado desde eclipse proyecto maven, seleccionando el arquetipo: org.apache.maven.archetypes: maven-archetypes-webapp
2º Modificación del fichero pom.xml
3º Modificación del fichero /src/main/webapp/WEB-INF/web.xml
4º Creación de los paquetes y clases com.dsw.business.services.Student y com.dsw.business.services.Teacher
5º Creación del fichero que configura el acceso a los end-points /src/main/webapp/WEB-INF/sun-jaxws.xml

