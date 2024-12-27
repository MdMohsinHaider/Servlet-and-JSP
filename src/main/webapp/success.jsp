<!DOCTYPE html>
<html>
<head>
    <title>Success</title>
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
            background-color: #f3f4f6;
        }

        .success-container {
            text-align: center;
            background: #ffffff;
            padding: 20px 40px;
            border-radius: 10px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        }

        .success-container h1 {
            color: #28a745;
            font-size: 2.5rem;
        }

        .success-container p {
            color: #555555;
            margin-top: 10px;
            font-size: 1.2rem;
        }

        .success-container a {
            display: inline-block;
            margin-top: 20px;
            padding: 10px 20px;
            font-size: 1rem;
            color: #ffffff;
            background-color: #007bff;
            text-decoration: none;
            border-radius: 5px;
            transition: background-color 0.3s ease;
        }

        .success-container a:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="success-container">
        <h1>Successful Completion</h1>
        <p>Your task has been completed successfully.</p>
        <a href="index.jsp">Go Back Home</a>
    </div>
</body>
</html>
