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
public class LoaiXeDTO {
    private String sMaLoai;
    private String sTenLoai;
    private String sDonGia; //Đơn giá theo ngày
    
    public LoaiXeDTO(String maloai, String tenloai, String dongia){
        this.sMaLoai = maloai;
        this.sTenLoai = tenloai;
        this.sDonGia = dongia;
    }

    /**
     * @return the sMaLoai
     */
    public String getsMaLoai() {
        return sMaLoai;
    }

    /**
     * @param sMaLoai the sMaLoai to set
     */
    public void setsMaLoai(String sMaLoai) {
        this.sMaLoai = sMaLoai;
    }

    /**
     * @return the sTenLoai
     */
    public String getsTenLoai() {
        return sTenLoai;
    }

    /**
     * @param sTenLoai the sTenLoai to set
     */
    public void setsTenLoai(String sTenLoai) {
        this.sTenLoai = sTenLoai;
    }

    /**
     * @return the sDonGia
     */
    public String getsDonGia() {
        return sDonGia;
    }

    /**
     * @param sDonGia the sDonGia to set
     */
    public void setsDonGia(String sDonGia) {
        this.sDonGia = sDonGia;
    }
}
