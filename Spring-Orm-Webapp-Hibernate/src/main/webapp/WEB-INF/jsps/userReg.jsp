<%@ page isELIgnored="false" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Registraion Page</title>
</head>
<body>
<h2> Employee Registration Page</h2>



<form action="registerUser" method="post">
<pre>
 Enter Employee Id: <input type="text" name="empid"/><br/>
 Enter Employee FirstName: <input type="text" name="firstName"/><br/>
 Enter Employee LastName: <input type="text" name="lastName"/><br/>
 
 <input type="submit" value="register"/>
</pre>
</form>
<br/>
${result}


</body>
</html>