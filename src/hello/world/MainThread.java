/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.world;

/**
 *
 * @author pc
 */
import java.util.Scanner;
public class MainThread {
    public static void main(String[] args) {
//        Student2 student = new Student2();
//        student.setName("Thanh Son");
//        student.setRollNumber("D1234");
//        student.setGender(1);
//        student.setEmail("ThanhSon@123");
//        student.setPhone("098746221");
//        student.setBirthday(19121994);
//        student.setCreatedAt(23);
//        student.setUpdatedAt(19121994);
//        student.setStatus(1);
//        System.out.println(student.toString());
        
//        Student2 student2 = new Student2("Hoang Son", "D52233", "01238844991", 19011995);
//        System.out.println(student2.toString());
        
        getStudentInfor();       
    }
    
    public static void getStudentInfor(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter RollNumber: ");
        String rollNumber = input.nextLine();
        System.out.println("Enter Name: ");
        String name = input.nextLine();
        System.out.println("Enter Phone: ");
        String phone = input.nextLine();
        System.out.println("Enter Birthday: ");
        long birthday = input.nextLong();
       
        Student2 student3 = new Student2(name, rollNumber, phone, birthday);
        System.out.println(student3.toString());
        
    }
}
