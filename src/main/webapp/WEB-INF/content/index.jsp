<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title>Wouuu</title>
  </head>
  <body>
<h1>
  Welcome to Struts2
</h1>
<h1><s:text name="greeting" /></h1>
<p><a href="<s:url action='hello'/>">Hello World</a></p>
<s:url action="send-data-input" var="dataInputLink" />
<p><a href="${dataInputLink}">Please submit form</a> for us.</p>

<hr />
<s:text name="contact" />
  </body>
</html>
