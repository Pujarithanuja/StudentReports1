<%


  int m1=Integer.parseInt(request.getParameter("m1"));
  int m2=Integer.parseInt(request.getParameter("m2"));
  int m3=Integer.parseInt(request.getParameter("m3"));
  
     int total=m1+m2+m3;
      
   int avg = total/3;
       
      out.println("Your Total is"+ total);
      out.println("Your Avg is"+ avg);
      if(avg > 50)
      {
    	  out.println("Your Result is Pass");
      }
      else
      {
    	  out.println("Your Result is Fail");
      }
   





%>
