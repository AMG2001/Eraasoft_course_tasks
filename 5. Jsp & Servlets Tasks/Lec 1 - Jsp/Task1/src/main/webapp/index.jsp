<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>JSP Function Example</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 50px;
            background-color: #f4f4f4;
        }
        .container {
            background-color: white;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 2px 10px rgba(0,0,0,0.1);
            max-width: 500px;
            margin: auto;
        }
        h1 {
            color: #333;
        }
        .result {
            background-color: #e8f4f8;
            padding: 15px;
            border-left: 4px solid #2196F3;
            margin-top: 20px;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>JSP Function Example</h1>

    <%!
        String userId = "EMP001";
        String userName = "John Doe";

        // create function
        public String concatenateIdAndName(String id, String name) {
            return "ID: " + id + " | Name: " + name + " | Combined: " + id + " - " + name;
        }
    %>

    <div class="result">
        <h3>Function Output:</h3>
        <%
            // call funct
            String result = concatenateIdAndName(userId, userName);
            out.println("<p><strong>" + result + "</strong></p>");
        %>
    </div>

    <div style="margin-top: 20px; padding: 10px; background-color: #f9f9f9; border-radius: 5px;">
        <h4>Details:</h4>
        <p>Variable ID: <%= userId %></p>
        <p>Variable Name: <%= userName %></p>
        <p>Function Called: concatenateIdAndName("<%= userId %>", "<%= userName %>")</p>
    </div>
</div>
</body>
</html>