/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_1;

import java.util.Scanner;

/**
 *
 * @author ThanhAn
 */
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float fA, fB, fC;
        double fDelta;
        System.out.println("NHẬP A,B,C CỦA PTB2");
        System.out.print("A = ");
        fA = sc.nextFloat();
        System.out.print("B = ");
        fB = sc.nextFloat();
        System.out.print("C = ");
        fC = sc.nextFloat();
        fDelta = Math.pow(fB,2) - 4*fA*fC;
        System.out.printf("\nCăn Delta = %.2f", Math.sqrt(fDelta));
        
    }
}
