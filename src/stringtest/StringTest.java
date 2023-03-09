/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringtest;

/**
 *
 * @author hunnytaggy
 */
import java.util. Scanner;

public class StringTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        String name;
        int age;
        
        System.out.println("What is your name?: ");
        name = keyboard.next();
        
        System.out.println("What is your age?: ");
        age = keyboard.nextInt();
        System.out.println();
        
        System.out.println("Hello "+name);
        System.out.println("When I was your age I was "+ (age + 4));
    }
    
}
