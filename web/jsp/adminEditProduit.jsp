<%--
  Created by IntelliJ IDEA.
  User: jeremy
  Date: 06/09/2019
  Time: 14:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Modifier un produit</title>
</head>
<body>
    <div>
        <h1>Gestion des produits</h1>
        <s:form method="post" action="modify_produit.action">
            <s:textfield name="produit.label" id="produit.label" label="Nom" labelposition="left" cssClass="input"/>
            <s:textfield name="produit.price" id="produit.price" label="Prix" labelposition="left" cssClass="input"/>
            <s:submit value="Modifier le produit"/>
        </s:form>
    </div>
</body>
</html>
