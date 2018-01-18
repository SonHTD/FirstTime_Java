/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author pc
 */
public class StringHandle {
    public static void main(String[] args) {
        String name = "Xuan Hung";
        String birthday = "10/10/1999";
        String phone = "0192312312";
        String rollNumber = "A1123";
        String email = "hugn@131";
        System.out.println("Toi ten la: " + name +"," + "So phone la: " + phone +","+ "Ngay sinh la: "+ birthday);
        String sqlInsert = "INSERT INTO Students (rollNumber, name, email, phone) VALUE ("+rollNumber+", '"+name+"', email, phone);";
        String splUpdate = "UPDATE Students SET rollNumber = 'A1312', name = 'Hoang Hai', email = 'hai@ada', phone = '01291' WHERE Id = 10;";
        
    }
    
}
