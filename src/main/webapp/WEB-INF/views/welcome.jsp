<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/bootstrap/css/bootstrap.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/bootstrap/css/bootstrap-grid.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/bootstrap/css/bootstrap-reboot.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/dashboard.css"/>"/>
    <link href="<c:url value="/resources/css/fontawesome/css/all.css"/>" rel="stylesheet"> <!--load all styles -->
    <script src="<c:url value="/resources/javascript/jquery-3.3.1.js"/> "></script>
    <script src="<c:url value="/resources/bootstrap/js/popper.js"/> "></script>
    <script src="<c:url value="/resources/bootstrap/js/bootstrap.js"/> "></script>
    <script src="<c:url value="/resources/bootstrap/js/bootstrap.bundle.js"/> "></script>
    <script src="<c:url value="/resources/bootstrap/js/holder.min.js"/> "></script>
    <script src="<c:url value="/resources/javascript/d3.js"/> "></script>
    <script src="<c:url value="/resources/javascript/components/dashboard.js"/> "></script>
    <script src="<c:url value="/resources/javascript/popper.min.js"/> "></script>
    <title>Lab Genie</title>
</head>
<body>

<header>
    <div class="collapse bg-dark" id="navbarHeader">
        <div class="container">
            <div class="row">
                <div class="col-sm-8 col-md-7 py-4">
                    <h4 class="text-white">Department of EIE Inventory Management System</h4>
                    <p class="text-muted">Add some information about the album below, the author, or any other
                        background context. Make it a few sentences long so folks can pick up some informative tidbits.
                        Then, link them off to some social networking sites or contact information.</p>
                </div>
                <div class="col-sm-4 offset-md-1 py-4">
                    <h4 class="text-white">Actions</h4>
                    <ul class="list-unstyled">
                        <li><a href="#" class="text-white">View Laboratory Inventory</a></li>
                        <li><a href="#" class="text-white">Upload Instrument Details</a></li>
                        <li><a href="#" class="text-white">View Reports</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
    <div class="navbar navbar-dark bg-dark shadow-sm">
        <div class="container d-flex justify-content-between">
            <a href="#" class="navbar-brand d-flex align-items-center">
                <svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" viewBox="0 0 24 24" fill="none"
                     stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="mr-2">
                    <path d="M23 19a2 2 0 0 1-2 2H3a2 2 0 0 1-2-2V8a2 2 0 0 1 2-2h4l2-3h6l2 3h4a2 2 0 0 1 2 2z"></path>
                    <circle cx="12" cy="13" r="4"></circle>
                </svg>
                <strong>Department of EIE Inventory Management System</strong>
            </a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarHeader"
                    aria-controls="navbarHeader" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
        </div>
    </div>
</header>

<main role="main">

    <section class="jumbotron text-left">
        <div class="container">
            <div class="row" id="search-criteria">
                <div class="form-group col-sm-6">
                    <label id="lab-select-label" for="lab-select">Select Laboratory</label>
                    <select class="form-control" id="lab-select">
                        <option label="" value=""></option>
                    </select>
                </div>
                <div class="form-group col-sm-6">
                    <label id="inventory-select-label" for="lab-select">Select Inventory</label>
                    <select class="form-control" id="inventory-select">
                        <option label="" value=""></option>
                    </select>
                </div>
                <div class="input-group col-sm-12 mb-2">
                    <div class="input-group-prepend">
                        <span class="input-group-text" id="basic-addon1">Instrument Name:</span>
                    </div>
                    <input type="text" id="search-box" class="form-control">
                </div>
                <div class="input-group col-sm-3">
                    <div class="checkbox">
                        <label><input type="checkbox" id="s-no-check">S No</label>
                    </div>
                </div>
                <div class="input-group col-sm-3">
                    <div class="checkbox">
                        <label><input type="checkbox" id="name">Name</label>
                    </div>
                </div>
                <div class="input-group col-sm-3">
                    <div class="checkbox">
                        <label><input type="checkbox" id="brand">Brand</label>
                    </div>
                </div>
                <div class="input-group col-sm-3">
                    <div class="checkbox">
                        <label><input type="checkbox" id="item-code-checkbox">Item code</label>
                    </div>
                </div>
                <div class="input-group col-sm-3">
                    <div class="checkbox">
                        <label><input type="checkbox" id="category-checkbox">Category</label>
                    </div>
                </div>
                <div class="input-group col-sm-3">
                    <div class="checkbox">
                        <label><input type="checkbox" id="actions-checkbox">Actions</label>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <div class="container-fluid" id="search-results">
        <table class="table table-bordered" id="search-results-table">
            <thead class="thead-light">
            <tr>
                <th scope="col">Serial No</th>
                <th scope="col">Item</th>
                <th scope="col">Brand</th>
                <th scope="col">Item Code</th>
                <th scope="col">Category</th>
                <th scope="col">Comment</th>
                <th scope="col" style="text-align:center">Actions</th>
            </tr>
            </thead>
            <tbody id="table-content">
            <tr id="dummy-table-row" style="display:none">
                <td id="s-no"></td>
                <td id="item-name"></td>
                <td id="item-brand"></td>
                <td id="item-code"></td>
                <td id="item-category"></td>
                <td id="comment"></td>
                <td id="actions">
                    <div class="container" id="actions-dev" style="text-align:center">
                        <a href="#" id="view" data-toggle="tooltip" data-placement="bottom" title="View">
                            <i class="fas fa-clipboard-list"></i>
                        </a>
                        <a href="#" id="delete" data-toggle="tooltip" data-placement="bottom" title="Delete">
                            <i class="fas fa-trash"></i>
                        </a>
                        <a href="#" id="reserve" data-toggle="tooltip" data-placement="bottom" title="Reserve">
                            <i class="fas fa-hourglass-half"></i>
                        </a>
                        <a href="#" id="comments" data-toggle="tooltip" data-placement="bottom" title="Comment">
                            <i class="fas fa-comment-dots"></i>
                        </a>
                    </div>
                </td>
            </tr>
            </tbody>
        </table>
    </div>

    <footer class="text-muted">
        <div class="container">
            <p class="float-right">
                <a href="#">Back to top</a>
            </p>
            <p>Album example is &copy; Bootstrap, but please download and customize it for yourself!</p>
            <p>New to Bootstrap? <a href="../../">Visit the homepage</a> or read our <a href="../../getting-started/">getting
                started guide</a>.</p>
        </div>
    </footer>
</body>
</html>