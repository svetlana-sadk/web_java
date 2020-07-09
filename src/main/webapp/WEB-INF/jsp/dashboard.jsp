
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <title>Dashboard page</title>
    <meta charset="UTF-8">
</head>
<body>
<h2> ${pseudo_attribute_name} </h2>
<p> <h3>  Votre id :  ${journaliste.id} </h3> </p>
<p> <h3>  Votre nom : ${journaliste.name}  </h3> </p>
</body>
</html>