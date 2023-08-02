

<%@include file="flash.jsp" %>
<%
    session.setAttribute("id", null);
//    session.setAttribute("UserType", null);

    session.setAttribute("flash_message", "logged out successfully !!!");
    session.setAttribute("flash_type", "Success");


    String uid = (String) session.getAttribute("id");
    System.out.println("in logout uid is: " + uid);
    session.setAttribute("flash_message", "Logged Out Successfully");
    session.invalidate();
    response.sendRedirect("home.jsp");



%>
<%@include file="footer.jsp" %>