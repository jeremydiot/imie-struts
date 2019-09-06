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
    <title>Gestion des clients</title>
</head>
<body>
<div>
    <h1>Gestion des clients</h1>

    <s:form method="post" action="add_client.action">
        <s:textfield name="client.login" id="client.login" label="Identifiant" labelposition="left" cssClass="input"/>
        <s:textfield name="client.pswd" id="client.pswd" label="Mot de passe" labelposition="left" cssClass="input"/>
        <s:checkbox name="client.admin" label="Administrateur"/>
        <s:submit value="Ajouter un client"/>
    </s:form>

    <table border="0" id="tableauClient" cellpadding="0" cellspacing="0">
        <tr><td><b>ID</b></td><td><b>Identifiant</b></td><td><b>Mot de passe</b></td><td><b>Administrateur</b></td><td colspan="2" align="center"><b>Gestion</b></td></tr>
        <s:iterator value="clientList" status="ligne">
            <s:if test="#ligne.odd"><tr class="ligne1"></s:if>
            <s:if test="#ligne.even"><tr class="ligne2"></s:if>
            <td><s:property value="id"/></td>
            <td><s:property value="login"/></td>
            <td><s:property value="pswd"/></td>
            <td><s:property value="admin"/></td>
            <td align="center"><a href="edit_client.action?usedId=${id}">modifier</a></td>
            <td align="center"><a href="remove_client.action?usedId=${id}">supprimer</a></td>
            </tr>
        </s:iterator>
    </table>
</div>
</body>
</html>
