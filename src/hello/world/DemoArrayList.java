/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.world;


import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class DemoArrayList {
    
    public static void main(String[] args) {
        ArrayList<Student> listStudent = new ArrayList<>();
        
        Student student = new Student();
        student.setId(1);
        student.setName("Son");
        
        Student student2 = new Student();
        student2.setId(2);
        student2.setName("Hung");
        
        Student student3 = new Student();
        student3.setId(3);
        student3.setName("Hai");
        
        listStudent.add(student);
        listStudent.add(student2);
        listStudent.add(student3);
        
        Student myStudent = listStudent.get(0);
        System.out.println(myStudent.getName());
    }
}
