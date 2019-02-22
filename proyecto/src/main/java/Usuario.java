/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nathaly Salazar
 */
public class Usuario {
    
    private String usuario;/**
     * Variable que guarda el nombre de usuario
     */
    private String clave;/**
     * Variable que guarda la clave de usuario 
     */
    
    public void registroUsuario(){
        /**
         * En este metodo el usuario se registrara
         */
    }
    public void loginUsuario(){
        /**
         * En este metodo el  usuario se logea para  ingresa a las ventas y adquirir libros  
         * En caso de ser un cliente se dirige a la clase Venta, donde podra hacer transacciones como buscar o comprar libros
         * En caso de ser un administrador se dirige a la parte de inventario donde se podra hacer transacciones como agregar libro y demas
         */
        
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
}
