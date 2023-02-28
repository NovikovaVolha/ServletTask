<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>PreciousStones</title>
</head>
<body>
<h1>Precious Stones:</h1>
<c:forEach var="stone" items="${precious}">
  <li><c:out value="${stone.preciousStoneType.name}"/>
    , weight (in carats) =
    <c:out value="${stone.weightInCarat}"/>
    , price (per carat) =
    <c:out value="${stone.pricePerCarat}"/>
  </li>
</c:forEach>
</body>
</html>
