<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Zip Code Client</title>
</head>
<body>
<h1><%= "Zip Code Client" %>
</h1>
<br/>
<form action="AddressController" method="post">
    CEP: <input type="text" name="cep"/> <input type="submit" value="Search"/>
</form>
<h3 style="color: red">${error}</h3>
<h3 style="color: blue">${address.cep}</h3>
<h3 style="color: blue">${address.logradouro}</h3>
<h3 style="color: blue">${address.bairro}</h3>
<h3 style="color: blue">${address.uf}</h3>
</body>
</html>