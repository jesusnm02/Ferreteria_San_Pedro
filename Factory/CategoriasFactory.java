package Factory;

import DAOs.CategoriasDAO;
import DAOsSQL.CategoriasDAOsSQL;

public class CategoriasFactory extends CategoriasDAO {

    @Override
    protected String CategoriasDAOsSQL() {
        return CategoriasDAOsSQL();
    }
}
