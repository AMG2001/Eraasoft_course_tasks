<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>User Registration Form</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      margin: 50px;
      background-color: #f0f2f5;
    }
    .container {
      max-width: 500px;
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
    .form-group {
      margin-bottom: 20px;
    }
    label {
      display: block;
      margin-bottom: 5px;
      font-weight: bold;
      color: #555;
    }
    input[type="text"],
    input[type="password"],
    select {
      width: 100%;
      padding: 10px;
      border: 1px solid #ddd;
      border-radius: 5px;
      box-sizing: border-box;
      font-size: 16px;
    }
    .radio-group {
      display: flex;
      gap: 15px;
      margin-top: 5px;
    }
    .radio-group label {
      font-weight: normal;
      display: inline;
      margin-left: 5px;
    }
    input[type="submit"] {
      background-color: #4CAF50;
      color: white;
      padding: 12px 30px;
      border: none;
      border-radius: 5px;
      cursor: pointer;
      font-size: 16px;
      width: 100%;
    }
    input[type="submit"]:hover {
      background-color: #45a049;
    }
    .required {
      color: red;
    }
  </style>
</head>
<body>
<div class="container">
  <h2>User Registration Form</h2>

  <form action="process.jsp" method="post">
    <div class="form-group">
      <label>Full Name: <span class="required">*</span></label>
      <input type="text" name="fullName" required placeholder="Enter your full name">
    </div>

    <div class="form-group">
      <label>Password: <span class="required">*</span></label>
      <input type="password" name="password" required placeholder="Enter your password">
    </div>

    <div class="form-group">
      <label>Age: <span class="required">*</span></label>
      <input type="text" name="age" required placeholder="Enter your age">
    </div>

    <div class="form-group">
      <label>Address (Radio Button): <span class="required">*</span></label>
      <div class="radio-group">
        <div>
          <input type="radio" name="addressRadio" value="cairo" id="cairoRadio">
          <label for="cairoRadio">Cairo</label>
        </div>
        <div>
          <input type="radio" name="addressRadio" value="alex" id="alexRadio">
          <label for="alexRadio">Alexandria</label>
        </div>
        <div>
          <input type="radio" name="addressRadio" value="menofia" id="menofiaRadio">
          <label for="menofiaRadio">Menofia</label>
        </div>
      </div>
    </div>

    <div class="form-group">
      <label>Address (Select Dropdown): <span class="required">*</span></label>
      <select name="addressSelect" required>
        <option value="">Select your city</option>
        <option value="cairo">Cairo</option>
        <option value="alex">Alexandria</option>
        <option value="menofia">Menofia</option>
      </select>
    </div>

    <div class="form-group">
      <input type="submit" value="Submit Form">
    </div>
  </form>
</div>
</body>
</html>