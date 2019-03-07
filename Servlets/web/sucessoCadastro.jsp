<%--
  Created by IntelliJ IDEA.
  User: guilherme
  Date: 21/02/19
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Sucesso!</title>
</head>
<body>

    <c:if test="${not empty empresa}">
        Empresa ${empresa} cadastrada com sucesso!
    </c:if>

    <c:if test="${empty empresa}">
        Nenhuma empresa cadastrada!
    </c:if>

</body>
</html>
