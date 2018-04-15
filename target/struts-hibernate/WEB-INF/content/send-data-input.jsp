<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Submit this form</title>
<s:head />
</head>
<body>
<h1>PLease fill in details and click on submit button</h1>

    <s:form action="send-data">
      <s:textfield name="dataStoreBean.name" label="Full name" />
      <s:textfield name="dataStoreBean.message" label="Message" />
      <s:textfield name="dataStoreBean.email"  label ="Email"/>  
      <s:textfield name="dataStoreBean.age"  label="Age"  />
      <s:submit/>
    </s:form>

</body>
</html>