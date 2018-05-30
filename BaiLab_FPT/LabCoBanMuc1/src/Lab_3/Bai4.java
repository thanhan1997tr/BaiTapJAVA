/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_3;

import java.util.Scanner;

/**
 *
 * @author ThanhAn
 */
public class Bai4 {
    public static String HocLuc(float fDiem){
        if (fDiem<5)
            return "Yếu";
        else if(fDiem<6.5)
            return "Trung Bình";
        else if(fDiem<7.5)
            return "Khá";
        else if(fDiem<9)
            return "Giỏi";
        else
            return "Xuất Sắc";
    }
    
    public static void SwapDiem(float[] fD, int i, int j){
        float t = fD[i];
        fD[i] = fD[j];
        fD[j] = t;
    }
    
    public static void SwapHoTen(String[] sH, int i, int j){
        String t = sH[i];
        sH[i] = sH[j];
        sH[j] = t;
    }
    
    public static void main(String[] args) {
        String[] sHoTen;
        float[] fDiem;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số sinh viên: ");
        int iN = sc.nextInt();
        sHoTen = new String[iN];
        fDiem = new float[iN];
        for (int i=0; i<iN; i++){
            System.out.println("\nSinh Viên " + (i+1));
            System.out.print("Họ tên: ");
            sc.nextLine();
            sHoTen[i] = sc.nextLine();
            System.out.print("Điểm: ");
            fDiem[i] = sc.nextFloat();
        }
        System.out.println("DANH SÁCH SINH VIÊN VỪA NHẬP");
        for (int i=0; i<iN; i++){
            System.out.println("SV["+(i+1)+"] <-> " + sHoTen[i] + " <-> " + fDiem[i] + " <-> " + HocLuc(fDiem[i]));
        }
        
        for (int i=0; i<iN-1; i++){
            for (int j=1; j<iN; j++){
                if(fDiem[i] > fDiem[j]){
                    SwapDiem(fDiem,i,j);
                    SwapHoTen(sHoTen,i,j);
                }
            }
        }
        
        System.out.println("DANH SÁCH SINH VIÊN SẮP XẾP THEO ĐIỂM");
        for (int i=0; i<iN; i++){
            System.out.println("SV["+(i+1)+"] <-> " + sHoTen[i] + " <-> " + fDiem[i] + " <-> " + HocLuc(fDiem[i]));
        }
    }
}
