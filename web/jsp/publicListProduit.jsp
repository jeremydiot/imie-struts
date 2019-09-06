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
    <h1>Liste des produits</h1>

    <table border="0" id="tableauProduit" cellpadding="0" cellspacing="0">
        <tr><td><b>ID</b></td><td><b>Nom</b></td><td><b>Prix</b></td></tr>
        <s:iterator value="produitList" status="ligne">
            <s:if test="#ligne.odd"><tr class="ligne1"></s:if>
            <s:if test="#ligne.even"><tr class="ligne2"></s:if>
            <td><s:property value="id"/></td>
            <td><s:property value="label"/></td>
            <td><s:property value="price"/></td>
            </tr>
        </s:iterator>
    </table>
</div>

</body>
</html>
