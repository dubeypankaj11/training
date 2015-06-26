<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
    <title>Training Listing</title>
    <body>
        <h1>Training Listing</h1>
     <ul>
     <c:forEach var="training" items="${trainings}">
        <li><a href="./trainings/${training.code}">${training.subject}</a></li>
      </c:forEach>
      </ul>
    </body>
</html>