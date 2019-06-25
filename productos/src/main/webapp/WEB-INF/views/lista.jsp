<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado de Productos</title>
</head>
<body>
	<h1>Lista de Productos Disponibles</h1>
	<table style="border: 1px solid; width 100%; text-align: center">
		<thead style="background: #d3dce3">
			<tr>
				<th>Id</th>
				<th>Nombre Producto</th>
				<th>Cantidad</th>
				<th>Precio</th>
				<th>Categoria</th>
				<th>Atributo</th>
				<th>Detalle</th>
			</tr>
		</thead>
		<tbody style="background: #ccc">
			<c:forEach items="${listar}" var="p">
			
			<tr>
				<th>${p.id }</th>
				<th>${p.nombre }</th>
				<th>${p.cantidad }</th>
				<th>${p.precio }</th>
				<th>${p.categoria.nombre }</th>
				<th>${p.atributo.nombre }</th>
				<th>${p.attrib }</th>
			</tr>
			</c:forEach>
	</table>
</body>
</html>
