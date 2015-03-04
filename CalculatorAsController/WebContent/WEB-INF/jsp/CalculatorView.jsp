<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="resources/mystyle.css">
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RESULTS</title>
</head>
<body>
 
<h4>Results</h4>

<form  >
		<input name="add1" type="text" size = "2" readonly value="${calculator.add1}"/>+
		<input name="add2" type="text" size = "2" readonly value="${calculator.add2}"/>=
		<input name="sum" type="text" size = "4"  readonly value="${calculator.sum}"/>
		<br> 
		<input name="add3" type="text" size = "2" readonly   value="${calculator.mult1}"/>*
		<input name="add4" type="text" size = "2" readonly   value="${calculator.mult2}"/>=
		<input name="product" type="text" size = "4" readonly value="${calculator.product}"/>
		<br>		
		 <button type=button onclick=window.location.href="Calculator">Back</button>
	</form>
</body>
</html>