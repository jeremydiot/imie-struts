<%--
  Created by IntelliJ IDEA.
  User: jeremy
  Date: 06/09/2019
  Time: 13:44
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Gestion des produits</title>
</head>
<body>


<div>
    <h1>Gestion des produits</h1>

    <s:form method="post" action="add_produit.action">
        <s:textfield name="produit.label" id="produit.label" label="Nom" labelposition="left" cssClass="input"/>
        <s:textfield name="produit.price" id="produit.price" label="Prix" labelposition="left" cssClass="input"/>
        <s:submit value="Ajouter un produit"/>
    </s:form>

    <table border="0" id="tableauProduit" cellpadding="0" cellspacing="0">
        <tr><td><b>ID</b></td><td><b>Nom</b></td><td><b>Prix</b></td><td colspan="2" align="center"><b>Gestion</b></td></tr>
        <s:iterator value="produitList" status="ligne">
            <s:if test="#ligne.odd"><tr class="ligne1"></s:if>
            <s:if test="#ligne.even"><tr class="ligne2"></s:if>
            <td><s:property value="id"/></td>
            <td><s:property value="label"/></td>
            <td><s:property value="price"/></td>
            <td align="center"><a href="edit_produit.action?usedId=${id}">modifier</a></td>
            <td align="center"><a href="remove_produit.action?usedId=${id}">supprimer</a></td>
            </tr>
        </s:iterator>
    </table>
</div>
</body>
</html>
