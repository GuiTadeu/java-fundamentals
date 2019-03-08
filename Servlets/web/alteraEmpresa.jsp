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
    <form action="/sucessoAlteracao" method="POST">

        <label for="idEmpresa">ID: ${empresa.id}</label>
        <input id="idEmpresa" type="hidden" value="${empresa.id}" name="id">

        <label for="nomeEmpresa">Nome:</label>
        <input id="nomeEmpresa" type="text" value="${empresa.nome}" name="nome">

        <button type="submit">Alterar</button>
    </form>
</body>
</html>
