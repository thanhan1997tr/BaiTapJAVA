/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.*;
import DTO.*;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ThanhAn
 */
public class KhachHangBLL {
    KhachHangDAL khDal = new KhachHangDAL();
    public void LoadDsKh(JTable tb){
        Vector tbTieuDe = new Vector();
        Vector tbDong = new Vector();
        tbTieuDe.add("Mã khách hàng");
        tbTieuDe.add("Tên khách hàng");
        tbTieuDe.add("Địa chỉ");
        tbTieuDe.add("Điện thoại");
        for (KhachHangDTO kh : khDal.LoadDsKH()){
            Vector v = new Vector();
            v.add(kh.getsMaKhach());
            v.add(kh.getsHoTenKhach());
            v.add(kh.getsDiaChi());
            v.add(kh.getsDienThoai());
            tbDong.add(v);
            tb.setModel(new DefaultTableModel(tbDong, tbTieuDe));
        }
    }
    
    public Boolean ThemKh(KhachHangDTO kh){
        return khDal.Them(kh);
    }
    
    public Boolean XoaKh(String ma){
        return khDal.Xoa(ma);
    }
    
    public Boolean SuaKh(KhachHangDTO kh){
        return khDal.Sua(kh);
    }
    
    public Boolean ktraDienThoai(String dt){
        boolean kt = true;
        try {
            int d = Integer.parseInt(dt);
            kt = true;
        } catch (Exception e) {
            kt = false;
        }
        return kt;
    }
    
    public Boolean getTrungMa(String manhap){
        return khDal.getTrungMa(manhap);
    }
    
    public void LoadComboBoxTenKhachHang(JComboBox cbb){
        LoadComboBox lcb = new LoadComboBox();
        lcb.LoadComboBoxTenKhachHang(cbb);
    }
    
    public void TimKh(JTable tb, JComboBox cbb){
        Vector tbTieuDe = new Vector();
        Vector tbDong = new Vector();
        tbTieuDe.add("Mã khách hàng");
        tbTieuDe.add("Tên khách hàng");
        tbTieuDe.add("Địa chỉ");
        tbTieuDe.add("Điện thoại");
        for (KhachHangDTO kh : khDal.TimKH()){
            if (kh.getsHoTenKhach().toUpperCase().equals(cbb.getSelectedItem().toString().toUpperCase())){
                Vector v = new Vector();
                v.add(kh.getsMaKhach());
                v.add(kh.getsHoTenKhach());
                v.add(kh.getsDiaChi());
                v.add(kh.getsDienThoai());
                tbDong.add(v);
                tb.setModel(new DefaultTableModel(tbDong, tbTieuDe));
            }
            
        }
    }
}
