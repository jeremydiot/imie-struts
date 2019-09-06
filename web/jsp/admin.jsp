<%--
  Created by IntelliJ IDEA.
  User: jeremy
  Date: 06/09/2019
  Time: 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin</title>
</head>
<body>
    <s:url action="admin_client.action" var="aClient" />
    <s:a href="%{aClient}">Clients</s:a>
    <br />

    <s:url action="admin_produit.action" var="aProduit" />
    <s:a href="%{aProduit}">Produits</s:a>
</body>
</html>
