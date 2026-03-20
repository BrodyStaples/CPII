/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduleFour;

/**
 *
 * @author rlal
 */
public class Main {
    
    public static void main(String[] args){
        Student john = new Student("John",4.0,"Unknown");
        john.setMajor("CS");
        System.out.println(john.getMajor());
        System.out.println(john);
    }
    
}
