package Factory;

import DAOs.ProductosDAO;
import DAOsSQL.ProductosDAOsSQL;

public class ProductosFactory extends ProductosDAO {

    @Override
    protected String ProductosDAOsSQL() {
        return ProductosDAOsSQL();
    }
}
