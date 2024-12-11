<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
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
        background: #fff176;
        color: #000;
        border: none;
        border-radius: 5px;
        padding: 10px;
        font-size: 16px;
        cursor: pointer;
        transition: background 0.3s;
    }

    input[type="submit"]:hover {
    	background: #ffcc80;
    	color: #000; /* Black text for contrast */
    }
</style>
<script>
    function validateForm() {
        const userId = document.forms["registrationForm"]["userId"].value;
        const userName = document.forms["registrationForm"]["userName"].value;
        const userEmail = document.forms["registrationForm"]["userEmail"].value;
        const userDob = document.forms["registrationForm"]["userDob"].value;
        const gender = document.forms["registrationForm"]["gender"].value;

        if (!userId) {
            alert("User ID must be filled out.");
            return false;
        }

        if (!userName || userName.length < 3) {
            alert("User Name must be at least 3 characters long.");
            return false;
        }

        const emailPattern = /^[^@\s]+@[^@\s]+\.[^@\s]+$/;
        if (!emailPattern.test(userEmail)) {
            alert("Please enter a valid email address.");
            return false;
        }

        if (!userDob) {
            alert("Please enter your date of birth.");
            return false;
        }

        if (!gender) {
            alert("Please select your gender.");
            return false;
        }

        return true;
    }
</script>
</head>
<body>
    <div class="form-container">
        <h3>Update User By user Id</h3>
        <form name="registrationForm" action="userUpdate" method="get" onsubmit="return validateForm()">
            <label>User ID</label>
            <input type="number" placeholder="Enter previous user id" name="userId">

            <label>Update Name</label>
            <input type="text" placeholder="Enter new name" name="userName">

            <label>Update Email</label>
            <input type="email" placeholder="Enter new email" name="userEmail">

            <label>Update DOB</label>
            <input type="date" name="userDob">

            <label>Update Gender</label>
            <select name="gender">
                <option value="">Select Gender</option>
                <option value="Male">Male</option>
                <option value="Female">Female</option>
            </select>
            <input type="submit" value="Update">
        </form>
    </div>
</body>
</html>
