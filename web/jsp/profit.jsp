<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
    <head>
        <link href="../css/bootstrap.css" rel="stylesheet" type="text/css" />
        <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <title></title>
    </head>
    <body>
        <div class="container">
            <table class="table table-bordered">
                <html:form action="/ProfitAction.do?method=viewProfit" method="POST">
                    <thead>
                        <tr>
                            <td>Произведено</td>
                            <td>Заказано</td>
                            <td>Дата</td>
                        </tr>
                    </thead>
                    <tbody>
                        <logic:iterate name="profitForm" property="profits" id="profit">
                            <tr>
                                <td>
                                    <bean:write name="profit" property="produced" />
                                </td>
                                <td>
                                    <bean:write name="profit" property="ordered" />
                                </td>
                                <td>
                                    <bean:write name="profit" format="dd/MM/yyyy" property="date.time" />
                                </td>
                            </tr>
                        </logic:iterate>
                    </tbody>
                </html:form>
            </table>
        </div>
    </body>
</html>
