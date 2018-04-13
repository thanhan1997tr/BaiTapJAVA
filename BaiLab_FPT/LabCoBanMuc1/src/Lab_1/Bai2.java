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
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("TÍNH CHU VI VÀ DIỆN TÍCH HÌNH CHỮ NHẬT");
        float fC1;
        System.out.print("Cạnh 1: ");
        fC1 = sc.nextFloat();
        
        float fC2;
        System.out.print("Cạnh 2: ");
        fC2 = sc.nextFloat();
        
        float fCV, fDT;
        fCV = (fC1+fC2)*2;
        fDT = fC1*fC2;
        float fCnn = Math.min(fC1, fC2);
        System.out.printf("\nChu vi: %.2f", fCV);
        System.out.printf("\nDien Tich: %.2f", fDT);
        System.out.printf("\nCanh Nho Nhat: %.2f", fCnn);
    }
}
