<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Form submitted Successfully</title>
  </head>
  <body>
    <h3>Thank you for submitting the form.</h3>

    <p>Your registration information: <s:property value="dataStoreBean" /> </p>
	<s:text name="thankyou" />
    <p><a href="<s:url action='index' />" >Return to home page</a>.</p>
  </body>
</html>