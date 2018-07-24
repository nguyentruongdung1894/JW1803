<%-- 
    Document   : updateProduct
    Created on : Jul 3, 2018, 3:11:09 PM
    Author     : ScorPius 31
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <f:form action="update.htm" modelAttribute="pro">
        <table>
            <tr>
                <td>Product Id</td>
                <td><f:input path="ProductId"/></td>
            </tr>
            <tr>
                    <td>Product Name</td>
                    <td><f:input path="ProductName"/></td>
                </tr>
                <tr>
                    <td>Price</td>
                    <td><f:input path="Price"/></td>
                </tr>
                <tr>
                    <td>Description</td>
                    <td><f:input path="ProductImage"/></td>
                </tr>
                <tr>
                    <td>Status</td>
                    <td><f:select path="ProductStatus">
                            <f:option value="true" label="Active"/>
                            <f:option value="false" label="InActive"/>
                        </f:select></td>
                </tr>
                <tr>
                    <td colspan="2" align="right">
                        <input type="submit" value="Update"/>
                        <input type="button" value="Back" onclick="history.go(-1)"/>
                    </td>
                </tr>
        </table>
    </f:form>
    </body>
</html>
