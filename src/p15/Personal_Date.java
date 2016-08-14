/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p15;

import java.util.Scanner;

/**
 *
 * @author akato
 */
public class Personal_Date {
    private Scanner lector;
    private String nombre, apellido, edad, cedula, fecha, direccion, tel;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

    public String getDireccion() {
        return direccion;
    }

    public String getTel() {
        return tel;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
    
    
    public void Loading_Data(){
        lector = new Scanner(System.in);
        System.out.println("Digite el nombre: ");
        nombre=lector.next();
        /*System.out.println("Digite el apellido: ");
        apellido=lector.next();
        System.out.println("Digite la edad: ");
        edad=lector.next();
        System.out.println("Digite la dirección: ");
        direccion=lector.next();
        System.out.println("Digite el fecha: ");
        fecha=lector.next();
        System.out.println("Digite el telefono: ");
        tel=lector.next();
        System.out.println("Digite la cedula: ");
        cedula=lector.next();*/
        
    }
    
    
    public void Data_Show(){
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(edad);
        System.out.println(direccion);
        System.out.println(tel);
        System.out.println(fecha);
        System.out.println(cedula);
        
        
    }
}
