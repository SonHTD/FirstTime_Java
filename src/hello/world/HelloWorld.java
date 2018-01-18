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
public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Enter CustomerId: ");
            int customerId = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter Name: ");
            String name = scanner.nextLine();
            System.out.println("Enter Birhtday: ");
            long birthday = scanner.nextLong();
            scanner.nextLine();
            System.out.println("Enter Phone: ");
            String phone = scanner.nextLine();
        
        Customer khachhang1 = new Customer(customerId, name, birthday, phone);
            System.out.println(khachhang1.getCustomerId());
            System.out.println(khachhang1.getName());
            System.out.println(khachhang1.getBirthday());
            System.out.println(khachhang1.getPhone());
        
        
        
        
//        Customer khachhang1 = new Customer();   
//            khachhang1.setCustomerId(123);
//            khachhang1.setName("Thanh Son");
//            khachhang1.setBirthday(19121994);
//            khachhang1.setPhone("0912312542");
//            System.out.println(khachhang1.getCustomerId());
//            System.out.println(khachhang1.getName());
//            System.out.println(khachhang1.getBirthday());
//            System.out.println(khachhang1.getPhone());
//        
          
//        Customer khachhang1 = new Customer(123, "Thanh Son", 191294, "0987123123");
//            System.out.println(khachhang1.getCustomerId());
//            System.out.println(khachhang1.getName());
//            System.out.println(khachhang1.getBirthday());
//            System.out.println(khachhang1.getPhone());



//        Scanner scanner = new Scanner(System.in);
//        
//        System.out.println("Enter EmployeeID: ");
//        String employeeId = scanner.next();
//        System.out.println("Enter Name: ");
//        String name = scanner.next();
//        System.out.println("Enter Age: ");
//        int age = scanner.nextInt();
//        System.out.println("Enter Address: ");
//        String address = scanner.next();
//        
//        Employee nhanvien1 = new Employee(employeeId, name, age, address);        
//        System.out.println(nhanvien1.toString());
//        nhanvien1.xettuoi();
        
        
//      Employee Son = new Employee("D12", "Hoang Son", 24, "Ha Noi");
//            System.out.println("EMPLOYEEID: " + Son.getEmployeeID());
//            System.out.println("NAME: " + Son.getName());
//            System.out.println("AGE: " + Son.getAge());
//            System.out.println("ADDRESS: " + Son.getAddress());
        
        
    /*    
        Student doHoang = new Student();
           doHoang.setRollNumber("D1234");
           System.out.println(doHoang.getRollNumber());  
           doHoang.diHoc();
           doHoang.diThi();
           doHoang.dilenThuvien();
           
        Customer thSon = new Customer();
            thSon.setCustomerID(1);
            thSon.setName("Thanh Son");
            thSon.setBirthday(1912);
            thSon.setPhone("092131");
            System.out.println(thSon.getCustomerID());
            System.out.println(thSon.getName());
            System.out.println(thSon.getBirthday());
            System.out.println(thSon.getPhone());
            thSon.shoping();
            thSon.buy("mi tom");
        
        Customer client = new Customer();
            Scanner user_input = new Scanner(System.in);
            
            System.out.print("Enter CustomerID: ");
            client.setCustomerID(user_input.nextInt());
            
            System.out.print("Enter Name: ");
            client.setName(user_input.next());
            
            System.out.print("Enter Birthday: ");
            client.setBirthday(user_input.nextLong());
            
            System.out.print("Enter Phone: ");
            client.setPhone(user_input.next());
            
            System.out.println("Values enter are: " + client.getCustomerID() + " " + client.getName() + " " + client.getBirthday() + " " + client.getPhone());
            
        Calculator maytinh = new Calculator();
            System.out.println("Tong hai so la: ");
            System.out.println(maytinh.sum(2, 3));
        */    
    } 

}

