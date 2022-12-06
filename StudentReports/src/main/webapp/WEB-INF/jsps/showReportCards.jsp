<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <a href="viewReportCards">click to all students</a>
  <h2>Student Page</h2>
  <form action="showReportCards" method="post">
    Id<input type="text" name="id"/>
     Name<input type="text" name="name"/>
     Mobile<input type="text" name="mobile"/>
     
     Semisters<input type="text" name="semisters"/>
     Marks<input type="text" name="marks"/>
     Average Marks<input type="text" name="averagemarks"/>
     subjects:English<input type="radio" name="type" value="English"/>
     Maths<input type="radio" name="type" value="Maths"/>
     Science<input type="radio" name="type" value="Science"/>
  </form>
  ${msg}
</body>
</html>