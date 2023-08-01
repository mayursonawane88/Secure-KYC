<%-- 
    Document   : getFile
    Created on : Apr 18, 2023, 4:10:38 PM
    Author     : Gulshan
--%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.FileOutputStream"%>
<%
    
   response.setContentType("text/html");
//   request.getParameter("filename");
//		PrintWriter out = response.getWriter();
		String gurufile = "test.png";
                System.out.println("gurufile"+gurufile);
		String gurupath = "C:/Users/Gulshan/Documents/NetBeansProjects/SecureKyc/build/web/files/";
		response.setContentType("APPLICATION/OCTET-STREAM");
		response.setHeader("Content-Disposition", "attachment; filename=\""
				+ gurufile + "\"");
 
		FileInputStream fileInputStream = new FileInputStream(gurupath
				+ gurufile);
 System.out.println("url "+gurupath
				+ gurufile);
		int i;
		while ((i = fileInputStream.read()) != -1) {
			out.write(i);
		}
		fileInputStream.close();
		out.close();
%>
