<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>CRUD Operations</title>
     <link rel="stylesheet" href="<%= application.getContextPath() %>/css/style.css" />
    <style>
        body {
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            font-family: Arial, sans-serif;

            color: black;

        }
        .heading {
            font-size: 32px;
            margin-bottom: 20px;
            text-align: center;
            background-color:#FAF9F6;
                        border-radius: 1px 10px;
        }
        .instructions {
            font-size: 18px;
            margin-bottom: 30px;
            text-align: center;
            max-width: 600px;
        }
        .button-container {
            text-align: center;
        }
        .button-container button {
            width: 200px;
            height: 50px;
            margin: 10px;
            font-size: 16px;
            font-weight: bold;
            cursor: pointer;
            border: none;
            border-radius: 5px;
            color: white;
            transition: transform 0.2s, box-shadow 0.2s;
        }
        .button-container button:hover {
            transform: scale(1.1);
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.3);
        }
        .button-container .create {
            background-color: green;
        }
        .button-container .create:hover {
            background-color: darkgreen;
        }
        .button-container .read {
            background-color: blue;
        }
        .button-container .read:hover {
            background-color: darkblue;
        }
        .button-container .update {
            background-color: orange;
        }
        .button-container .update:hover {
            background-color: darkorange;
        }
        .button-container .delete {
            background-color: red;
        }
        .button-container .delete:hover {
            background-color: darkred;
        }
        form{
            background-color:#FAF9F6;
            border-radius: 1px 110px;
        }
    </style>
</head>
<body>
    <div class="heading">Choose the CRUD Operation</div>
    <div class="instructions">
        <p>Welcome! This page provides options for performing CRUD (Create, Read, Update, Delete) operations on your data. Choose an operation to get started:</p>
        <ul>
            <li><strong>Create:</strong> Use this option to add new data entries.</li>
            <li><strong>Read:</strong> View existing data entries in the system.</li>
            <li><strong>Update:</strong> Modify or edit existing data entries.</li>
            <li><strong>Delete:</strong> Remove unwanted data entries from the system.</li>
        </ul>
        <p>Click the corresponding button to navigate to the respective page and perform the desired operation.</p>
    </div>
    <div class="button-container">
        <form action="insert.jsp" method="get">
            <button type="submit" class="create">Create</button>
        </form>
        <form action="read.jsp" method="get">
            <button type="submit" class="read">Read</button>
        </form>
        <form action="update.jsp" method="get">
            <button type="submit" class="update">Update</button>
        </form>
        <form action="delete.jsp" method="get">
            <button type="submit" class="delete">Delete</button>
        </form>
    </div>
</body>
</html>