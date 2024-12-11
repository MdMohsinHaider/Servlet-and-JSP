<html>
    <head>
        <meta charset="UTF-8">
        <title>Servlet and JSP</title>
        <!-- Link to external CSS -->
        <link rel="stylesheet" href="<%= application.getContextPath() %>/css/style.css" />
    </head>
    <body>
        <div class="form-container">
            <h3>User Insert Form</h3>
            <form action="userRegister" method="get">
                <label for="userId">User-Id</label><br>
                <input type="number" placeholder="Enter user id" name="userId" id="userId"><br>

                <label for="userName">User-Name</label><br>
                <input type="text" placeholder="Enter user name" name="userName" id="userName"><br>

                <label for="userEmail">User-Email</label><br>
                <input type="email" placeholder="Enter user email" name="userEmail" id="userEmail"><br>

                <label for="userDob">User-DOB</label><br>
                <input type="date" name="userDob" id="userDob"><br>

                <label>User-Gender</label><br>
                <div class="gender-container">
                    <label><input type="radio" name="gender" value="Male"> Male</label>
                    <label><input type="radio" name="gender" value="Female"> Female</label>
                </div>
                <br>
                <input type="submit" value="Register">
            </form>
        </div>
        <!-- Link to external JavaScript -->
        <script src="<%= application.getContextPath() %>/js/script.js"></script>
    </body>
</html>
