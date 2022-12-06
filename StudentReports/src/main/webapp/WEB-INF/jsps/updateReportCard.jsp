<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update ReportCards</title>
</head>
<body>
  <a href="viewReportCards">click to all students</a>
  <form action="updateReportCards" method="post">
  <h2>update Page</h2>
      Id<input type="text" name="id" value="${id}" readonly/>
     Name<input type="text" name="name" value="${name}"/>
     Mobile<input type="text" name="mobile"/ value="${mobile}"/>
     
     Semisters<input type="text" name="semisters" value="${semisters}"/>
     Marks<input type="text" name="marks" value="${marks}"/>
     Average Marks<input type="text" name="averagemarks" value="${averagemarks}"/>
     subjects:English<input type="radio" name="type" value="English" value="${english}"/>
     Maths<input type="radio" name="type" value="Maths" value="${maths}"/>
     Science<input type="radio" name="type" value="Science" value="${science}"/>
  </form>
  ${updatemsg}
</body>
</html>