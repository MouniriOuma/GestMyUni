<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 27/01/2024
  Time: 02:25
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Batiment List</title>
    <!-- Include your CSS files here -->
</head>
<body>
<h2>Batiment List</h2>
<table border="1">
    <tr>
        <th>description</th>
        <th>emplacement</th>
        <th>taille</th>
        <th>fonctionnalite</th>
        <th>genre</th>
        <th>Action</th>
    </tr>
    <!-- Loop through your list of batiments and display them in the table -->
    <c:forEach items="${batiments}" var="batiment">
        <tr>
            <td>${batiment.id}</td>
            <td>${batiment.name}</td>
            <td>${batiment.description}</td>
            <!-- Add more table cells as needed -->
        </tr>
    </c:forEach>
</table>
<br>
<a href="<%=request.getContextPath()%>/batiment?action=new" class="btn btn-success">Add New Batiment</a>
<!-- Include your JavaScript files here -->
</body>
</html>
