<%-- 
    Document   : foreach_demo
    Created on : Jan 6, 2017, 12:32:23 AM
    Author     : Thanh Ha
--%>

<%@page import="demo.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            List<User> list=new ArrayList<User>();
            list.add(new User("A","123456"));
            list.add(new User("B","123456"));
            list.add(new User("C","123456"));
            list.add(new User("D","123456"));
            
            out.print(list.size());
        %>
        <%=list.get(0).user%>
    <c:forEach  var="i" begin="${list.get(0)}" end="${list.get(list.size()-1)}" >
        Item <c:out value="${i}"/><br>
    </c:forEach>
     
    </body>
</html>
