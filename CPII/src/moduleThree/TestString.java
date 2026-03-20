/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduleThree;

/**
 *
 * @author RLAL
 */
public class TestString {
    public static String firstName(String name){
        // use indexOf
        int index = name.indexOf(" ");
        return name.substring(0, index);
    }
    
    public static String lastName(String name){
        // use indexOf
        int prevIndex = -1;
        int index = name.indexOf(" ");
        String tempName = name;
        while(index != -1){
            prevIndex = index;
            tempName = tempName.substring(index+1);
             index = tempName.indexOf(" ");
        }
        
        return name.substring(prevIndex+1);
    }
    
    
    public static void main(String[] args){
        String name = "Ratan Lal";
        // display the name in capital letters
        System.out.println(name.toUpperCase());
        // Extract your first and last name
        String firstName = firstName(name);
        String lastName = lastName(name);
        System.out.println(lastName+", "+firstName);
    }
}
