<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<%@ page contentType="text/html;charset=UTF-8" %>
<fmt:bundle basename="messages_en_US">
    <header>
    <nav class="navbar navbar-inverse navbar-fixed-top">
        <div class="container">
            <div class="row">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                            aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="<c:url value="/lab.html" />">Lab Genie</a>
                </div>

                <div id="navbar" class="navbar-collapse collapse">
                    <ul class="nav navbar-nav pull-right">
                        <li><a href="<c:url value="/lab.html" />">Laboratory View</a></li>
                        <li><a href="<c:url value="/users/manage.html" />">Upload New Instruments</a></li>
                        <li><a href="<c:url value="/instances/manage.html" />">View Reports</a></li>
                        <li><a href="<c:url value="/j_spring_security_logout" />">Log Out</a></li>
                    </ul>
                </div>
            </div>
            <div class="row">
                <p class="navbar-text pull-right">
                        Welcome,  <sec:authorize access="isAuthenticated()"><sec:authentication property="principal.username"/></sec:authorize>
                </p>
            </div>
            <!--/.nav-collapse -->
        </div>
    </nav>
    </header>
</fmt:bundle>
