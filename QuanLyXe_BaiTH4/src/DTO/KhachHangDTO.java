/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author ThanhAn
 */
public class KhachHangDTO {
    private String sMaKhach;
    private String sHoTenKhach;
    private String sDiaChi;
    private String sDienThoai;
    
    public KhachHangDTO(String makhach, String hoten, String diachi, String dienthoai){
        this.sMaKhach = makhach;
        this.sHoTenKhach = hoten;
        this.sDiaChi = diachi;
        this.sDienThoai = dienthoai;
    }

    /**
     * @return the sMaKhach
     */
    public String getsMaKhach() {
        return sMaKhach;
    }

    /**
     * @param sMaKhach the sMaKhach to set
     */
    public void setsMaKhach(String sMaKhach) {
        this.sMaKhach = sMaKhach;
    }

    /**
     * @return the sHoTenKhach
     */
    public String getsHoTenKhach() {
        return sHoTenKhach;
    }

    /**
     * @param sHoTenKhach the sHoTenKhach to set
     */
    public void setsHoTenKhach(String sHoTenKhach) {
        this.sHoTenKhach = sHoTenKhach;
    }

    /**
     * @return the sDiaChi
     */
    public String getsDiaChi() {
        return sDiaChi;
    }

    /**
     * @param sDiaChi the sDiaChi to set
     */
    public void setsDiaChi(String sDiaChi) {
        this.sDiaChi = sDiaChi;
    }

    /**
     * @return the sDienThoai
     */
    public String getsDienThoai() {
        return sDienThoai;
    }

    /**
     * @param sDienThoai the sDienThoai to set
     */
    public void setsDienThoai(String sDienThoai) {
        this.sDienThoai = sDienThoai;
    }
}
