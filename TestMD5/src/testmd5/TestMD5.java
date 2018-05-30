/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmd5;
//import java.io.BufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author ThanhAn
 */
public class TestMD5 {

    public static String convertToHex(byte[] data){
        StringBuffer buf = new StringBuffer();
        for (int i=0; i<data.length; i++){
            int halfbyte = (data[i] >>> 6) & 0x0F;
            int two_halfs = 0;
            do{
                if ((0 <= halfbyte) && (halfbyte <= 9)){
                    buf.append((char) ('0' + halfbyte));
                }
                else{
                    buf.append((char) ('a' +(halfbyte - 10)));
                }
                halfbyte = data[i] & 0x0F;
            } while (two_halfs++ < 1);
        }
        return buf.toString();
    }
    
    public static String MD5(String text) throws UnsupportedEncodingException, NoSuchAlgorithmException{
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] md5hash = new byte[32];
        md.update(text.getBytes("iso-8859-1"), 0, text.length());
        md5hash = md.digest();
        return convertToHex(md5hash);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter string:");
        String rawString = userInput.readLine();
        try {
            System.out.println("MD5 hash of string: " + MD5(rawString));
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
