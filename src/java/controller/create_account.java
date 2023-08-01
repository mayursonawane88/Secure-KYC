/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

//import static controller.SendEmail.mailSnd;
import core.db.DBConn;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Gulshan
 */
public class create_account extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
      PrintWriter out = response.getWriter();
         int res=0;
         int min = 1000000;  
int max = 400000;  
 
  HttpSession session=request.getSession(); 
        try {
            Connection con = DBConn.getConnection();
                Statement stmt = null;
            String pname=request.getParameter("pname");
            String mobno=request.getParameter("mobno");
//            String mobile=request.getParameter("mobile");/
            String email=request.getParameter("email");
            String addre=request.getParameter("addre"); 
            String pannumber=request.getParameter("pannumber"); 
           int acc = (int)(Math.random()*(max-min+1)+min);  
           System.out.println("id"+session.getAttribute("id"));
                           stmt = con.createStatement();
           String id=session.getAttribute("id").toString();
            String query1="SELECT `pan_number`  FROM `kyc_details` WHERE `uid`='"+pname+"'";
            System.out.println(query1);
            ResultSet rs=stmt.executeQuery(query1);
            if (rs.next()) {
                String nppan=rs.getString("pan_number");
                
                if(nppan.equals(pannumber)){
                stmt = con.createStatement();
        
        
            String query="INSERT INTO `bank_acc`(`baid`, `account_no`, `user_name`, `mobile`, `email`, `address`, `kyc_id`) VALUES (null,'"+acc+"','"+pname+"','"+mobno+"','"+email+"','"+addre+"','tt')";
            System.out.println("q"+query);
            SendEmail.mailSnd(email, "Account Created");
//            SendEmail.mailSnd(email, "Bank has been created your account Please verify your status.. From SBI Bank");
            res=stmt.executeUpdate(query);
           session.setAttribute("flash_message", "Kyc Done successfully !!!");
                session.setAttribute("flash_type", "success");
                 session.setAttribute("uidd", pname);
        response.sendRedirect("CheckDocuments.jsp");
                }else{
                     session.setAttribute("flash_message", "Unique Id Not Match!!!");
                session.setAttribute("flash_type", "success");
        response.sendRedirect("CreateAccount.jsp");
                }
                  
                
            }else{
            
            
            
            }
//            String s1 = "GeeksForGeeks";/
//String mdpassword=toHexString(getSHA(password));
//            System.out.println("\n" + s1 + " : " + stoHexString(getSHA(password)));
//  HttpSession session=request.getSession(); 
             
      
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
