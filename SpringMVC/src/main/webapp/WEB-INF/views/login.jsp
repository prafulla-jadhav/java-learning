<html>
<head>
<title>Yahoo!!</title>
</head>
<body>
    <p><font color="red">${errorMessage}</font></p>
    <!-- form action="/login.do" method="POST"--> <!-- Requests goes to LoginServlet in com.in28minutes.jee package  -->
     <!-- <form action="/spring-mvc/login" method="POST"> -->
    <form action="/login" method="POST"> <!-- Requests goes to LoginServlet in com.in28minutes.springmvc package  -->
        Name : <input name="name" type="text" /> Password : <input name="password" type="password" /> <input type="submit" />
    </form>
</body>
</html>