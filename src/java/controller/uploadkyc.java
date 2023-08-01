/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.oreilly.servlet.MultipartRequest;
import static controller.Register.getSHA;
import static controller.Register.toHexString;
import core.db.DBConn;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.PreparedStatement;
import javax.servlet.http.HttpSession;
/**
 *
 * @author Gulshan
 */
public class uploadkyc extends HttpServlet {

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
          HttpSession session=request.getSession(); 
        try {
//
            System.out.println("path of file:" + request.getServletContext().getRealPath("/"));
            System.out.println("m  " + request.getServletContext().getRealPath("/") + "/files/");

            MultipartRequest multipartRequest = new MultipartRequest(request, request.getServletContext().getRealPath("/")+ "/files/");
            File file1,file2;
            String pannumber;
            String adharnumber;
//     
////            {
                pannumber = multipartRequest.getParameter("pannumber");
                System.out.println(" ddd "+pannumber );
                adharnumber = multipartRequest .getParameter("adharnumber");
                file1 = multipartRequest.getFile("adharfile");
                   file2 = multipartRequest.getFile("panfile");
//
////            }
//
//            System.out.println("course:" + pannumber);
//            System.out.println("sub_courses:" + adharnumber);
////            System.out.println("menu_name:" + menu_name);
////            System.out.println("menu_price:" + menu_price);
////            System.out.println("menu_desc:" + menu_desc);
//
            String absolutePath1 = file1.getAbsolutePath();
             String absolutePath2 = file2.getAbsolutePath();
//           
//            
//            
            System.out.println("absolutePath:" + absolutePath1);
////            abs=FileTOByte(absolutePath);
//            String adharfile = file1.getName();
//            String panfile = file2.getName();
//            
//            System.out.println("file");
//
//         
//
////            for (Map.Entry<Integer, String> entry : image0.entrySet()) {
////                Integer key = entry.getKey();
////                String value = entry.getValue();
////                System.out.println("key::" + key + "value::" + value);
////            }
////            InputStream inputStream = null;
////
////            Part filePart = request.getPart("image");
////            System.out.println("after filePart::" + filePart);
////
////            if (filePart != null) {
////                // prints out some information for debugging
////                System.out.println(filePart.getName());
////                System.out.println(filePart.getSize());
////                System.out.println(filePart.getContentType());
////
////                // obtains input stream of the upload file
////                inputStream = filePart.getInputStream();
////            }
String uidss=toHexString(getSHA(pannumber));
 Connection con = DBConn.getConnection();
//            System.out.println("inputStream::" + inputStream);
            System.out.println("before query");
            String insert = "insert into kyc_details ( `uid`, `pan_number`, `adhar_number`, `panfile`, `adharfile`, `unique_id`) values(?,?,?,?,?,?)";
            System.out.println("insert "+insert);
            
            PreparedStatement s = con.prepareStatement(insert);//DataConnection.connect1().prepareStatement(insert);
            s.setString(2, pannumber);
            s.setString(3, adharnumber);
         s.setString(1, String.valueOf(session.getAttribute("id")));
            s.setString(4, file1.getName());
             s.setString(5, file2.getName());
              s.setString(6, uidss);
//            // request.getServletContext().getRealPath("/")+"/files/"+file.getName() - hdd path
////             request.getServletContext().getContext("/").getContextPath()+"/files/"+file.getName() - android path
//            
            s.executeUpdate();
//            System.out.println("image insert");
//            System.out.println("image insert s" + s);
            session.setAttribute("flash_message", "Kyc Uploaded Successfully");
            session.setAttribute("flash_type", "success");
////end
            response.sendRedirect("upload_kyc.jsp");
        } catch (Exception e) {
//            out.print("Error"+e);
            System.out.println("Error" + e);
        } finally {
            out.close();
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
public static byte[] getSHA(String input) throws NoSuchAlgorithmException
    {
        // Static getInstance method is called with hashing SHA
        MessageDigest md = MessageDigest.getInstance("SHA-256");
 
        // digest() method called
        // to calculate message digest of an input
        // and return array of byte
        return md.digest(input.getBytes(StandardCharsets.UTF_8));
    }
     
    public static String toHexString(byte[] hash)
    {
        // Convert byte array into signum representation
        BigInteger number = new BigInteger(1, hash);
 
        // Convert message digest into hex value
        StringBuilder hexString = new StringBuilder(number.toString(16));
 
        // Pad with leading zeros
        while (hexString.length() < 64)
        {
            hexString.insert(0, '0');
        }
 
        return hexString.toString();
    }
}
