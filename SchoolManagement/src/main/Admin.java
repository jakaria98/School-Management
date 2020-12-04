/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author JAKARIA
 */
public class Admin {
    private String name, email,type;
    public Admin(String n,String e,String t){
        name=n;email=e;type=t;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getType(){
        return type;
    }
}
