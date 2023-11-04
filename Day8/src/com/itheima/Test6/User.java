package com.itheima.Test6;

public class User {
    //属性
    private String username;
    private String password;
    private String email;
    private String gender;
    private int age;

    //空参
    public User(){}
    //带全部参数的构造
    public User(String username,String password,String email,String gender,int age){
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    //get和set方法
    //快捷键alt + insert   p86 9分钟时
    public void setname(String username){
        this.username = username;
    }
    public String getusername(){
        return username;
    }

    public void setpassword(String password){
        this.password = password;
    }
    public String getpassword(){
        return password;
    }
    public void setemail(String email){
        this.email = email;
    }
    public String getemail(){
        return email;
    }
    public void setgender(String gender){
        this.gender = gender;
    }
    public String getgender(){
        return gender;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
