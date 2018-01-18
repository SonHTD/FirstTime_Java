/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.world;

/**
 *
 * @author pc
 */
public class Calculator {
          
    public int sum(int a, int b){        
        return (a+b);
    }
    
    public int hieu(int a, int b){
        return (a-b);
    }
    
    public int tich(int a, int b){
        return (a*b);
    }
    
    public float chia(int a, int b){
        if(b==0){
            System.out.println("Khong the chia cho 0");
            return 0;
        }
        return (float)a/b;
    }
}
