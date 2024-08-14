package DAOsSQL;
public class CategoriasDAOsSQL {
    public static String CreateNewCategory() {
        String sql = "INSERT INTO categorias (nombre) VALUES (?)";
        return sql;
    }
}
