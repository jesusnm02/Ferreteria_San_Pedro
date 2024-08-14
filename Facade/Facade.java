package Facade;

import DAOs.CategoriasDAO;
import DAOs.ProductosDAO;
import DTO.ProductosDTO;
import Factory.CategoriasFactory;
import Factory.ProductosFactory;
import java.util.Collection;

public class Facade {
    public Collection<ProductosDTO> ObtenerProductos() {
        ProductosDAO datosNombres = new ProductosFactory();
        return datosNombres.ObtenerProductos();
    }
    
    public boolean CreateNewProuct(
            String nomProducto, 
            int canProducto, 
            Double preProducto, 
            int idCategoria
    ) {
        ProductosDAO newproduct = new ProductosFactory();
        return newproduct.CreateNewProducto(nomProducto, canProducto, preProducto, idCategoria);
    }
    
    public void CreateNewCategory(String nombreCategoria) {
        CategoriasDAO newcategory = new CategoriasFactory();
        newcategory.CreateNewCategory(nombreCategoria);
    }
    
    public boolean UpdateProduct(String nomProducto, int canProducto, Double preProducto, int id) {
        ProductosDAO updateproduct = new ProductosFactory();
        return updateproduct.UdpateProduct(nomProducto,canProducto, preProducto, id);
    }
    
    public boolean DeleteProduct(String nomProduct) {
        ProductosDAO deleteproduct = new ProductosFactory();
        return deleteproduct.DeleteProduct(nomProduct);
    }
    
    public Collection<ProductosDTO> SearchProduct(int id) {
        ProductosDAO searchproduct = new ProductosFactory();
        return searchproduct.SearchProduct(id);
    }
}
