<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: gayan
  Date: 7/11/16
  Time: 2:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/bootstrap/css/bootstrap.css"/>"/>
    <link rel="stylesheet" type="text/css"
          href="<c:url value="/resources/bootstrap/css/bootstrap-theme.css.map"/>">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/dashboard.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/bootstrap/css/bootstrap-theme.css"/>">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/login.css"/>">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/jquery.datetimepicker.min.css"/>">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/main.css"/>">
    <script src="<c:url value="/resources/javascript/d3.js"/> "></script>
    <script src="<c:url value="/resources/javascript/jquery-1.11.2.js"/> "></script>
    <script src="<c:url value="/resources/javascript/jquery.datetimepicker.full.min.js"/> "></script>
    <script src="<c:url value="/resources/javascript/components/dashboard.js"/> "></script>
</head>
<title>Dash Board</title>
<body>
<jsp:include page="header.jsp"/>
<div id="content" class="content"></div>

<div class="popup">
    <div class="header">
        <div class="header-content">Start Cloud Instance</div>
        <div class="close-icon"><i class="fa fa-close"></i> </div>
    </div>
    <div class="body">
        <div class="body-content">

            <form>
                <div class="form-group">
                    <div class="control-group">
                <div class="radio-inline">
                    <label class="radio-inline control-label"><input type="radio" class="radio-inline" name="optradio">Run till stopped</label>
                </div>
                <div class="radio-inline">
                    <label class="radio-inline control-label"><input type="radio" class="radio-inline" name="optradio">Run till timeout</label>
                </div>
                <div class="radio-inline">
                    <label class="radio-inline control-label"><input id = "lease" type="radio" class="radio-inline" name="optradio">Lease runtime</label>
                </div>
                        </div>
                </div>
                <div class="input-group date-time" >
                <span class="glyphicon-calendar glyphicon input-group-addon"></span>
                <input id="timeFrameStartDate"
                            class="form-control"/>
                </div>
            </form>


        </div>
    </div>
    <div class="footer">
        <div class="footer-content"><button id="cancel">Cancel</button><button id="save">Start</button> </div>
    </div>
</div>


<div class="popup" id="popover">
    <div class="header">
        <div class="header-content">Instance Events</div>
        <div class="close-icon"><i class="fa fa-close"></i> </div>
    </div>
    <div class="body">
        <div class="body-content" id="popover-body">
        </div>
    </div>
    <div class="footer" id="popover-footer">
        <div class="footer-content"><button id="cancel-popover">Cancel</button></div>
    </div>
</div>
<script type="text/javascript" language="JavaScript">
    $(function () {
        $("#timeFrameStartDate").datetimepicker();
    });
</script>
</body>