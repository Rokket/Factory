<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
    <title></title>
</head>
    <body>
        <html:form action="/SizeAction.do?method=saveSize" method="POST">
            <bean:message bundle="bundleMessages" key="sizeForm.id"/><br />
            <logic:iterate name="sizeForm" property="sizes" id="size">
                <html:text name="sizeForm" property="size.id" value="${size.id}"/>
                <html:text name="sizeForm" property="size.name" value="${size.name}"/><br />
            </logic:iterate>
            <html:submit value="SUBMIT"/>
        </html:form>
    </body>
</html>