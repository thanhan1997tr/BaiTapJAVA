/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_4;

import java.util.Scanner;

/**
 *
 * @author ThanhAn
 */
public class Bai1 {
    public static class SanPham{
        private String TenSp;
        private double DonGia;
        private double GiamGia;
        public SanPham(){
            this.TenSp = "";
            this.DonGia = 0;
            this.GiamGia = 0;
        }
        public double GetThueNhapKhau(){
            return DonGia * 0.1;
        }
        
        public void Nhap(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập tên Sp: ");
            TenSp = sc.nextLine();
            System.out.print("Don Gia: ");
            DonGia = sc.nextDouble();
            System.out.print("Giam gia: ");
            GiamGia = sc.nextDouble();
        }
        
        public void Xuat(){
            System.out.println("Tên sản phẩm: " + TenSp);
            System.out.println("Đơn giá: " + DonGia);
            System.out.println("Giảm Giá: " + GiamGia);
            System.out.println("Thuế nhập khẩu: " + GetThueNhapKhau());
        }
        /**
         * @return the TenSp
         */
        public String getTenSp() {
            return TenSp;
        }

        /**
         * @param TenSp the TenSp to set
         */
        public void setTenSp(String TenSp) {
            this.TenSp = TenSp;
        }

        /**
         * @return the DonGia
         */
        public double getDonGia() {
            return DonGia;
        }

        /**
         * @param DonGia the DonGa to set
         */
        public void setDonGa(double DonGia) {
            this.DonGia = DonGia;
        }

        /**
         * @return the GiamGia
         */
        public double getGiamGia() {
            return GiamGia;
        }

        /**
         * @param GiamGia the GiamGia to set
         */
        public void setGiamGia(double GiamGia) {
            this.GiamGia = GiamGia;
        }
    }
    
    public static void main(String[] args) {
        SanPham sp = new SanPham();
        sp.Nhap();
        sp.Xuat();
    }
}
