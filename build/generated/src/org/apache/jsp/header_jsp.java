package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<title>Bank_lock a Banking Category Flat Bootstrap Responsive Website Template | Home :: W3layouts</title>\n");
      out.write("<!-- Meta tag Keywords -->\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Bank_lock  web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, Smartphone Compatible web template, free webDesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web Designs\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);\n");
      out.write("function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<!--// Meta tag Keywords -->\n");
      out.write("<link href=\"forms/css/style.css\" rel='stylesheet' type='text/css' />\n");
      out.write("<!-- css files -->\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.css\"> <!-- Bootstrap-Core-CSS -->\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"all\" /> <!-- Style-CSS --> \n");
      out.write("<link rel=\"stylesheet\" href=\"css/font-awesome.css\"> <!-- Font-Awesome-Icons-CSS -->\n");
      out.write("<!-- //css files -->\n");
      out.write("\n");
      out.write("<!-- web-fonts -->\n");
      out.write("<link href=\"//fonts.googleapis.com/css?family=Roboto+Condensed:300,300i,400,400i,700,700i\" rel=\"stylesheet\">\n");
      out.write("<link href=\"//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i\" rel=\"stylesheet\">\n");
      out.write("<!-- //web-fonts -->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"header\">\n");
      out.write("\t\t<nav class=\"navbar navbar-default link-effect-8\" id=\"link-effect-8\">\n");
      out.write("\t\t\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t<h1><a href=\"index.html\">Secure<span><i class=\"fa fa-credit-card-alt\" aria-hidden=\"true\"></i></span>Kyc</a></h1>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<!-- navbar-header -->\n");
      out.write("\t\t\t\t\t<div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\" active\" href=\"index.html\">Home</a></li>\n");
      out.write("                                                        <li><a href=\"login.jsp\" class=\"\">Login</a></li>\n");
      out.write("                                                        <li><a href=\"register.jsp\" class=\"\">Register</a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#contact\" class=\"scroll\">Contact</a>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\t\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("\t\n");
      out.write("\t</div>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
