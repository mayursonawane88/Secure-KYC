package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import core.db.DBConn;
import java.sql.Connection;

public final class CreateAccount_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/flash.jsp");
    _jspx_dependants.add("/bank_navi.jsp");
  }

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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    //checking if flash message is set
    String flash_message = (String) session.getAttribute("flash_message");
    if (flash_message != null) {
        String flash_type = (String) session.getAttribute("flash_type");
        if (flash_type == null) {
            flash_type = "success";
        }
        session.removeAttribute("flash_message");
        session.removeAttribute("flash_type");

      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"alert alert-");
      out.print(flash_type);
      out.write("\">\n");
      out.write("        <button class=\"close\" data-dismiss=\"alert\"></button>\n");
      out.write("        <strong>");
      out.print(flash_type);
      out.write("!</strong> ");
      out.print(flash_message);
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");

    }

      out.write('\n');
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
      out.write("                                                        <li><a href=\"CreateAccount.jsp\" class=\"\">Create Account</a></li>\n");
      out.write("                                                        <!--<li><a href=\"fundtrans/fer.jsp\" class=\"\">Fund Transfer</a></li>-->\n");
      out.write("\n");
      out.write("                                                        <li><a href=\"logout.jsp\" class=\"\">Log Out</a>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\t\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("\t\n");
      out.write("\t</div>");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <script>\n");
      out.write("function showHint() {\n");
      out.write("    var s=document.getElementById(\"amt\").value;\n");
      out.write("    alert(str);\n");
      out.write("//    if(str>10000){\n");
      out.write("//        \n");
      out.write("//        alert(\"Please Update KYC\")\n");
      out.write("//    }else{\n");
      out.write("//        alert(\"Ready\")\n");
      out.write("//    }\n");
      out.write("    \n");
      out.write("//  if (str.length == 0) {\n");
      out.write("//    document.getElementById(\"txtHint\").innerHTML = \"\";\n");
      out.write("//    return;\n");
      out.write("//  } else {\n");
      out.write("//    var xmlhttp = new XMLHttpRequest();\n");
      out.write("//    xmlhttp.onreadystatechange = function() {\n");
      out.write("//      if (this.readyState == 4 && this.status == 200) {\n");
      out.write("//          alert(this.responseText);\n");
      out.write("//        document.getElementById(\"txtHint\").innerHTML = this.responseText;\n");
      out.write("//      }\n");
      out.write("//    };\n");
      out.write("//    alert(\"amount_error.jsp?q=\" + str);\n");
      out.write("//    xmlhttp.open(\"GET\", \"amount_error.jsp?q=\" + str, true);\n");
      out.write("//    xmlhttp.send();\n");
      out.write("//  }\n");
      out.write("//}\n");
      out.write("</script>\n");
      out.write("        <style>\n");
      out.write("/*            body {\n");
      out.write("  align-items: center;\n");
      out.write("  background-color: #000;\n");
      out.write("  display: flex;\n");
      out.write("  justify-content: center;\n");
      out.write("  height: 100vh;\n");
      out.write("}*/\n");
      out.write("\n");
      out.write(".form {\n");
      out.write("  background-color: #15172b;\n");
      out.write("  border-radius: 20px;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  height: 520px;\n");
      out.write("  padding: 20px;\n");
      out.write("  width: 320px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".title {\n");
      out.write("  color: #eee;\n");
      out.write("  font-family: sans-serif;\n");
      out.write("  font-size: 36px;\n");
      out.write("  font-weight: 600;\n");
      out.write("  margin-top: 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".subtitle {\n");
      out.write("  color: #eee;\n");
      out.write("  font-family: sans-serif;\n");
      out.write("  font-size: 16px;\n");
      out.write("  font-weight: 600;\n");
      out.write("  margin-top: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".input-container {\n");
      out.write("  height: 50px;\n");
      out.write("  position: relative;\n");
      out.write("  width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".ic1 {\n");
      out.write("  margin-top: 40px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".ic2 {\n");
      out.write("  margin-top: 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".input {\n");
      out.write("  background-color: #303245;\n");
      out.write("  border-radius: 12px;\n");
      out.write("  border: 0;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  color: #eee;\n");
      out.write("  font-size: 18px;\n");
      out.write("  height: 100%;\n");
      out.write("  outline: 0;\n");
      out.write("  padding: 4px 20px 0;\n");
      out.write("  width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".cut {\n");
      out.write("  background-color: #15172b;\n");
      out.write("  border-radius: 10px;\n");
      out.write("  height: 20px;\n");
      out.write("  left: 20px;\n");
      out.write("  position: absolute;\n");
      out.write("  top: -20px;\n");
      out.write("  transform: translateY(0);\n");
      out.write("  transition: transform 200ms;\n");
      out.write("  width: 76px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".cut-short {\n");
      out.write("  width: 50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".input:focus ~ .cut,\n");
      out.write(".input:not(:placeholder-shown) ~ .cut {\n");
      out.write("  transform: translateY(8px);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".placeholder {\n");
      out.write("  color: #65657b;\n");
      out.write("  font-family: sans-serif;\n");
      out.write("  left: 20px;\n");
      out.write("  line-height: 14px;\n");
      out.write("  pointer-events: none;\n");
      out.write("  position: absolute;\n");
      out.write("  transform-origin: 0 50%;\n");
      out.write("  transition: transform 200ms, color 200ms;\n");
      out.write("  top: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".input:focus ~ .placeholder,\n");
      out.write(".input:not(:placeholder-shown) ~ .placeholder {\n");
      out.write("  transform: translateY(-30px) translateX(10px) scale(0.75);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".input:not(:placeholder-shown) ~ .placeholder {\n");
      out.write("  color: #808097;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".input:focus ~ .placeholder {\n");
      out.write("  color: #dc2f55;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".submit {\n");
      out.write("  background-color: #08d;\n");
      out.write("  border-radius: 12px;\n");
      out.write("  border: 0;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  color: #eee;\n");
      out.write("  cursor: pointer;\n");
      out.write("  font-size: 18px;\n");
      out.write("  height: 50px;\n");
      out.write("  margin-top: 38px;\n");
      out.write("\n");
      out.write("  text-align: center;\n");
      out.write("  width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".submit:active {\n");
      out.write("  background-color: #06b;\n");
      out.write("}\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <br>\n");
      out.write("    <center>\n");
      out.write("        <form action=\"KycVerificationUpdate.jsp\" method=\"POST\">\n");
      out.write("        <div class=\"form\">\n");
      out.write("      <div class=\"title\">Create Account</div>\n");
      out.write("      <!--<div class=\"subtitle\">Let's create your account!</div>-->\n");
      out.write("      <div class=\"input-container ic1\">\n");
      out.write("          <select name=\"pname\" class=\"input\">\n");
      out.write("          ");

           Connection con = DBConn.getConnection();
                Statement stmt = null;
        stmt = con.createStatement();
          String sql="SELECT * FROM `users`";
          ResultSet rs=stmt.executeQuery(sql);
          while (rs.next()) {                  
                  
              
          
      out.write("\n");
      out.write("        \n");
      out.write("              <option value=\"");
      out.print(rs.getString("id"));
      out.write('"');
      out.write('>');
      out.print(rs.getString("firstname"));
      out.write("</option>\n");
      out.write("\n");
      out.write("         \n");
      out.write("          ");
 } 
      out.write("</select>\n");
      out.write("        <div class=\"cut\"></div>\n");
      out.write("        <label for=\"firstname\" class=\"placeholder\">Person name</label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"input-container ic2\">\n");
      out.write("          <input id=\"lastname\" class=\"input\" type=\"number\" name=\"mobno\" placeholder=\" \" />\n");
      out.write("        <div class=\"cut\"></div>\n");
      out.write("        <label for=\"lastname\" class=\"placeholder\">Mobile Number</label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"input-container ic2\">\n");
      out.write("          <input id=\"email\" class=\"input\" type=\"text\" name=\"email\" placeholder=\" \" />\n");
      out.write("        <div class=\"cut cut-short\"></div>\n");
      out.write("        <label for=\"email\" class=\"placeholder\">Email</>\n");
      out.write("      </div>\n");
      out.write("       <div class=\"input-container ic2\">\n");
      out.write("           <input id=\"email\" class=\"input\" type=\"text\" name=\"addre\"  placeholder=\" \" />\n");
      out.write("        <div class=\"cut cut-short\"></div>\n");
      out.write("        \n");
      out.write("        <label for=\"email\" class=\"placeholder\">Address</>\n");
      out.write("      </div>\n");
      out.write("      <!--<p>Suggestions: <span id=\"txtHint\"></span><//p>-->\n");
      out.write("        \n");
      out.write("      <button type=\"text\" class=\"submit\">submit</button>\n");
      out.write("    </div></form>\n");
      out.write("    </center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
