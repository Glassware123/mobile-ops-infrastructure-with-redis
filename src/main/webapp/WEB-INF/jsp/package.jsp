<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>

    <link rel="stylesheet" href="../resources/css/bootstrap.css">
    <link rel="stylesheet" href="../resources/css/bootstrap-theme.css">
    <link rel="stylesheet" href="../resources/css/bootstrap.css.map">
    <link rel="stylesheet" href="../resources/css/bootstrap-theme.css">
    <link rel="stylesheet" href="../resources/css/bootstrap-theme.css.map">
    <link rel="stylesheet" href="../resources/css/bootstrap-theme.min.css">

</head>
<body>
<c:forEach var="package"  items="${packages}">
    <c:out value="${package}"/>
</c:forEach>
</body>
</html>
