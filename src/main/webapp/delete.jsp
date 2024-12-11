<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete By User Id</title>
<link rel="stylesheet" href="<%= application.getContextPath() %>/css/style.css" />
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f4f9;
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }

    h3 {
        text-align: center;
        color: #333;
    }

    .form-container {
        background: #fff;
        padding: 20px;
        border-radius: 10px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        max-width: 400px;
        width: 100%;
    }

    form {
        display: flex;
        flex-direction: column;
    }

    label {
        margin-bottom: 5px;
        font-weight: bold;
        color: #555;
    }

    input[type="text"], input[type="email"], input[type="number"], input[type="date"], select {
        margin-bottom: 15px;
        padding: 10px;
        border: 1px solid #ddd;
        border-radius: 5px;
        font-size: 14px;
    }

    input[type="submit"] {

    background: red; /* Red background */
    color: white; /* White text for contrast */

        border: none;
        border-radius: 5px;
        padding: 10px;
        font-size: 16px;
        cursor: pointer;
        transition: background 0.3s;
    }

    input[type="submit"]:hover {
        background: #red;
    }
</style>
<script>
    function validateForm() {
        const userId = document.forms["registrationForm"]["userId"].value;
        if (!userId) {
            alert("User ID must be filled out.");
            return false;
        }
        return true;
    }
</script>
</head>
<body>
    <div class="form-container">
        <h3>Delete By User Id</h3>
        <form name="registrationForm" action="userDelete" method="get" onsubmit="return validateForm()">
            <label>User ID</label>
            <input type="number" placeholder="Enter user id" name="userId">
            <input type="submit" value="DELETE">
        </form>
    </div>
</body>
</html>
