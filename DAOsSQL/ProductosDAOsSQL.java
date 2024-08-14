package DAOsSQL;
public class ProductosDAOsSQL {
    public static String ObtenerNombres() {
        String sql = "SELECT A.idCategoria, A.nombre, B.nomProducto, B.canProducto, B.preProducto"
                + " FROM categorias A INNER JOIN productos B ON A.idCategoria = B.idCategoria";
        return sql;
    }
    
    public static String CreateNewproduct() {
        String sql = "INSERT INTO Productos (nomProducto, canProducto, preProducto, idCategoria) VALUES(?, ?, ?, ?)";
        return sql;
    }
    
    public static String UpdateProduct() {
        String sql = "UPDATE Productos SET nomProducto = ?, canProducto = ?, preProducto = ? WHERE idProducto = ?";
        return sql;
    }
    
    public static String DeleteProduct() {
        String sql = "DELETE FROM Productos WHERE nomProducto = ?";
        return sql;
    }
    
    public static String SearchProduct() {
        String sql = "SELECT A.idCategoria, A.nombre, B.nomProducto, B.canProducto, B.preProducto"
                + " FROM categorias A INNER JOIN productos B ON A.idCategoria = B.idCategoria WHERE A.idCategoria = ?";
        return sql;
    }
}
