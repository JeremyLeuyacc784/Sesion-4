/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7.newpackage;

/**
 *
 * @author Estudiante
 */
public class Cliente extends Persona{
 
    private String codCliente;
    private String compras;

    public Cliente() {}

    public Cliente(String codCliente, String compras, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.codCliente = codCliente;
        this.compras = compras;
    }
    public String getCodCliente() {
        return codCliente;
    }
    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }
    public String getCompras() {
        return compras;
    }
    public void setCompras(String compras) {
        this.compras = compras;
    }
    
}  

