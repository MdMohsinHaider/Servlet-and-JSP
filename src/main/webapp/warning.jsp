<!DOCTYPE html>
<html>
<head>
    <title>Warning</title>
    <link rel="stylesheet" href="<%= application.getContextPath() %>/css/style.css" />
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background-color: #fff3cd;
        }

        .warning-container {
            text-align: center;
            background: #ffffff;
            padding: 20px 40px;
            border-radius: 10px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        }

        .warning-container h1 {
            color: #856404;
            font-size: 2.5rem;
        }

        .warning-container p {
            color: #555555;
            margin-top: 10px;
            font-size: 1.2rem;
        }

        .warning-container a {
            display: inline-block;
            margin-top: 20px;
            padding: 10px 20px;
            font-size: 1rem;
            color: #ffffff;
            background-color: #ffcc00;
            text-decoration: none;
            border-radius: 5px;
            transition: background-color 0.3s ease;
        }

        .warning-container a:hover {
            background-color: #d4a000;
        }
    </style>
</head>
<body>
    <div class="warning-container">
        <h1>Warning</h1>
        <p>There was an issue with your request/ console. Please try again.</p>
        <a href="index.jsp">Go Back Home</a>
    </div>
</body>
</html>
