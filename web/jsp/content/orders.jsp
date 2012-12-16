<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<table class="table table-bordered">
    <html:form action="/MainAction.do?method=viewProfit" method="POST">
        <thead>
        <tr>
            <td>
                <bean:message bundle="bundleMessages" key="label.lastname" />
            </td>
            <td>
                <bean:message bundle="bundleMessages" key="label.date" />
            </td>
        </tr>
        </thead>
        <tbody>
        <logic:iterate name="mainForm" property="orders" id="order">
            <tr>
                <td>
                    <bean:write name="order" property="client.lastName"/>
                </td>
                <td>
                    <bean:write name="order" property="date" format="dd/MM/yyyy"/>
                </td>
            </tr>
        </logic:iterate>
        </tbody>
    </html:form>
</table>