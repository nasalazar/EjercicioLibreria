/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nathaly Salazar
 * @version  1.0
 */
public class Venta {

    private int codigoLibro;/**
     * Esta variable guarda el codigo de cada libro
     */
    private String busqueda;/**
     * 
     * Esta variable guarda la palabra con la cual se hara la busqueda del libro 
     * @param codigoLibro
     */

    public Venta(int codigoLibro) {/**
     * Este cocnstructor inicializa la variable de codigo del libro  
     
     */
        this.codigoLibro = codigoLibro;
    }

    public Venta(String busqueda) {/**
     * Este constructor inicializa la variable de busqueda
     */
        this.busqueda = busqueda;
    }

    public void buscarLibro(){/**
     * Este metodo busca el libro segundo la variable de busqueda que digita el usuario, filtrando por el nombre del libro
     */
        
    }
    
    public void comprarLibro(){/**
     * Este metodo selecciona el codigo del libro para llevarlo a el metodo actualizarCantidad de la clase inventario y descontar la cantidad existente
     * del libro que se selecciono 
     */
        
    }

    public int getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(int codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public String getBusqueda() {
        return busqueda;
    }

    public void setBusqueda(String busqueda) {
        this.busqueda = busqueda;
    }
    
    
    
}
