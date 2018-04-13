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
public class Bai1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Họ và tên: ");
        String sHoTen = scanner.nextLine();
        System.out.println("Điểm TB: ");
        double fDiemTB = scanner.nextDouble();
        System.out.printf("%s %.2f điểm", sHoTen, fDiemTB);
    }
}
