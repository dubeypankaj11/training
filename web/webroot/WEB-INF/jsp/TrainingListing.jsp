<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <title>Training Listing</title>
    <body class="container" >
        <h1>Training Listing</h1>
        <hr>
     <ul>
     <c:forEach var="training" items="${trainings}">
        <li><a href="./trainings/${training.code}">${training.subject} <small>(${training.code})</small> </a><small><i>- ${training.numberOfDays} day(s)</i></small></li>
      </c:forEach>
      </ul>
    </body>
</html>