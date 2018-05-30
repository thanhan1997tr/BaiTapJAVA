/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmd5;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ThanhAn
 */
public class testDatetime {
    public static Boolean ktraNgaySinh(String date){
        boolean kt = true;
        DateFormat d1 = new SimpleDateFormat("dd/MM/yyyy");
        d1.setLenient(false);
        ParsePosition position = new ParsePosition(0);
        Date d = d1.parse(date, position);
        kt = true;
        return kt;
    }
    public static void main(String[] args) throws ParseException {
        String d = "11/11/1997";
        if (ktraNgaySinh(d) == false){
            System.out.println("Sai");
        }
        else{
            System.out.println("Đúng");
        }
        
        int k;
        String n;
        for (k = d.length() - 1; k >= 0; k--){
            n = d.substring(k, k+1);
            if (n.equals("/"))
                break;
        }
        String kq = d.substring(k+1);
        System.out.println(kq);
//        Date date = DateFormat.getDateInstance().parse("");
//        System.out.println("Date: " + date);

        
        
        
//        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//        DateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");
//        df.setLenient(false);
//        Date d2 = null;
//        try {
//            d2 = df.parse(d);
//        } catch (Exception ex) {
//            //Logger.getLogger(testDatetime.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println("sai");
//        }
//        String date = df1.format(d2);
//        System.out.println(date);
//        
//        Date d3= null;
//        try {
//            d3 = df1.parse(date);
//        } catch (Exception ex) {
//            Logger.getLogger(testDatetime.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        String date1 = df.format(d2);
//        System.out.println(date1);
    }
}
