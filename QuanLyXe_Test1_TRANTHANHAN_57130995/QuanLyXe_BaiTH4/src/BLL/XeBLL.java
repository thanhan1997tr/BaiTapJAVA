/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.LoadComboBox;
import DAL.XeDAL;
import DTO.XeDTO;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ThanhAn
 */
public class XeBLL {
    XeDAL xeDAL = new XeDAL();
    public void LoadDSXe(JTable tb){
        Vector tbTieuDe = new Vector();
        Vector tbDong = new Vector();
        tbTieuDe.add("Số xe");
        tbTieuDe.add("Tình trạng");
        tbTieuDe.add("Mã loại");
        for (XeDTO x : xeDAL.LoadDSXe()){
            Vector v = new Vector();
            v.add(x.getsSoxe());
            v.add(x.getsTinhTrang());
            v.add(x.getsMaLoai());
            tbDong.add(v);
            tb.setModel(new DefaultTableModel(tbDong, tbTieuDe));
        }
        xeDAL.LoadDSXe();
    }
    
    public void LoadCbbTenLoai(JComboBox cbb){
        LoadComboBox lcb = new LoadComboBox();
        lcb.LoadComboBoxTenLoai(cbb);
    }
    
    public String getValueComboBoxTenLoai(JComboBox cbbdp){
        LoadComboBox lcb = new LoadComboBox();
        return lcb.getValueComboBoxTenLoai(cbbdp);
    }
    
    public Boolean ThemXe(XeDTO xe){
        return xeDAL.ThemXe(xe);
    }
    
    public Boolean XoaXe(String soxe){
        return xeDAL.XoaXe(soxe);
    }
    
    public Boolean SuaXe(XeDTO xe){
        return xeDAL.SuaXe(xe);
    }
    
    public boolean getTrungMa(String manhap){
        return xeDAL.getTrungMa(manhap);
    }
}
