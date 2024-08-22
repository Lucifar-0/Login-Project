<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Login Application</title>
<style type="text/css">
img{
margin-top:80px;
justify-content: center;

}
body {
    font-family: Arial, sans-serif;
    background-color: #f4f4f4;
  
    justify-content: center;
    align-items: center;
    height: 100vh;
    
   
}

.signup-container {
    background-color: #ffffff;
    padding: 20px;
    border-radius: 10px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    width: 300px;
}

.signup-container h2 {
    text-align: center;
    
}

.form-group {
    margin-bottom: 15px;
}

.form-group label {
    display: block;
    margin-bottom: 5px;
    color: #333;
}

.form-group input {
    width: 100%;
    padding: 8px;
    box-sizing: border-box;
    border-radius: 5px;
    border: 1px solid #ccc;
}

.form-group button {
    width: 100%;
    padding: 10px;
    background-color: #28a745;
    border: none;
    border-radius: 5px;
    color: #ffffff;
    font-size: 16px;
    cursor: pointer;
}

.form-group button:hover {
    background-color: #218838;
}



</style>
  <link rel="stylesheet" href="styles.css">
</head>
<body>

 <nav class="navbar">
        <ul class="nav-links">
            <li><a href="#home">Home</a></li>
            <li><a href="#login">Login</a></li>
            <li><a href="#admin-login">Admin Login</a></li>
        </ul>
    </nav>
<center>

<img alt="" src="images/loginn.png" >
<div class="signup-container">
        <h2>Sign Up</h2>
        <form action="<%=request.getContextPath() %>/abc" method="post">

            <div class="form-group">
                <label for="username">Username</label>
                <input type="text" id="username" name="name" required>
            </div>
            <div class="form-group">
                <label for="email">Email</label>
                <input type="email" id="email" name="email" required>
            </div>
            <div class="form-group">
                <label for="password">Password</label>
                <input type="password" id="password" name="password" required>
            </div>
            <div class="form-group">
                <button type="submit">Sign Up</button>
            </div>

        </form>
    </div>


</center>





</body>
</html>