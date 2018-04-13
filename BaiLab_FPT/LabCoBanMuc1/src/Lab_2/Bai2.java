/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_2;

import java.util.Scanner;

/**
 *
 * @author ThanhAn
 */
public class Bai2 {
    public static void main(String[] args) {
        System.out.println("GIẢI PHƯƠNG TRÌNH BẬC 2");
        Scanner  sc = new Scanner(System.in);
        float fA, fB, fC;
        double fDelta;
        System.out.print("A = ");
        fA = sc.nextFloat();
        System.out.print("B = ");
        fB = sc.nextFloat();
        System.out.print("C = ");
        fC = sc.nextFloat();
        if(fA==0){
            if(fB==0){
                if(fC==0)
                    System.out.print("Phương trình vô số nghiệm");
                else
                    System.out.print("Phương trình vô nghiệm");
            }
            else
                System.out.printf("X = %.2f", -fC/fB);
        }
        else{
            fDelta = Math.pow(fB,2) - 4*fA*fC;
            if (fDelta<0){
                System.out.print("Phương trình vô nghiệm");
            }
            if (fDelta==0){
                System.out.printf("Nghiệm kép X = %.2f", -fB/(2*fA));
            }
            if (fDelta>0){
                System.out.printf("X1 = %.2f <<>> X2 = %.2f", (-fB+Math.sqrt(fDelta))/(2*fA), (-fB-Math.sqrt(fDelta))/(2*fA));
            }
        } 
    }
}
