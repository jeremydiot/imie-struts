<%--
  Created by IntelliJ IDEA.
  User: jeremy
  Date: 06/09/2019
  Time: 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <title>Produits</title>
</head>
<body>
<div>
    <s:url action="display_produit.action" var="aProduit" />
    <s:a href="%{aProduit}">Liste des produits</s:a>

</body>
</html>
