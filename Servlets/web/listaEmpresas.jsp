<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%--
  Created by IntelliJ IDEA.
  User: guilherme
  Date: 22/02/19
  Time: 16:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Lista - Empresas</title>
</head>
<body>

    <a href="cadastroEmpresa.jsp">Cadastrar nova Empresa</a>

    <hr />

    Lista de empresas <br>

    <hr />

    <ul>
        <c:forEach items="${lista}" var="empresa">

            <li> ${empresa.id}   |
                 ${empresa.nome} |
                <fmt:formatDate value="${empresa.abertura}" />
                (<a href="/alteraEmpresa?id=${empresa.id}">Alterar</a> | <a href="/deletaEmpresa?id=${empresa.id}">Remover</a>)
            </li>
        </c:forEach>
    </ul>

</body>
</html>
