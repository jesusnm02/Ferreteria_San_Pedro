package DTO;
public class ProductosDTO {
    private int idProducto;
    private String nomProducto;
    private int canProducto;
    private Double preProducto;
    private int idCategoria;
    private String nomCategoria;

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    public int getCanProducto() {
        return canProducto;
    }

    public void setCanProducto(int canProducto) {
        this.canProducto = canProducto;
    }

    public Double getPreProducto() {
        return preProducto;
    }

    public void setPreProducto(Double preProducto) {
        this.preProducto = preProducto;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNomCategoria() {
        return nomCategoria;
    }

    public void setNomCategoria(String nomCategoria) {
        this.nomCategoria = nomCategoria;
    }
}
