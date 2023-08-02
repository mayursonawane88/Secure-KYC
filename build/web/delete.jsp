<%-- 
    Document   : delete
    Created on : May 3, 2023, 4:33:20 PM
    Author     : Gulshan
--%>
  <%@page import="java.sql.Statement"%>
<%@page import="core.db.DBConn"%>
<%@page import="java.sql.Connection"%>

<% 
      
      Connection con = DBConn.getConnection();
                Statement stmt = null;
    stmt = con.createStatement();
        String uid=request.getParameter("uid");
            String query="DELETE FROM `kyc_details` where uid='"+uid+"'";
            System.out.println("q "+query);
         stmt.executeUpdate(query);
          response.sendRedirect("viewRecord.jsp");
%>