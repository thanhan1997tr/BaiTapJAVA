/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.DangNhapDAL;
import DTO.TaiKhoanDTO;

/**
 *
 * @author ThanhAn
 */
public class DangNhapBLL {
    DangNhapDAL dnDal = new DangNhapDAL();
    public boolean DangNhap(TaiKhoanDTO tk){
        return dnDal.DangNhap(tk);
    }
}
