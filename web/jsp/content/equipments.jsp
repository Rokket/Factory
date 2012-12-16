<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<table class="table table-bordered">
    <html:form action="/MainAction.do?method=addEquipment" method="POST">
        <thead>
        <tr>
            <td>
                <bean:message bundle="bundleMessages" key="label.name" />
            </td>
            <td>
                <bean:message bundle="bundleMessages" key="label.factory" />
            </td>
        </tr>
        </thead>
        <tbody>
        <logic:iterate name="mainForm" property="equipments" id="equipment">
            <tr>
                <td>
                    <bean:write name="equipment" property="name"/>
                </td>
                <td>
                    <bean:write name="equipment" property="factory.name"/>
                </td>
                <td>
                    <html:link action="/MainAction.do?method=deleteEquipment&equipment.id=${equipment.id}">
                        <button>X</button>
                    </html:link>
                </td>
            </tr>
        </logic:iterate>
        <tr>
            <td>
                <html:text name="mainForm" property="equipment.name" />
            </td>
            <td>
                <html:select name="mainForm" property="equipment.factory.id">
                    <html:option value="0">
                        <bean:message bundle="bundleMessages" key="label.choose.factory" />
                    </html:option>
                    <html:optionsCollection name="mainForm" property="factories" label="name" value="id"/>
                </html:select>
            </td>
            <td>
                <html:submit>
                    <bean:message bundle="bundleMessages" key="button.add" />
                </html:submit>
            </td>
        </tr>

        </tbody>
    </html:form>
</table>