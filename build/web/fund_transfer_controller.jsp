<%-- 
    Document   : fund_transfer_controller
    Created on : Feb 7, 2023, 4:02:30 PM
    Author     : Gulshan
--%>
<%@page import="core.db.DBConn"%>
<%@page import="controller.SendEmail"%>
<%@page import="com.sun.org.apache.bcel.internal.generic.D2F"%>
<%@page import="java.sql.Statement"%>
<%
String accname=request.getParameter("acc_name");
String accno=request.getParameter("acc_no");
String accifcs=request.getParameter("acc_ifsc");
String amt=request.getParameter("amt");

    String email = (String) session.getAttribute("email");
Statement st=DBConn.connect();
String sql="INSERT INTO `fund_transfer`(`fid`, `account_name`, `account_no`, `ifsc`, `amount`) VALUES (null,'"+accname+"','"+accno+"','"+accifcs+"','"+amt+"')";


st.execute(sql);

SendEmail.mailSnd(email, amt+" Amount is debit from your account.");
session.setAttribute("flash_message", "Amount Transfer successfully !!!");
                session.setAttribute("flash_type", "success");
                response.sendRedirect("fundtransfer.jsp");

%>