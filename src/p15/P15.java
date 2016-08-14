
package p15;

import java.util.Scanner;

public class P15 {
    
    
    
    public static void main(String[] args) {
        int contClientes=0;
        Cliente client [] = new Cliente[10];
        //crea los objetos
        for (int i=0;i<client.length;i++){
            client[i]=new Cliente();
        }
    
        Scanner lector = new Scanner(System.in);
        int opcion;
        
        do{
            System.out.println("Digite: 1. Ingresar datos 2. Mostrar datos 3. Consignar "
                + "4. Retirar 5. Consultar saldo 6. Actualizar datos 7. Borrar 8. Salir");
        
        opcion=lector.nextInt();
            switch(opcion){
                case 1:
                    //Ingresa usuarios nuevos
                    client[contClientes].Loading_Data();
                    contClientes++;
                    System.out.println("Los clientes en el sistema son: " + contClientes);
                    break;
                
                case 2:
                    //Muestra los datos de un usuario si se indica el nombre
                    System.out.println("Ingrese el nombre del usuario: ");
                    String x;
                    x=lector.next();
                    for(int i=0; i<contClientes; i++){
                        if (client[i].getNombre().equals(x)){
                            System.out.println("Los datos del usuario son: ");
                            client[i].Data_Show();
                            break;
                            }else
                                System.out.println("El usuario no existe: ");
                            break;    
                    }
                    break;
                case 3:
                    //consigna a la cuenta de un usuario
                    System.out.println("Ingrese el nombre del usuario: ");
                    x=lector.next();
                    for(int i=0; i<contClientes; i++){
                        if (client[i].getNombre().equals(x)){
                            client[i].Consignar();
                            break;
                            }else{
                                System.out.println("El usuario no existe. ");
                            break;
                        }
                        
                    }
                    break;
                    
                case 4:
                    //permite retirar de la cuenta de un usuario
                    System.out.println("Ingrese el nombre del usuario: ");
                    x=lector.next();
                    for(int i=0; i<contClientes; i++){
                        if (client[i].getNombre().equals(x)){
                            client[i].Retirar();
                            break;
                            }else{
                                System.out.println("El usuario no existe.");
                            break;}    
                    }
                    break;
                    
                case 5:
                    //permite mostrar el saldo actual en la cuenta de un usuario
                    System.out.println("Ingrese el nombre del usuario: ");
                    x=lector.next();
                    for(int i=0; i<contClientes; i++){
                        if (client[i].getNombre().equals(x)){
                            double a=client[i].getSaldo();
                            System.out.println("El saldo es: " + a);
                            break;
                            }else
                                System.out.println("El usuario no existe.");
                            break;    
                    }
                    break;
                    
                case 6:    
                    //actualiza los datos de un usuario
                    System.out.println("Ingrese el nombre del usuario: ");
                    x=lector.next();
                    for(int i=0; i<contClientes; i++){
                        if (client[i].getNombre().equals(x)){
                            client[i].Actualizar_Datos();
                            break;
                            }else
                                System.out.println("El usuario no existe.");
                            break;    
                    }
                    break;
                
                case 7:
                    //permite eliminar a un usuario del sistema
                    System.out.println("Ingrese el nombre del usuario: ");
                    
                    x=lector.next();
                    for(int i=0; i<contClientes; i++){
                        if (client[i].getNombre().equals(x)){ 
                            /*client[i].getNombre().equals(x)*/
                            contClientes --;
                            for(int j=0; j<contClientes;j++){
                                client[j]=client[(j+1)];
                                client[j].Data_Show();
                                break;  
                            }
                        }else{
                            System.out.println("El usuario no existe.");
                        break;}
                    }
                    break;
            }
        }while(opcion!=8);
    }
    
    
}
