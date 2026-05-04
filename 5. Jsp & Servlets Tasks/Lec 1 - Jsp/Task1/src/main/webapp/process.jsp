<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Form Data Received</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 50px;
            background-color: #f0f2f5;
        }
        .container {
            max-width: 600px;
            margin: auto;
            background: white;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 0 20px rgba(0,0,0,0.1);
        }
        h2 {
            text-align: center;
            color: #333;
            margin-bottom: 30px;
        }
        .data-table {
            width: 100%;
            border-collapse: collapse;
        }
        .data-table tr {
            border-bottom: 1px solid #ddd;
        }
        .data-table td {
            padding: 12px;
        }
        .label {
            font-weight: bold;
            background-color: #f8f9fa;
            width: 35%;
        }
        .value {
            color: #555;
        }
        .success {
            background-color: #d4edda;
            color: #155724;
            padding: 10px;
            border-radius: 5px;
            margin-bottom: 20px;
            text-align: center;
        }
        .back-link {
            display: inline-block;
            margin-top: 20px;
            text-align: center;
            width: 100%;
            text-decoration: none;
            background-color: #007bff;
            color: white;
            padding: 10px;
            border-radius: 5px;
        }
        .back-link:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
<div class="container">
    <h2>Submitted Form Data</h2>

    <div class="success">
        ✓ Form data received successfully!
    </div>

    <table class="data-table">
        <tr>
            <td class="label">Full Name:</td>
            <td class="value"><%= request.getParameter("fullName") != null ? request.getParameter("fullName") : "Not provided" %></td>
        </tr>
        <tr>
            <td class="label">Password:</td>
            <td class="value">
                <%= request.getParameter("password") != null ? "********" : "Not provided" %>
                <span style="font-size: 12px; color: #666;">(Hidden for security)</span>
            </td>
        </tr>
        <tr>
            <td class="label">Age:</td>
            <td class="value"><%= request.getParameter("age") != null ? request.getParameter("age") : "Not provided" %></td>
        </tr>
        <tr>
            <td class="label">Address (Radio Button):</td>
            <td class="value">
                <%
                    String addressRadio = request.getParameter("addressRadio");
                    if(addressRadio != null) {
                        out.print(addressRadio.toUpperCase());
                    } else {
                        out.print("Not selected");
                    }
                %>
            </td>
        </tr>
        <tr>
            <td class="label">Address (Select Dropdown):</td>
            <td class="value">
                <%
                    String addressSelect = request.getParameter("addressSelect");
                    if(addressSelect != null && !addressSelect.isEmpty()) {
                        out.print(addressSelect.toUpperCase());
                    } else {
                        out.print("Not selected");
                    }
                %>
            </td>
        </tr>
    </table>

    <div style="margin-top: 30px; padding: 15px; background-color: #e9ecef; border-radius: 5px;">
        <h3 style="margin-top: 0;">Additional Information:</h3>
        <p><strong>Form Method:</strong> POST</p>
        <p><strong>Submission Time:</strong> <%= new java.util.Date() %></p>
        <p><strong>Client IP:</strong> <%= request.getRemoteAddr() %></p>
    </div>

    <a href="form.jsp" class="back-link">← Back to Form</a>
</div>
</body>
</html>