/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import net.sourceforge.jtds.jdbcx.proxy.ConnectionProxy;

/**
 *
 * @author ThinhDo
 */
public class Connections {
    public static Connection con;
	 
	
        public Connections() {
            String	port = "1433";
            String	db_name = "QLPT";
            String	db_user = "Thinhdo";
            String	db_pass = "1234";
                if(con==null)
                {
                    try {
			String db_url = "jdbc:sqlserver://localhost:" + port + ";databaseName=" + db_name;
			System.out.println(db_url);
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection(db_url, db_user, db_pass);
                    } catch (Exception ex) {
			System.out.println(ex.getMessage());
                    }
                }
		
	}
        

}
