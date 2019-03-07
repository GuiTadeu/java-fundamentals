<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: guilherme
  Date: 07/03/19
  Time: 18:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Altera Empresa</title>
</head>
<body>
    <form action="/alteraEmpresa" method="POST">

        <select name="id">
            <c:forEach items="${lista}" var="empresa">
                <option value="${empresa.id}">
                    ${empresa.id}
                </option>
            </c:forEach>
        </select>


        <label for="nomeEmpresa">Nome:</label>
        <input id="nomeEmpresa" type="text" value="novoNome">
        <button type="submit">Alterar</button>
    </form>
</body>
</html>
