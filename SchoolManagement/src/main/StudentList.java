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
public class StudentList {
    private long reg,nid;
    private String name;
    private String gender,guardian;
    private int clas;
     public StudentList(long rg, String nm, String gnd, int cls, String grd , long nid){
         reg=rg;
         name = nm; 
         gender= gnd;
         this.nid = nid;
         clas = cls;
         guardian = grd;
     }
     
     public long getReg(){
         return reg;
     }
     public String getName(){
         return name;
     }
     public String getGender(){
         return gender;
     }
    public String getGuardian(){
        return guardian;
    }
    public int getClas(){
        return clas;
    }
    public long getNID(){
        return nid;
    }
}
