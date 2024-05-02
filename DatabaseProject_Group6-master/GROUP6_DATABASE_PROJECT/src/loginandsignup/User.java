/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginandsignup;

/**
 *
 * @author byaku
 */
class User {
   
    private int quarter, math, science, english, hekasi, homeeconomics, pe; 
    private String id, name;
    
    public User (int quarter, String id, String name, int math, int science, int english, int hekasi, int homeeconomics, int pe){
       
        this.quarter = quarter;
        this.id = id;
        this.name = name;
        this.math = math;
        this.science = science;
        this.english = english;
        this.hekasi = hekasi;
        this.homeeconomics = homeeconomics;
        this.pe = pe;
        
    } 
       
        public int getquarter() {
        return quarter;
        }
        public String getstudentid() {
        return id;
        }
        public String getname() {
        return name;
        }
        public int getmath() {
        return math;
        }
        public int getscience() {
        return science;
        }
        public int getenglish() {
        return english;
        }
        public int gethekasi() {
        return hekasi;
        }
        public int gethomeeconomics() {
        return homeeconomics;
        }
        public int getpe() {
        return pe;
        }
}
