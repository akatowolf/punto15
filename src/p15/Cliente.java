
package p15;

import java.util.Scanner;

public class Cliente extends Personal_Date{
    private double saldo=0;
    private Scanner lector; 
    
        
    public void Actualizar_Datos(){
        lector = new Scanner(System.in);
        System.out.println("Digite la nueva dirección: ");
        this.setDireccion(lector.next());
        System.out.println("Digite el nuevo telefono: ");
        this.setTel(lector.next());
    }

    
   
    
    public void Consignar(){
        lector = new Scanner(System.in);
        double saldo2;
        System.out.println("Digite el valor a consignar: ");
        saldo2 = lector.nextDouble();
        saldo=saldo+saldo2;
        System.out.println("El nuevo saldo es: " + saldo);
        
        
    }

    public double getSaldo() {
        return saldo;
    }
    
    
    public void Retirar(){
        lector = new Scanner(System.in);
        double saldo2;
        System.out.println("Digite el valor a retirar: ");
        saldo2 = lector.nextDouble();
        if(saldo2>saldo)
            System.out.println("Saldo insuficiente: ");
        else 
            saldo = saldo - saldo2;
        System.out.println("El saldo restante es: "+saldo);
    }
    
    
    
}
