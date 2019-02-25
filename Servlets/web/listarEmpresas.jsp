<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%--
  Created by IntelliJ IDEA.
  User: guilherme
  Date: 22/02/19
  Time: 16:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lista - Empresas</title>
</head>
<body>

    Lista de empresas <br>

    <ul>
        <c:forEach items="${lista}" var="empresa">

            <li>${empresa.nome} |
                <fmt:formatDate value="${empresa.abertura}" />
            </li>
        </c:forEach>
    </ul>

</body>
</html>
