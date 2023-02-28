<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>SemipreciousStones</title>
    </head>
    <body>
        <h1>Semiprecious Stones:</h1>
        <c:forEach var="stone" items="${semiprecious}">
            <li><c:out value="${stone.semipreciousStoneType.name}"/>
                , weight (in carats) =
                <c:out value="${stone.weightInCarat}"/>
                , price (per carat) =
                <c:out value="${stone.pricePerCarat}"/>
            </li>
        </c:forEach>
    </body>
</html>
