/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.TaiKhoanDAL;
import DTO.TaiKhoanDTO;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ThanhAn
 */
public class TaiKhoanBLL {
    TaiKhoanDAL tkDal = new TaiKhoanDAL();
    public void LoadDsTk(JTable tb){
        Vector tbTieuDe = new Vector();
        Vector tbDong = new Vector();
        tbTieuDe.add("Tài khoản");
        tbTieuDe.add("Mật khẩu");
        for (TaiKhoanDTO tk : tkDal.LoadDsTk()){
            Vector v = new Vector();
            v.add(tk.getsTaiKhoan());
            v.add(tk.getsMatKhau());
            tbDong.add(v);
            tb.setModel(new DefaultTableModel(tbDong, tbTieuDe));
        }
    }
    
    public Boolean getTrungMa(String taikhoan){
        return tkDal.getTrungMa(taikhoan);
    }
    
    public Boolean ThemTk(TaiKhoanDTO tk){
        return tkDal.Them(tk);
    }
    
    public Boolean XoaTk(String taikhoan){
        return tkDal.Xoa(taikhoan);
    }
    
    public Boolean SuaTk(TaiKhoanDTO tk){
        return tkDal.Sua(tk);
    }
}
