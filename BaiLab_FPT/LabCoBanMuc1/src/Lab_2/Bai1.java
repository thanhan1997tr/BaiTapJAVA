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
public class Bai1 {
    public static void main(String[] args) {
        System.out.println("GIẢI PHƯƠNG TRÌNH BẬC 1");
        Scanner sc = new Scanner(System.in);
        float fA, fB;
        System.out.print("A = ");
        fA = sc.nextFloat();
        System.out.print("B = ");
        fB = sc.nextFloat();
        if(fA==0)
            if(fB==0)
                System.out.print("Phương tình vô số nghiệm");
            else
                System.out.print("Phương trình vô nghiệm");
        else
            System.out.printf("Nghiệm X = %.2f", -fB/fA);
    }
}
