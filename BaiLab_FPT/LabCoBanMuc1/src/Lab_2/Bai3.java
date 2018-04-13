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
public class Bai3 {
    public static void main(String[] args) {
        System.out.println("TÍNH TIỀN ĐIỆN");
        Scanner sc = new Scanner(System.in);
        float fSoDien, fTien;
        System.out.print("Nhập số điện đã dùng tháng trước: ");
        fSoDien = sc.nextInt();
        if (fSoDien<50){
            fTien = fSoDien * 1000;
            System.out.printf("Số tiền là: %.2f VNĐ", fTien);
        }
        else{
            fTien = 50*1000 + (fSoDien - 50)*1200;
            System.out.printf("Số tiền là: %.2f VNĐ", fTien);
        }
    }
}
