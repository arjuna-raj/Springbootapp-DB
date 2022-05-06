<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.controller.*" %>
        <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%List<Student> ss= (List<Student>) request.getAttribute("list"); %>
<table border="1">

<tr><th>Sid</th><th>Sname</th><th>Semail</th></tr>
<%for(Student s:ss){ %>
<tr><th><%=s.getSid() %></th><th><%=s.getName() %></th><th><%=s.getEmail() %></th></tr>
<%}%>
</table>
</body>
</html>