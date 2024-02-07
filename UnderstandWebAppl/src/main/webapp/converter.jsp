<%--
  Created by IntelliJ IDEA.
  User: Celia
  Date: 2/6/2024
  Time: 10:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Number Converter</title>
    <link rel="stylesheet" href="<%= request.getContextPath() %>/CSS/convert.css" />
</head>
<body>
<div id="main-converter">
    <h1>Converter</h1>
    <div id="converter">
        <form action="<%= request.getContextPath() %>/conversion" method="POST">
            <div id="input">
                <label for="number">Enter Base 10 Number</label>
                <input type="number" name="number" id="number">
            </div>
            <div id="buttons">
                <button type="submit" name="btn" value="binary" id="binary">Binary</button>
                <button type="submit" name="btn" value="hexa" id="hexa">Hexa</button>
                <button type="submit" name="btn" value="octal" id="octal">Octal</button>
                <button type="reset" name="btn" value="clear" id="clear">Clear</button>
            </div>
            <p style="color: yellow"> ${requiredNumber}</p>
            <h1 style="color: black;font-size: x-large;font-weight: bold">Result</h1>
            <p> ${numberToConvert}</p>
            <p> ${convertedNumber}</p>
            <p style="color: red"> ${error}</p>
            <ul>
                <li><h2>${description}</h2></li>
            </ul>
        </form>
    </div>
</div>

</body>
</html>
