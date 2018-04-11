/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author ThanhAn
 */
public class StudentInfo {
    private String sHoTen;
    private String sNamSinh;
    private String sGioiTinh;
    
    public StudentInfo(){
        sHoTen = "";
        sNamSinh = "";
        sGioiTinh = "";
    }
    public StudentInfo(String hoten, String namsinh, String gioitinh){
        this.sHoTen = hoten;
        this.sNamSinh = namsinh;
        this.sGioiTinh = gioitinh;
    }

    /**
     * @return the sHoTen
     */
    public String getsHoTen() {
        return sHoTen;
    }

    /**
     * @param sHoTen the sHoTen to set
     */
    public void setsHoTen(String sHoTen) {
        this.sHoTen = sHoTen;
    }

    /**
     * @return the sNamSinh
     */
    public String getsNamSinh() {
        return sNamSinh;
    }

    /**
     * @param sNamSinh the sNamSinh to set
     */
    public void setsNamSinh(String sNamSinh) {
        this.sNamSinh = sNamSinh;
    }

    /**
     * @return the sGioiTinh
     */
    public String getsGioiTinh() {
        return sGioiTinh;
    }

    /**
     * @param sGioiTinh the sGioiTinh to set
     */
    public void setsGioiTinh(String sGioiTinh) {
        this.sGioiTinh = sGioiTinh;
    }
}
