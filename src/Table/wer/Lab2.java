/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2;

import java.sql.*;

/**
 *
 * @author user
 */
public class Lab2{
    public static void main(String[] args) throws SQLException, DocumentException {
        DbServer a = new DbServer();
        Documents[] b = a.findDocumentByContent("report");
        for(Documents i : b){
            System.out.println(i.getDocument_id() + " " + i.getTitle() + " " + i.getText());}
    }

}
