/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
/**
 *
 * @author ThanhAn
 */
public class Bai1 extends Frame{
    TextField txtA, txtB, txtKQ;
    Label lbA, lbB, lbKQ;
    Button btnCong, btnTru, btnNhan, btnChia;;
    public Bai1(){
        //Frame f = new Frame();
        setSize(400,150);
        setTitle("Bài 1 AWT");
        GridLayout lay = new GridLayout(4,2);
        setLayout(lay);
        lbA = new Label("A = ");
        add(lbA);
        txtA = new TextField(10);
        add(txtA);
        
        lbB = new Label("B = ");
        add(lbB);
        txtB = new TextField(10);
        add(txtB);
        
        btnCong = new Button("+");
        btnCong.addActionListener(new LangNgheTong());
        add(btnCong);
        
        
        btnTru = new Button("-");
        btnTru.addActionListener(new LangNgheHieu());
        add(btnTru);
        
        btnNhan = new Button("*");
        btnNhan.addActionListener(new LangNgheTich());
        add(btnNhan);
        
        btnChia = new Button("/");
        btnChia.addActionListener(new LangNgheThuong());
        add(btnChia);
        
        Label lb = new Label("");
        add(lb);
        Panel pn = new Panel();
        pn.setLayout(new FlowLayout());
        pn.add(btnCong);
        pn.add(btnTru);
        pn.add(btnNhan);
        pn.add(btnChia);
        
        add(pn);
        lbKQ = new Label("KQ = ");
        add(lbKQ);
        txtKQ = new TextField(20);
        add(txtKQ);
        
        XuLySuKienCuaSo ln = new XuLySuKienCuaSo();
        addWindowListener(ln);
        setVisible(true);
    }
    class LangNgheTong implements ActionListener{
        public void actionPerformed(ActionEvent e){
            float a = Float.parseFloat(txtA.getText());
            float b = Float.parseFloat(txtB.getText());
            
            float Tong = a + b;
            txtKQ.setText(String.valueOf(Tong));
        }
    }
    class LangNgheHieu implements ActionListener{
        public void actionPerformed(ActionEvent e){
            float a = Float.parseFloat(txtA.getText());
            float b = Float.parseFloat(txtB.getText());
            
            float Hieu = a - b;
            txtKQ.setText(String.valueOf(Hieu));
        }
    }
    class LangNgheTich implements ActionListener{
        public void actionPerformed(ActionEvent e){
            float a = Float.parseFloat(txtA.getText());
            float b = Float.parseFloat(txtB.getText());
            
            float Tich = a * b;
            txtKQ.setText(String.valueOf(Tich));
        }
    }
    class LangNgheThuong implements ActionListener{
        public void actionPerformed(ActionEvent e){
            float a = Float.parseFloat(txtA.getText());
            float b = Float.parseFloat(txtB.getText());
            
            float Thuong = a / b;
            txtKQ.setText(String.valueOf(Thuong));
        }
    }
    
    static class XuLySuKienCuaSo implements WindowListener{
        public void windowOpened(WindowEvent e) {
        }
        public void windowClosing(WindowEvent e) {
            System.exit(0);  // Kết thúc chương trình
        }
        public void windowClosed(WindowEvent e) {
        }
        public void windowIconified(WindowEvent e) {
        }
        public void windowDeiconified(WindowEvent e) {
        }
        public void windowActivated(WindowEvent e) {
        }
        public void windowDeactivated(WindowEvent e) {
        }
    }
    public static void main(String[] args) {
    // TODO code application logic here
        new Bai1();
    }
}

