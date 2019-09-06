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
    <title>Modifier un client</title>
</head>
<body>
    <div>
        <h1>Gestion des clients</h1>
        <s:form method="post" action="modify_client.action">
            <s:textfield name="client.login" id="client.login" label="Identifiant" labelposition="left" cssClass="input"/>
            <s:textfield name="client.pswd" id="client.pswd" label="Mot de passe" labelposition="left" cssClass="input"/>
            <s:checkbox name="client.admin" label="Administrateur"/>
            <s:submit value="Modifier le client"/>
        </s:form>
    </div>
</body>
</html>
