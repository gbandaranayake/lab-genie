<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/bootstrap/css/bootstrap.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/bootstrap/css/bootstrap-grid.css"/>">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/bootstrap/css/bootstrap-reboot.css"/>">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/login.css"/>">
</head>
<title>Log in</title>

<body>
<fmt:bundle basename="messages_en_US">
    <div class="container" style="margin-top:15%">
        <div class="row">
            <div class="col-sm-6 col-md-4 col-md-offset-4">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <strong>Log In</strong>
                    </div>
                    <div class="panel-body">
                        <form role="form" action="<c:url value="j_spring_security_check" />" method="POST">
                            <fieldset>
                                <div class="row">
                                    <div class="account-wall">
                                        <img class="img-rounded profile-img"
                                             src="<c:url value="/resources/images/icon-user-default.png"/>"
                                             alt="" width="35%">
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-sm-12 col-md-10  col-md-offset-1 ">
                                        <div class="form-group">
                                            <c:if test="${not empty error}">
                                                <div class="alert-danger">${error}</div>
                                            </c:if>
                                            <c:if test="${not empty message}">
                                                <div class="alert-info">${message}</div>
                                            </c:if>
                                            <div class="input-group login">
												<span class="input-group-addon">
													<i class="glyphicon glyphicon-user"></i>
												</span>
                                                <input class="form-control" placeholder="Username" name="name"
                                                       type="text" autofocus>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="input-group login">
												<span class="input-group-addon">
													<i class="glyphicon glyphicon-lock"></i>
												</span>
                                                <input class="form-control" placeholder="Password" name="password"
                                                       type="password" value="">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <input type="submit" class="btn btn-lg btn-primary btn-block"
                                                   value="Log In">
                                        </div>
                                    </div>
                                </div>
                            </fieldset>
                        </form>
                    </div>
                    <div class="panel-footer ">
                        Forgot Password? <a href="#" onClick=""> Rest here.</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</fmt:bundle>
</body>
</html>