<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h3>Ingrese los datos del producto</h3>
        <form:form method="POST" action="/add" modelAttribute="employee">
             <table>
                <tr>
                    <td><form:label path="nombre">Nombre</form:label></td>
                    <td><form:input path="nombre"/></td>
                </tr>
                <tr>
                    <td><form:label path="cantidad">Cantidad</form:label></td>
                    <td><form:input path="cantidad"/></td>
                </tr>
                <tr>
                    <form:select path="categoria">
                    	<form:option value="-" label="-----Seleccione una categoria"/>
                    	<form:options items="{categoria}"/>
                    </form:select>
                </tr>
                
                <tr>
                    <form:select path="atributos">
                    	<form:option value="-" label="-----Seleccione un atributo"/>
                    	<form:options items="{atributos}"/>
                    </form:select>
                </tr>
                <tr>
                    <td><form:label path="atrib">Detalles</form:label></td>
                    <td><form:input path="atrib"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
        
    </body>
</html>