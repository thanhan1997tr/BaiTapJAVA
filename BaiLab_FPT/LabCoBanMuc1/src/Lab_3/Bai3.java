/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ThanhAn
 */
public class Bai3 {
    public static void NhapMang(int iN, int[] a){
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<iN; i++){
            System.out.printf("A[%d] = ", i);
            a[i] = sc.nextInt();
        }
    }
    
    public static void XuatMang(int iN, int[] a){
        for (int i=0; i<iN; i++){
            System.out.printf("%d  ",a[i]);
        }
    }
    
    public static int TimMin(int iN, int[] a){
        int iMin = a[0];
        for (int i=1; i<iN; i++){
            iMin = Math.min(iMin, a[i]);
        }
        return iMin;
    }
    
    public static float TrungBinhCong3(int iN, int[] a){
        int iDem = 0, iTong = 0;
        for (int i=0; i<iN; i++){
            if (a[i]%3 == 0){
                iTong += a[i];
                iDem++;
            }
        }
        if (iDem==0){
            return 0;
        }
        return (float)iTong/iDem;
    }
    public static void main(String[] args) {
        int[] a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên N = ");
        int iN = sc.nextInt();
        a = new int[iN];
        NhapMang(iN, a);
        System.out.print("\nMảng vừa nhập: ");
        XuatMang(iN, a);
        Arrays.sort(a);
        System.out.print("\nMảng đã sắp xếp: ");
        XuatMang(iN, a);
        System.out.printf("\nGíá trị nhỏ nhất trong mảng: %d", TimMin(iN, a));
        System.out.printf("\nTBC các phần từ chiia hết cho 3: %.2f", TrungBinhCong3(iN, a));
        
    }
}
