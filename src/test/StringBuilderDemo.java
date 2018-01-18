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
public class StringBuilderDemo {
    public static void main(String[] args) {
        String rollNumberUpdate = "A12312";
        String nameUpdate = "Xuan Hung";
        String emailUpdate = "Hug@123";
        String phoneUpdate = "09871223112";
        
        StringBuilder stringBuilderUpdate = new StringBuilder();
        stringBuilderUpdate.append("UPDATE Student SET ");
        stringBuilderUpdate.append("rollnumber= '").append(rollNumberUpdate);
        stringBuilderUpdate.append("' ,name= '").append(nameUpdate);
        stringBuilderUpdate.append("' ,email= '").append(emailUpdate);
        stringBuilderUpdate.append("' ,phoneUpdate= '").append(phoneUpdate);
        stringBuilderUpdate.append("' WHERE id = 10.");
        System.out.println(stringBuilderUpdate.toString());
    }
}
