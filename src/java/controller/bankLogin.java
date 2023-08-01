/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static controller.Login.getSHA;
import static controller.Login.toHexString;
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
public class bankLogin extends HttpServlet {

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
        try {
        
            String mobile=request.getParameter("uname");
            String password=request.getParameter("password");  
              Connection con = DBConn.getConnection();
                Statement stmt = null;
            HttpSession session=request.getSession(); 
        stmt = con.createStatement();
        String mdpassword=password;
            String query="SELECT * FROM `bank_tbl` WHERE `uname`='"+mobile+"' and `pass`='"+mdpassword+"'";
            System.out.println("q "+query);
            ResultSet resultSet=stmt.executeQuery(query);
               if (resultSet.next()) {
                session.setAttribute("id",resultSet.getString("bid"));
//                session.setAttribute("username", username);
//                session.setAttribute("UserType", resultSet.getString(8));
                session.setAttribute("flash_message", "Logged in successfully !!!");
                session.setAttribute("flash_type", "success");
                 response.sendRedirect("bank_dashboard.jsp");
            } else {
                session.setAttribute("flash_message", "failed. try again");
                session.setAttribute("flash_type", "fail");
                response.sendRedirect("BankLogin.jsp");
            }
//        response.sendRedirect("home.jsp");
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
