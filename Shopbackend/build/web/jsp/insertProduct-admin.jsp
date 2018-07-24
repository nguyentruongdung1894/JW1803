<%-- 
    Document   : insertProduct
    Created on : Jul 3, 2018, 2:44:45 PM
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
        <f:form action="insert.htm" modelAttribute="pro" method="POST">
            <table>
             
                <tr>
                    <td>categoryId</td>
                    <td><f:input path="categoryId"/></td>
                </tr>
                <tr>
                    <td>productName</td>
                    <td><f:input path="productName"/></td>
                </tr>
                <tr>
                    <td>productImage</td>
                    <td><f:input path="productImage"/></td>
                </tr>
                <tr>
                    <td>date</td>
                    <td><f:input path="date"/></td>
                </tr>
                <tr>
                    <td>imageId</td>
                    <td><f:input path="imageId"/></td>
                </tr>
                <tr>
                    <td>quantity</td>
                    <td><f:input path="quantity"/></td>
                </tr>
                <tr>
                    <td>description</td>
                    <td><f:input path="description"/></td>
                </tr>
                <tr>
                    <td>price</td>
                    <td><f:input path="price"/></td>
                </tr>
                <tr>
                    <td>saleId</td>
                    <td><f:input path="saleId"/></td>
                </tr>
                <tr>
                    <td>view</td>
                    <td><f:input path="view"/></td>
                </tr>
                <tr>
                    <td>supplier</td>
                    <td><f:input path="supplier"/></td>
                </tr>
                
                <tr>
                    <td>Status</td>
                    <td><f:select path="status">
                            <f:option value="true" label="Active"/>
                            <f:option value="false" label="InActive"/>
                        </f:select></td>
                </tr>
                <tr>
                    <td colspan="2" align="right">
                        <input type="submit" value="Create"/>
                        <input type="reset" value="Reset"/>
                        <input type="button" value="Back" onclick="history.go(-1)"/>
                    </td>
                </tr>
            </table>
        </f:form>
    </body>
</html>
