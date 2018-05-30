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
public class Bai1 {
    public static void main(String[] args) {
        System.out.println("KIỂM TRA SỐ NGUYÊN TỐ");
        int iN;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N = ");
        iN = sc.nextInt();
        boolean ok = true;
        if (iN<2){
            System.out.printf("%d không phải là số nguyên tố.", iN);
        }
        else{
            for (int i=2; i< iN-1; i++){
                if (iN%2 == 0){
                    ok = false;
                    break;
                }
            }
            if (ok == true)
                System.out.printf("%d là số nguyên tố.", iN);
            else
                System.out.printf("%d không phải là số nguyên tố.", iN);
        }
        
    }
}
