<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/bootstrap/css/bootstrap.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/bootstrap/css/bootstrap-grid.css"/>">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/bootstrap/css/bootstrap-reboot.css"/>">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/login.css"/>">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/all.css"/>">
</head>
<title>Log in</title>
<body>
<div class="container">
    <div class="row">
        <div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
            <div class="card card-signin my-5">
                <div class="card-body">
                    <h5 class="card-title text-center">Sign In</h5>
                    <form class="form-signin" action="<c:url value="j_spring_security_check" />" method="POST">
                        <div class="form-label-group">
                            <input type="text" id="user-name" name="user-name" class="form-control" required autofocus>
                            <label for="user-name">User Name</label>
                        </div>
                        <div class="form-label-group">
                            <input type="password" name="password" id="password" class="form-control" required>
                            <label for="password">Password</label>
                        </div>
                        <div class="custom-control custom-checkbox mb-3">
                            <input type="checkbox" class="custom-control-input" name="keep-logged" id="keep-logged">
                            <label class="custom-control-label" for="keep-logged">Keep me logged in</label>
                        </div>
                        <button class="btn btn-lg btn-primary btn-block text-uppercase" type="submit">Sign in</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>