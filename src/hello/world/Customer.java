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
public class Customer {
    private int customerId;
    private String name;
    private long bitrhday;
    private String phone;
    
    public Customer(){
    }
    
    public Customer(int customerId, String name, long birthday, String phone){
        this.customerId = customerId;
        this.name = name;
        this.bitrhday  = birthday;
        this.phone = phone;
    }
    
    public int getCustomerId(){
        return this.customerId;
    }
    
    public void setCustomerId(int customerId){
        this.customerId = customerId;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public long getBirthday(){
        return this.bitrhday;
    }
    
    public void setBirthday(long birthday){
        this.bitrhday = birthday;
    }
    
    public String getPhone(){
        return this.phone;
    }
    
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    
    
    
    
    
    
    
    
    
   
    
    
//    private String name;
//    private long birthday;
//    private String phone;
//    private int customerID;
//    
//    public void shoping(){
//        System.out.println("Toi di mua sam");
//    }
//    
//    public void buy(String nameProduct){
//        System.out.println("Toi dang di mua "+ nameProduct);
//    }
//    
//    public void setName(String name){
//        this.name = name;
//    }
//    
//    public String getName(){
//        return this.name;
//    }
//    
//    public void setBirthday(long birthday){
//        this.birthday = birthday;
//    }
//    
//    public long getBirthday(){
//        return this.birthday;
//    }
//    
//    public void setPhone(String phone){
//        this.phone = phone;
//    }
//    
//    public String getPhone(){
//        return this.phone;
//    }
//    
//    public void setCustomerID(int customerID){
//        this.customerID = customerID;
//    }
//    
//    public int getCustomerID(){
//        return this.customerID;
//    }
}
