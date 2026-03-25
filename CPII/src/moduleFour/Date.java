/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduleFour;

/**
 *
 * @author rlal
 */
public class Date {
    private int month;
    private int day;
    private int year;
    
    public Date(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }
    
    public Date(){
        month = 00;
        day = 0;
        year = 0000;
    }
    
    public String toString(){
        return month+"/"+day+"/"+year;
    }
}
