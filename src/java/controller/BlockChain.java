/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import core.db.DBConn;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gulshan
 */
public class BlockChain {
    
    public static void main(String[] args) {
        try {
            String dd=splitkey("dd");
        } catch (SQLException ex) {
            Logger.getLogger(BlockChain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static String splitkey(String data) throws SQLException{
       String str = data;  
          System.out.println("data"+str);
        //Stores the length of the string  
        int len = str.length();  
        System.out.println("len"+len);
        //n determines the variable that divide the string in 'n' equal parts  
        int n = 4;  
        int temp = 0, chars = len/n;  
        //Stores the array of string  
        String[] equalStr = new String [n];   
        //Check whether a string can be divided into n equal parts  
        if(len % n != 0) {  
            System.out.println("Sorry this string cannot be divided into "+ n +" equal parts.");  
        }  
        else {  
            for(int i = 0; i < len; i = i+chars) {  
                //Dividing string in n equal part using substring()  
                String part = str.substring(i, i+chars);  
                equalStr[temp] = part;  
                temp++;  
            }  
    System.out.println(n + " equal parts of given string are ");  
            for(int i = 0; i < equalStr.length; i++) {  
                System.out.println(equalStr[i]);  
                 System.out.println(i+1);  
                 int v=i+1;
                 if(v==1){
                     
                     Statement st = null;
                    try {
                        st=DBConn.connect();
                    } catch (Exception ex) {
                        Logger.getLogger(BlockChain.class.getName()).log(Level.SEVERE, null, ex);
                    }
                 String server1="INSERT INTO `server1`(`sid`, `key`, `uid`) VALUES (null,'"+equalStr[i]+"',(SELECT max(id) as uid FROM `users`))";
                     System.out.println("sql"+server1);
                 st.executeUpdate(server1);
                 
                 }else if(v==2){
                 Statement st = null;
                    try {
                        st=DBConn.connect();
                    } catch (Exception ex) {
                        Logger.getLogger(BlockChain.class.getName()).log(Level.SEVERE, null, ex);
                    }
                 String server2="INSERT INTO `server2`(`sid`, `key`, `uid`) VALUES (null,'"+equalStr[i]+"',(SELECT max(id) as uid FROM `users`))";
                 st.executeUpdate(server2);
                 }else{
                   Statement st = null;
                    try {
                        st=DBConn.connect();
                    } catch (Exception ex) {
                        Logger.getLogger(BlockChain.class.getName()).log(Level.SEVERE, null, ex);
                    }
                 String server3="INSERT INTO `server3`(`sid`, `key`, `uid`) VALUES (null,'"+equalStr[i]+"',(SELECT max(id) as uid FROM `users`))";
                 st.executeUpdate(server3);
                 }
                }  
            }  
    return "2";
    }
}
