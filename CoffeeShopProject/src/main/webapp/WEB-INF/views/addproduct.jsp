<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Adding SLURM</title>
</head>
<body>
<form action="/AddProduct" method="post">
<div class="form-group">
<label for="name">Name</label>
<input class="form-control" type = "text" id= "name" name="name" required minlength="1">
</div>
<div class="form-group">
<label for ="description">Description</label>
<input class="form-control" type="text" id="description" name="description" required minlength="1">
</div>
<div class="form-group">
<label for="quantity">Quantity</label>
<input class="form-control" type="number" id="quantity" name="quantity" required>
</div>

<div class="form-group">
<label for="price">Price</label>
<input class="form-control" type = "text" id="price" name="price" required>
</div>
<button type="submit" class=btn btn-primary" value="submit">Add Item</button>
</form>

</body>
</html>