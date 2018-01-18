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

public class Student2 {
    private String name;
    private String rollNumber;
    private int gender;
    private String email;
    private String phone;
    private long birthday;
    private long createdAt;
    private long updatedAt;
    private int status;

//constructor    

public Student2() {
    this.createdAt = System.currentTimeMillis();
    this.updatedAt = System.currentTimeMillis();
    this.status = 1;
}

public Student2(String name, String rollNumber, String phone, long birthday) {
    this.name = name;
    this.rollNumber = rollNumber;
    this.phone = phone;
    this.birthday = birthday;
    this.createdAt = System.currentTimeMillis();
    this.updatedAt = System.currentTimeMillis();
    this.status = 1;
}


// to String()
@Override
public String toString() {
    return "SinhVien:" + "\n" + "Name: " + name +", RollNumber: " + rollNumber + ", Phone: " + phone + ", Birthday: " + birthday + ".";
}

// geter seter    

public void setName(String name) {
    this.name = name;
}

public void setRollNumber(String rollNumber) {
    this.rollNumber = rollNumber;
}

public void setGender(int gender) {
    this.gender = gender;
}

public void setEmail(String email) {
    this.email = email;
}

public void setPhone(String phone) {
    this.phone = phone;
}

public void setBirthday(long birthday) {
    this.birthday = birthday;
}

public void setCreatedAt(long createdAt) {
    this.createdAt = createdAt;
}

public void setUpdatedAt(long updatedAt) {
    this.updatedAt = updatedAt;
}

public void setStatus(int status) {
    this.status = status;
}



public String getName() {
    return name;
}

public String getRollNumber() {
    return rollNumber;
}

public int getGender() {
    return gender;
}

public String getEmail() {
    return email;
}

public String getPhone() {
    return phone;
}

public long getBirthday() {
    return birthday;
}

public long getCreatedAt() {
    return createdAt;
}

public long getUpdatedAt() {
    return updatedAt;
}

public int getStatus() {
    return status;
}


}