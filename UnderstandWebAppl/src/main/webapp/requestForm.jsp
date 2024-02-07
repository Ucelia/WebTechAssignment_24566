<%--
  Created by IntelliJ IDEA.
  User: Celia
  Date: 2/6/2024
  Time: 12:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admission Request</title>
    <link rel="stylesheet" href="<%= request.getContextPath() %>/CSS/requestForm.css" />

</head>
<body>
<h3 id="user">${username}</h3>
<div><h2>Admission Request Form</h2></div>
<div class="container">
    <form action="<%= request.getContextPath() %>/reqForm" method="POST">
        <div class="form-columns">
            <div class="column">
                <label for="fullname">Full Name</label>
                <input type="text" id="fullname" name="fullname" required><br><br>

                <label for="email">Email</label>
                <input type="email" id="email" name="email" required><br><br>

                <label for="gender">Gender</label>
                <select id="gender" name="gender">
                    <option value="male">Male</option>
                    <option value="female">Female</option>
                </select><br><br>

                <label for="dob">Date of birth</label>
                <input type="date" id="dob" name="dob" required><br><br>

<%--                <label for="phone">Phone Number</label>--%>
<%--                <input type="number" id="phone" name="phone" required><br><br>--%>

                <label for="faculty">Faculty</label>
                <input type="text" id="faculty" name="faculty" required><br><br>

                <label for="department">Department</label>
                <input type="text" id="department" name="department" required><br><br><br>

                <input type="submit" value="Submit"><br>


                <a href="#" class="link">Already have an account? Login</a>


        </div><br>






        </div>
    </form>
</div>
</body>
</html>
