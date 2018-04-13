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
public class Bai4 {
    public static void GiaiPTB1(){
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
    
    public static void GiaiPTB2(){
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
    
    public static void TinhTienDien(){
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
    
    public static void main(String[] args) {
        System.out.println("+--------MENU--------+");
        System.out.println("1. Giải phương trình bậc 1");
        System.out.println("2. Giải phương trình bậc 2");
        System.out.println("3. Tính tiền điện");
        System.out.println("4. Kết thúc");
        System.out.println("+--------------------+");
        System.out.print("Chọn chức năng: ");
        int iCn;
        Scanner sc = new Scanner(System.in);
        iCn = sc.nextInt();
        switch (iCn){
            case 1:
                GiaiPTB1();
                break;
            case 2:
                GiaiPTB2();
                break;
            case 3:
                TinhTienDien();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Ban Chon Sai.");
        }
    }
}
