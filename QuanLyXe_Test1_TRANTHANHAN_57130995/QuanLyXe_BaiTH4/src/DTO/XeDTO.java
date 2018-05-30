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
public class XeDTO {
    private String sSoxe;
    private String sTinhTrang;
    private String sMaLoai;
    
    public XeDTO(String soxe, String tinhtrang, String maloai){
        this.sSoxe = soxe;
        this.sTinhTrang = tinhtrang;
        this.sMaLoai = maloai;
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
     * @return the sTinhTrang
     */
    public String getsTinhTrang() {
        return sTinhTrang;
    }

    /**
     * @param sTinhTrang the sTinhTrang to set
     */
    public void setsTinhTrang(String sTinhTrang) {
        this.sTinhTrang = sTinhTrang;
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
}
