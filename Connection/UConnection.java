package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Hashtable;

public class UConnection {
    private static Connection con = null;
    
    //Obtenemos los datos de connexion del XML
    private static final String path = "src/Root/dbConnection.xml";
    private static Hashtable date = new GetXML().getDate(path);
    
    //definimos los parametros de connexion
    private static final String usr = date.get("usr").toString();
    private static final String pwd = date.get("pwd").toString();
    private static final String url = date.get("url").toString();
    private static final String driver = date.get("driver").toString();
    
    public static Connection GetConnection() {
        try{ 
            if(con == null){ 
                Runtime.getRuntime().addShutdownHook( new MiShDwnHook());
                
                Class.forName(driver);
                con = DriverManager.getConnection(url, usr, pwd);
            }
            return con;
        }catch(Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
    
    static class MiShDwnHook extends Thread {
        public void run() {
            try {
                Connection con = UConnection.GetConnection();
                con.close();
            }catch(Exception E) {
                E.printStackTrace();
                throw new RuntimeException();
            }
        }
    }
}
