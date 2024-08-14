package Functions;

import java.util.Hashtable;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class FunctionsView implements Functions {
    private Hashtable<String, String> datos;

    public Hashtable<String, String> getDatos() {
        return datos;
    }

    public void setDatos(Hashtable<String, String> datos) {
        this.datos = datos;
    }
    
    @Override
    public Object[] CreateNewProduct() {
        Object newProduct[] = new Object[4];
        for(int x = 0; x < newProduct.length; x++) {
            switch (x) {
                case 0:
                    newProduct[x] = JOptionPane.showInputDialog("Categoría");
                    break;
                    
                case 1:
                    newProduct[x] = JOptionPane.showInputDialog("Nombre");
                    break;
                    
                case 2: 
                    newProduct[x] = JOptionPane.showInputDialog("Cantidades");
                    break;
                    
                default:
                    newProduct[x] = JOptionPane.showInputDialog("Precio");
                    break;
            }
        } return newProduct;
    }

    @Override
    public void UpdateProduct(JTable tabla) {
        setDatos(null);
        Hashtable<String, String> datos= new Hashtable<>();
        int row = tabla.getSelectedRow();
        datos.put("idProducto", tabla.getValueAt(row, 0).toString());
        datos.put("nomProducto", tabla.getValueAt(row, 2).toString());
        datos.put("canProducto", tabla.getValueAt(row, 3).toString());
        datos.put("preProducto", tabla.getValueAt(row, 4).toString().substring(3));
        setDatos(datos);
    }

    @Override
    public String SearchCategory(JTextField text) {
        return text.getText();
    }
}
