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
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float fCanh;
        System.out.print("Canh khoi lap phuong: ");
        fCanh = sc.nextFloat();
        System.out.printf("Thể tích = %.2f", Math.pow(fCanh, 3));
        
    }
}
