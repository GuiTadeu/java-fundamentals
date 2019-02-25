<%--
  Created by IntelliJ IDEA.
  User: guilherme
  Date: 22/02/19
  Time: 19:01
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/novaEmpresa" var="ServletNovaEmpresa" />

<html>
<head>
    <title>Title</title>
</head>
<body>

    <form action="${ServletNovaEmpresa}" method="POST">
        Nome <input type="text" name="nome">
        <input type="submit" />
    </form>

</body>
</html>
