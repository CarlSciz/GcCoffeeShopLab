<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Slurm Administration Console</title>
</head>
<body>

<div class="container">
<h1>Products</h1>
<table class="table">
<thread>
<tr>
<th>Product</th><th>Description</th><th>Quantity</th><th>Price</th>
</tr>
</thread>
<tbody>
<c:forEach var="product" items="${product}">
<tr>
<td><a href="/EditItem?id=${product.id}">${product.name}</a></td>
<td>${product.description}</td>
<td>${product.quantity}</td>
<td>${product.price}</td>
</tr>
</c:forEach>
</tbody>
</table>
<a href="/AddItem" class="btn btn-secondary">Add Item</a>
</div>
</body>
</html>