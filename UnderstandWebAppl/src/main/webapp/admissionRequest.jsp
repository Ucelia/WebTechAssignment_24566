<%--
  Created by IntelliJ IDEA.
  User: Celia
  Date: 2/6/2024
  Time: 1:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admission Request</title>
    <link rel="stylesheet" href="<%= request.getContextPath() %>/CSS/admissionRequest.css" />
</head>
<body>
<div>
    <h3 id="user">${username}</h3>
    <h2>Student Admission Request</h2>
    <p><b>Full Name: </b> ${fullname}</p>
    <p><b>Email: </b> ${email}</p>
    <p><b>Gender: </b> ${gender}</p>
    <p><b>Date of Birth: </b> ${dob}</p>
    <p><b>Faculty: </b> ${faculty}</p>
    <p><b>Department: </b> ${department}</p>
</div>
</body>
</html>
