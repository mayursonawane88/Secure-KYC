<%-- 
    Document   : create_kyc
    Created on : Jan 23, 2023, 12:59:44 PM
    Author     : Gulshan
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="core.db.DBConn"%>
<%@page import="java.sql.Connection"%>
<%@include file="flash.jsp" %>
<%@include file="user_navigation.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
/*            body {
  align-items: center;
  background-color: #000;
  display: flex;
  justify-content: center;
  height: 100vh;
}*/

.form {
  background-color: #15172b;
  border-radius: 20px;
  box-sizing: border-box;
  height: 520px;
  padding: 20px;
  width: 320px;
}

.title {
  color: #eee;
  font-family: sans-serif;
  font-size: 36px;
  font-weight: 600;
  margin-top: 30px;
}

.subtitle {
  color: #eee;
  font-family: sans-serif;
  font-size: 16px;
  font-weight: 600;
  margin-top: 10px;
}

.input-container {
  height: 50px;
  position: relative;
  width: 100%;
}

.ic1 {
  margin-top: 40px;
}

.ic2 {
  margin-top: 30px;
}

.input {
  background-color: #303245;
  border-radius: 12px;
  border: 0;
  box-sizing: border-box;
  color: #eee;
  font-size: 18px;
  height: 100%;
  outline: 0;
  padding: 4px 20px 0;
  width: 100%;
}

.cut {
  background-color: #15172b;
  border-radius: 10px;
  height: 20px;
  left: 20px;
  position: absolute;
  top: -20px;
  transform: translateY(0);
  transition: transform 200ms;
  width: 76px;
}

.cut-short {
  width: 50px;
}

.input:focus ~ .cut,
.input:not(:placeholder-shown) ~ .cut {
  transform: translateY(8px);
}

.placeholder {
  color: #65657b;
  font-family: sans-serif;
  left: 20px;
  line-height: 14px;
  pointer-events: none;
  position: absolute;
  transform-origin: 0 50%;
  transition: transform 200ms, color 200ms;
  top: 20px;
}

.input:focus ~ .placeholder,
.input:not(:placeholder-shown) ~ .placeholder {
  transform: translateY(-30px) translateX(10px) scale(0.75);
}

.input:not(:placeholder-shown) ~ .placeholder {
  color: #808097;
}

.input:focus ~ .placeholder {
  color: #dc2f55;
}

.submit {
  background-color: #08d;
  border-radius: 12px;
  border: 0;
  box-sizing: border-box;
  color: #eee;
  cursor: pointer;
  font-size: 18px;
  height: 50px;
  margin-top: 38px;

  text-align: center;
  width: 100%;
}

.submit:active {
  background-color: #06b;
}

        </style>
        <style>
table {
  border-collapse: collapse;
  width: 100%;
}

th, td {
  text-align: left;
  padding: 8px;
}

tr:nth-child(even){background-color: #f2f2f2}

th {
  background-color: #04AA6D;
  color: white;
}
</style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <br>
      <table>
  <tr>
    <th>UID</th>
    <th>Pan Number</th>
    <th>Adhar</th>
     <th>Delete</th>
  </tr>
  <%
      
       Connection con = DBConn.getConnection();
                Statement stmt = null;
    stmt = con.createStatement();
    
    String uid=(String)session.getAttribute("id");
//        String mdpassword=toHexString(getSHA(password));
            String query="SELECT * FROM `kyc_details` where uid='"+uid+"'";
            System.out.println("q "+query);
            ResultSet resultSet=stmt.executeQuery(query);
               while (resultSet.next()) {
  
  %>
  <tr>
       <td><%=resultSet.getString("uid")%></td>
    <td><%=resultSet.getString("pan_number")%></td>
    <td><%=resultSet.getString("adhar_number")%></td>
    <td><a href="delete.jsp?uid=<%=resultSet.getString("uid")%>">Delete</a></td>
  </tr>
  
  <% } %>

</table>

    </body>
</html>
