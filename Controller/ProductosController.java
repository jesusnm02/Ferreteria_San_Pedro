package Controller;

import DTO.ProductosDTO;
import Facade.Facade;
import java.util.Collection;
import java.util.Hashtable;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ProductosController {
    private static final Facade facade = new Facade();
    private static Hashtable<Integer, String> Categorias = new Hashtable<Integer, String>();
    public static void llenarTabla(JTable table) {
        Categorias = new Hashtable<Integer, String>();
        Collection<ProductosDTO> dto = facade.ObtenerProductos();
        DefaultTableModel modelo = new DefaultTableModel();
        table.setModel(modelo);
        // Agregamos las columnas al modelo
        modelo.addColumn("id");
        modelo.addColumn("Categoría");
        modelo.addColumn("Nombre");
        modelo.addColumn("Cantidades");
        modelo.addColumn("Precio");

        // Llenamos el modelo con los datos de los productos
        for(ProductosDTO dates: dto) {
            Object[] fila = new Object[5];
            fila[0] = dates.getIdCategoria();
            fila[1] = dates.getNomCategoria();
            fila[2] = dates.getNomProducto();
            fila[3] = dates.getCanProducto();
            fila[4] = "S/ " + dates.getPreProducto();
            Categorias.put(dates.getIdCategoria(), dates.getNomCategoria());

            modelo.addRow(fila);
        }
    }
    
    public static boolean CreateNewProduct(Object[] datos) {
        boolean enviado = false;
        String Categoria = "";
        String nombre = "";
        int cantidades = 0;
        Double precio = 0.00;
        
        for(int x = 0; x < datos.length; x++) {
            switch (x) {
                case 0:
                    Categoria = datos[x].toString();
                    break;
                    
                case 1:
                    nombre = datos[x].toString();
                    break;
                    
                case 2: 
                    cantidades = Integer.parseInt(datos[x].toString());
                    break;
                    
                default:
                    precio = Double.valueOf(datos[x].toString());
                    break;
            }
        } 
        
        for(int x = 0; x < Categorias.size(); x++) {
            if(Categorias.get(x + 1).equals(Categoria)) {
                enviado = facade.CreateNewProuct(nombre, cantidades, precio, x + 1);
                break;
            } else if((x + 1) == Categorias.size()) {
                facade.CreateNewCategory(Categoria);
                enviado = facade.CreateNewProuct(nombre, cantidades, precio, x + 2);
            }
        } 
        Categorias = null;
        return enviado;
    }
    
    public static boolean UpdateProduct(Hashtable<String, String> datos) {
        boolean enviado = false;
        String nomProducto = datos.get("nomProducto");
        int canProducto = Integer.parseInt(datos.get("canProducto"));
        Double preProducto = Double.parseDouble(datos.get("preProducto"));
        int id = Integer.parseInt(datos.get("idProducto"));
        enviado = facade.UpdateProduct(nomProducto, canProducto, preProducto, id);
        return enviado;
    }
    
    public static boolean DeleteProduct(String nomProduct) {
        boolean enviado = false;
        enviado = facade.DeleteProduct(nomProduct);
        return enviado;
    }
    
    public static void SearchProduct(JTable table, int id) {
        Categorias = new Hashtable<Integer, String>();
        Collection<ProductosDTO> dto = facade.SearchProduct(id);
        DefaultTableModel modelo = new DefaultTableModel();
        table.setModel(modelo);
        // Agregamos las columnas al modelo
        modelo.addColumn("id");
        modelo.addColumn("Categoría");
        modelo.addColumn("Nombre");
        modelo.addColumn("Cantidades");
        modelo.addColumn("Precio");

        // Llenamos el modelo con los datos de los productos
        for(ProductosDTO dates: dto) {
            Object[] fila = new Object[5];
            fila[0] = dates.getIdCategoria();
            fila[1] = dates.getNomCategoria();
            fila[2] = dates.getNomProducto();
            fila[3] = dates.getCanProducto();
            fila[4] = "S/ " + dates.getPreProducto();
            Categorias.put(dates.getIdCategoria(), dates.getNomCategoria());

            modelo.addRow(fila);
        }
    }
}
