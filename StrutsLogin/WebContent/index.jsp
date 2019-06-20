<%@taglib prefix="s" uri = "/struts-tags"%>
<html>
<body>
<s:form method ="post" action ="ma">
<s:textfield name = "ID" label = "ID"></s:textfield>
<s:textfield name = "Password" label = "Password"></s:textfield>
<s:submit value ="login"></s:submit>
</s:form>
</body>
</html>