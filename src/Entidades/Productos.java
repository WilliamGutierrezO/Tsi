package Entidades;


public class Productos {
    private int id_producto;
    private int id_proveedor;
    private String nom_producto;
    private String detalle_producto;
    private String marca_producto;
    private int valor_producto;
    private int stock_producto;
    
    public Productos(){
        
    }
    
    public Productos(int Id, String nombre, int valor, int stock){
        this.id_producto = Id;
        this.nom_producto = nombre;
        this.valor_producto = valor;
        this.stock_producto = stock;
    }
    
    public int getId_producto() {
        return id_producto;
    }
    
    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getNom_producto() {
        return nom_producto;
    }

    public void setNom_producto(String nom_producto) {
        this.nom_producto = nom_producto;
    }

    public String getDetalle_producto() {
        return detalle_producto;
    }

    public void setDetalle_producto(String detalle_producto) {
        this.detalle_producto = detalle_producto;
    }

    public String getMarca_producto() {
        return marca_producto;
    }

    public void setMarca_producto(String marca_producto) {
        this.marca_producto = marca_producto;
    }

    public int getValor_producto() {
        return valor_producto;
    }

    public void setValor_producto(int valor_producto) {
        this.valor_producto = valor_producto;
    }

    public int getStock_producto() {
        return stock_producto;
    }

    public void setStock_producto(int stock_producto) {
        this.stock_producto = stock_producto;
    }
    
    public int compareTo(Productos s){
        return this.nom_producto.compareTo(s.getNom_producto());
    }
    
    public String toString(){
        return id_producto + " - Nombre: " + nom_producto + " - Valor: " + valor_producto + " - Stock: " + stock_producto;
    }
    
    
}
