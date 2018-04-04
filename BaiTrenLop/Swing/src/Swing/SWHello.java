/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author ThanhAn
 */
public class SWHello extends JFrame{
    public SWHello(){
        setTitle("SW1");
        setSize(300,300);
        setLayout(new FlowLayout());
        
        Container cp = getContentPane();
        
        JLabel lbHello = new JLabel("Hello Swing");
        cp.add(lbHello);
        setVisible(true);
    }
    public static void main(String[] args) {
        new SWHello();
    }
}
