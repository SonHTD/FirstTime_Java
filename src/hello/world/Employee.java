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
public class Employee {
    private String employeeID;
    private String name;
    private int age;
    private String address;  
    
    public Employee(){
        
    }
    public Employee(String employeeID, String name, int age, String address){
        this.employeeID = employeeID;
        this.name = name;
        this.age = age;
        this.address = address;           
    }
    
    public void xettuoi(){
        if (age<16){
            System.out.println("Duoi tuoi vi thanh nien");     
        }else if(age>60){
            System.out.println("Qua tuoi lao dong");
        }else{
            System.out.println("OK");
        }    
    }
    
    @Override
    public String toString() {
        return "Employee 1 :" + "EmployeeID: " + employeeID + ", Name: " + name + ", Age: " + age + ", Address: " + address + ".";
    }
    
    public String getEmployeeID(){
        return this.employeeID;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public String getAddress(){
        return this.address;
    }
}

