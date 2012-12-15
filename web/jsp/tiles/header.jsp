<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<div class="container">
    <html:link href="/MainAction.do?method=viewProfit">
        <button class="btn">
            <bean:message bundle="bundleMessages" key="button.profit"/>
        </button>
    </html:link>
    <html:link href="/MainAction.do?method=viewOrders">
        <button class="btn">
            <bean:message bundle="bundleMessages" key="button.orders"/>
        </button>
    </html:link>
    <html:link href="/MainAction.do?method=viewClients">
        <button class="btn">
            <bean:message bundle="bundleMessages" key="button.clients"/>
        </button>
    </html:link>
    <html:link href="/MainAction.do?method=viewEquipments">
        <button class="btn">
            <bean:message bundle="bundleMessages" key="button.equipments"/>
        </button>
    </html:link>
    <html:link href="/MainAction.do?method=viewFactories">
        <button class="btn">
            <bean:message bundle="bundleMessages" key="button.factories"/>
        </button>
    </html:link>
    <html:link href="/MainAction.do?method=viewPersonnel">
        <button class="btn">
            <bean:message bundle="bundleMessages" key="button.personnel"/>
        </button>
    </html:link>
    <html:link href="/MainAction.do?method=viewProducts">
        <button class="btn">
            <bean:message bundle="bundleMessages" key="button.products"/>
        </button>
    </html:link>
</div>