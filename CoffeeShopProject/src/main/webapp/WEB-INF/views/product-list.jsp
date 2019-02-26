<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SLURM ITEMS</title>
</head>
<body>
<div class="container">
<h1>Slurm Products</h1>
<table class="table">
<thread>
<tr>
<th>Product</th><th>Description</th><th>Quantity</th><th>Price</th>
</tr>
<tbody>
<c:forEach var="product" items="${product}">
<tr>
<td><a href="/productList/${product.id}">${product.name}</a></td>
<td><${product.description}</td>
<td>${product.quantity}</td>
<td>${product.price}</td>
</tr>
</c:forEach>
</tbody>
</thread>
</table>
</div>
</body>
</html>