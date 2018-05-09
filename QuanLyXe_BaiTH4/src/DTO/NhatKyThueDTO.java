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
public class NhatKyThueDTO {
    private String sSoxe;
    private String sMaKhach;
    private String sTuNgay;
    private String sDenNgay;
    
    public NhatKyThueDTO(String soxe, String makhach, String tungay, String denngay){
        this.sSoxe = soxe;
        this.sMaKhach = makhach;
        this.sTuNgay = tungay;
        this.sDenNgay = denngay;
    }

    /**
     * @return the sSoxe
     */
    public String getsSoxe() {
        return sSoxe;
    }

    /**
     * @param sSoxe the sSoxe to set
     */
    public void setsSoxe(String sSoxe) {
        this.sSoxe = sSoxe;
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
     * @return the sTuNgay
     */
    public String getsTuNgay() {
        return sTuNgay;
    }

    /**
     * @param sTuNgay the sTuNgay to set
     */
    public void setsTuNgay(String sTuNgay) {
        this.sTuNgay = sTuNgay;
    }

    /**
     * @return the sDenNgay
     */
    public String getsDenNgay() {
        return sDenNgay;
    }

    /**
     * @param sDenNgay the sDenNgay to set
     */
    public void setsDenNgay(String sDenNgay) {
        this.sDenNgay = sDenNgay;
    }
}
