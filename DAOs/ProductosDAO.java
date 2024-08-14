package DAOs;

import Connection.UConnection;
import DAOsSQL.ProductosDAOsSQL;
import DTO.ProductosDTO;
import java.sql.ResultSet;
import java.util.Collection;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.util.Vector;

public abstract class ProductosDAO {
    
    protected abstract String ProductosDAOsSQL();
    
    public Collection<ProductosDTO> ObtenerProductos() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = UConnection.GetConnection();
            String sql = ProductosDAOsSQL.ObtenerNombres();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            Vector<ProductosDTO> ret = new Vector<ProductosDTO>();
            ProductosDTO Newproducto = null;
            while(rs.next()) {
                Newproducto = new ProductosDTO();
                Newproducto.setIdCategoria(rs.getInt("idCategoria"));
                Newproducto.setNomCategoria(rs.getString("nombre"));
                Newproducto.setNomProducto(rs.getString("nomProducto"));
                Newproducto.setCanProducto(rs.getInt("canProducto"));
                Newproducto.setPreProducto(rs.getDouble("preProducto"));
                ret.add(Newproducto);
            }
            return ret;
        }catch(Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
    
    public boolean CreateNewProducto(
            String nomProducto, 
            int canProducto, 
            Double preProducto, 
            int idCategoria
    ) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = UConnection.GetConnection();
            String sql = ProductosDAOsSQL.CreateNewproduct();
            ps = con.prepareStatement(sql);
            ps.setString(1, nomProducto);
            ps.setInt(2, canProducto);
            ps.setDouble(3, preProducto);
            ps.setInt(4, idCategoria);
            ps.execute();
            return true;
            
        }catch(Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
    
    public boolean UdpateProduct(String nomProducto, int canProducto, Double preProducto, int id) {
        Connection con = null;
        PreparedStatement ps = null;
        
        try {
            con = UConnection.GetConnection();
            String sql = ProductosDAOsSQL.UpdateProduct();
            ps = con.prepareStatement(sql);
            ps.setString(1, nomProducto);
            ps.setInt(2, canProducto);
            ps.setDouble(3, preProducto);
            ps.setInt(4, id);
            ps.executeUpdate();
            return true;
            
        }catch(Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
    
    public boolean DeleteProduct(String nomProduct) {
        Connection con = null;
        PreparedStatement ps = null;
    
        try {
            con = UConnection.GetConnection();
            String sql = ProductosDAOsSQL.DeleteProduct();
            ps = con.prepareStatement(sql);
            ps.setString(1, nomProduct);
            ps.execute();
            return true;
        }catch(Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
    
    public Collection<ProductosDTO> SearchProduct(int id) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            con = UConnection.GetConnection();
            String sql = ProductosDAOsSQL.SearchProduct();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            Vector<ProductosDTO> ret = new Vector<ProductosDTO>();
            ProductosDTO Search = null;
            while(rs.next()) {
                Search = new ProductosDTO();
                Search.setIdCategoria(rs.getInt("idCategoria"));
                Search.setNomCategoria(rs.getString("nombre"));
                Search.setNomProducto(rs.getString("nomProducto"));
                Search.setCanProducto(rs.getInt("canProducto"));
                Search.setPreProducto(rs.getDouble("preProducto"));
                ret.add(Search);
            }
            return ret;
        }catch(Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
