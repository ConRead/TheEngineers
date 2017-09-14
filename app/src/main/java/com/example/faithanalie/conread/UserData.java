package com.example.faithanalie.conread;

/**
 * Created by faithanalie on 13/09/2017.
 */

public class UserData {
    private int id = 0;
    private String username = "";
    private String firstName = "";
    private String lastName = "";
    private String password = "";
    private String contactNo = "";
    private int age = 0;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getUsername(){
        return this.username;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return this.password;
    }

    public void setContactNo(String contactNo){
        this.contactNo = contactNo;
    }

    public String getContactNo(){
        return this.contactNo;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }
}
