<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <a href="showReportCards">click to all students</a>
   <h2>view Page</h2>
   <table border="1">
     <tr>
       <th>ID</th>
       <th>Name</th>
       <th>Mobile</th>
       <th>Subjects</th>
       <th>Semisters</th>
       <th>Marks</th>
       <th>AverageMarks</th>
       </tr>
       <c:forEach items="${student}" var="student">
        <tr>
       <th>${student.id}</th>
       <th>${student.name}</th>
       <th>${student.mobile}</th>
       <th>${student.subjects}</th>
       <th>${student.semisters}</th>
       <th>${student.marks}</th>
       <th>${student.averagemarks}</th>
        </tr>
       </c:forEach>
       
   </table>
</body>
</html>