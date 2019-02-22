/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nathaly Salazar 
 * @version 1.0
 * 
 */
public class Inventario {
    
    
   
    private int codigo;/**
     * Variable que guarda el codigo del libro por el cual estara registrado y se identificara como llave primaria
     */
    private String nombreLibro;/**
     * Variable que guarda el nombre del libro para posibles busquedas
     */
    
    private String autor;/**
     * Variable que guarda el nombre del autor del libro
     */
    private float version;/**
     * Variable que guarda la version del libro 
     */
    private String editorial;/**
     * Variable que guarda la editorial del libro 
     */
    private int precio;/**
     * Variable que guarda el precio del libro
     */
    private String categoria;/**
     * Variable que guarda la categoria del libro como romance, drama, etc
     */
    private String busqueda;/**
     * Variable que se solicita para realizar una busqueda dentro de todos los libros almacenados por el nombre del libro
     */
    private int cantidadLibros;

    public Inventario(int cantidadLibros) {/**
     * Constructor que inicializa la variable que hace referencia a la cantidad de los libros
     */
        this.cantidadLibros = cantidadLibros;
    }

    public Inventario(int codigo, String autor, float version, String editorial, int precio, String nombreLibro) {/**
     * Constructor que inicializa las variables que hacen parte de las principales caracteristicas del libro
     */
        this.codigo = codigo;
        this.autor = autor;
        this.version = version;
        this.editorial = editorial;
        this.precio = precio;
        this.nombreLibro = nombreLibro;
    }

    
    
    public void agregarLibro(){
        /**
         * En este metodo se deben llenar las variables principales como nombre del libro, autor, etc. Para agregar al inventario
         */
        
    }
    public void mostrarLibro(){
        /**
         * En este metodo se debe mostrar los libros segun el parametro de busqueda, es decir que si el usuario ingresa la palabra "soledad" deberian
         * salir los libros donde el titulo se relacione con la palabra que digitaron
         */
        
    }
    
    public void actualizarCantidad(){
        /**
         * En este metodo se podra actualizar la cantidad en existencia dentro del inventario de cada uno de los libros recibiendo datos de la clase
         * Venta, como el codigo del libro, y la cantidad a comprar para descontar los libros existentes del inventario
         */
    }
    public void masVendido(){
        /**
         * Este metodo evaluará la cantidad existente de cada libro y el que menos cantidad tenga sera el mas vendido 
         */
    }        
    public void menosVendido(){
        /**
         * Este metodo evaluara la cantidad existente de cada libro y el que mas cantidad tenga, sera el menos vendido
         */
        
    }
    public void masBarato(){
        /**
         * Este metodo evaluara el menor precio entre todos los libros y asi sera el mas economico
         */
    }
    public void masCaro(){
        /**
         * Este metodo evaluara el mayor precio entre todos los libros y asi sera el mas caro
         */
    }
    public void casiAgotado(){
        /**
         * Este metodo mirara que libros tienen cantidad entre 1 y 3 existentes para enviar una alerta con los datos del libro que esta por agotarse
         */
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getVersion() {
        return version;
    }

    public void setVersion(float version) {
        this.version = version;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getBusqueda() {
        return busqueda;
    }

    public void setBusqueda(String busqueda) {
        this.busqueda = busqueda;
    }

    public int getCantidadLibros() {
        return cantidadLibros;
    }

    public void setCantidadLibros(int cantidadLibros) {
        this.cantidadLibros = cantidadLibros;
    }
    
    
    
    
}
