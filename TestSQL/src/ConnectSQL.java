
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ThanhAn
 */
public class ConnectSQL {
    Connection conn;
    public Connection getConnectionSQL(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;instance=SQLEXPRESS;databaseName=QuanLyQuanCf_Form","sa", "ZthanhanZ1997");
        } catch (SQLException ex) {
            Logger.getLogger(ConnectSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    
    public void Close(){
        if(conn != null){
            try {
                if(!conn.isClosed()){
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ConnectSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        conn = null;
    }
}
