/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author pc
 */
import java.util.Scanner;
public class SwitchKey {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        while(true){
            System.out.println("Please enter your choise: ");
            int choise = scanner.nextInt();
            switch(choise){
                case 1: 
                    System.out.println("Your choise 1.");
                    break;
                case 2: 
                    System.out.println("Your choise 2.");
                    break;
                case 3: 
                    System.out.println("Your choise 3.");
                    break;
                case 4: 
                    System.out.println("Your choise 4.");
                    break;
                case 5: 
                    System.out.println("Your choise 5.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("other.");
                    break;
            }
        }
    }
}
