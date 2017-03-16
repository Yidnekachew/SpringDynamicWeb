<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hotels List</title>
    <link href="<c:url value="/styles/bootstrap.min.css" />" rel="stylesheet">
    <link href="<c:url value="/styles/main.css" />" rel="stylesheet">
    <%--<script src="<c:url value="/scripts/jquery.1.10.2.min.js" />"></script>--%>
</head>
<body>

<div class="row">
    <div class="col-md-6 col-md-offset-3">
        <table class="table table-striped">
            <thead>
            <tr>
                <th>#</th>
                <th>Hotel</th>
            </tr>
            </thead>
            <tbody>
            <% int index = 1; %>
            <c:forEach var="hotel" items="${hotels}">
                <tr>
                    <th scope="row"><%=index++%></th>
                    <td class="golden">${hotel.name}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>

        <hr>

        <form:form method="POST" action="/add" cssClass="form-inline">

            <form:label path="name">Name</form:label>
            <form:input path="name" autofocus="true" cssClass="form-control"/>

            <input type="submit" value="Save" class="btn btn-success btn-xs" />
        </form:form>
    </div>
</div>

<hr/>

</body>
</html>
