<%@page import="com.sathya.servlet.ProductDao" import="java.util.Base64"%>
<%@page language="java" contentType="text/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Product List</title>
<!--  BootStrap CDN Link to Get the Support of BootStrap -->
	<link rel="stylesheet"  href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"></link> 
</head>

<body>

    <h1 class="text-success text-center"> List Of Available  Products </h1>
    
    <a href="add-product.html" class="btn btn-success">Save Product</a>
    <br>
    
    <input type="text" placeholder="Search">
    <br>
    <div>
	    <c:if test="${saveResult==1}">
	    <h2 class="text-success text-center">Data inserted successfully...</h2>
	    
	    </c:if>
    </div>
    
     <div>
	    <c:if test="${deleteResult==1}">
	    <h2 class="text-danger text-center">Data deleted successfully....</h2>
	    
	    </c:if>
    </div>
    <div>
	    <c:if test="${deleteResult==0}">
	    <h2 class="text-danger text-center">Data deleted Fail check once....</h2>
	    
	    </c:if>
    </div>
    
    <table class="table table-bordered table-striped">
	<thead class="thead-dark">
	<tr>
		<th>Product Id</th>
		<th>Product Name</th>
		<th>Product Cost</th>
		<th>Product Brand</th>
		<th>Product Made In</th>
		<th>Product Mfg Date</th>
		<th>Product Exp Date</th>
		<th>Product Image</th>
		<th>Product Audio</th>
		<th>Product Video</th>
		<th> Actions</th>
		
	</tr>
</thead>
<tbody>
	<c:forEach var="product" items="<%=new ProductDao().findAll()%>">
	<tr>
	<td>${product.proId}</td> 
	<td>${product.proName}</td> 
	<td>${product.proPrice}</td> 
	<td>${product.proBrand}</td> 
	<td>${product.proMadeIn}</td> 
	<td>${product.proMfgDate}</td> 
	<td>${product.proExpDate}</td> 
	
	<td><img src="data:image/jpeg;base64,${Base64.getEncoder().encodeToString(product.proImage)}" alt="ProductImage" style="max-width:100px; max-height:100px;"> </td>
	<td><audio controls><source src="data:audio/jpeg;base64,${Base64.getEncoder().encodeToString(product.proAudio)}" alt="ProductAudio" style="max-width:100px; max-height:100px;"></audio></td>
	<td><video controls> <source src="data:video/jpeg;base64,${Base64.getEncoder().encodeToString(product.proVideo)}" alt="ProductVideo" style="max-width:100px; max-height:100px;"> </video></td>
	
	<td>
	   <a class="btn btn-primary" href="./DeleteProductServlet?proId=${product.proId}">Delete</a>
	   <a class="btn btn-primary" href="./EditProductServlet?proId=${product.proId}">Edit</a>
	   
	
	</td>
	</tr>
	</c:forEach>
</tbody>
	</table>
</body>
</html>