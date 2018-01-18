/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;
/**
 *
 * @author pc
 */

public class ArrLoop {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] names = new int[n];
        
        System.out.println("Nhap cac so nguyen :");
        
        for(int i = 0; i < names.length; i++){
            names[i] = scanner.nextInt();
            scanner.nextLine();
        }
        
        System.out.println("Danh sach cac so nguyen: ");
        
        for(int i = 0; i < names.length; i++){            
            System.out.println(names[i]);
        }
    }
}
