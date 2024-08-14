package DAOs;

import Connection.UConnection;
import DAOsSQL.CategoriasDAOsSQL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public abstract class CategoriasDAO {
    
    protected abstract String CategoriasDAOsSQL();
    
    public void CreateNewCategory(String nombreCategoria) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = UConnection.GetConnection();
            String sql = CategoriasDAOsSQL.CreateNewCategory();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombreCategoria);
            ps.execute();
        }catch(Exception e) { 
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
