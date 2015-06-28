<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<head>
	<title>Training Details</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
</head>
<body class="container">
	<h1>${training.subject} <small>(${training.code})</small> course details</h1>
	<hr>
	<h3>Included courses:</h3>
	<table class="table table-striped">
		<tr>
			<th>Subject</th>
			<th>Days</th>
			<th>Trainer</th>
			<th>Language</th>
		</tr>
		<c:forEach var="course" items="${courses}">
			<tr>
				<td>${course.subject }</td>
				<td>${course.numberOfDays }</td>
				<td>${course.trainer }</td>
				<td>${course.language }</td>
			</tr>
		</c:forEach>
	</table>
	<a href="/training/trainings" class="btn btn-success">Back to trainings</a>

</body>
</html>