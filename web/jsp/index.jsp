<%--
  Created by IntelliJ IDEA.
  User: jeremy
  Date: 06/09/2019
  Time: 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Authentification</title>
  </head>
  <body>
  <h2>Connexion</h2>
  <s:form method="POST" action="connexion">
    <s:textfield name="login" id="login" label="identifiant" labelposition="left"/>
    <s:textfield name="pswd" id="pswd" label="mot de passe" labelposition="left"/>
    <s:submit value="Connexion"/>
  </s:form>
  </body>
</html>
