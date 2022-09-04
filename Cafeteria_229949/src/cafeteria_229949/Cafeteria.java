/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria_229949;

import java.util.Scanner;

/**
 *
 * @author Ale
 */
public class Cafeteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Beverage bebida;
        Scanner entradaEscaner = new Scanner (System.in);
        int entradaTeclado;
        String entradaTecladoS = "", entradaTecladoE;
        while(!(entradaTecladoS.matches("[3]"))){
            bebida = null;
            entradaTeclado = 0;
            entradaTecladoS = "";
            entradaTecladoE = "";
            System.out.printf("%15s %n", "Opciones");
            System.out.println("1.- Introducir bebida");
            System.out.println("2.- Ejecutar prueba");
            System.out.println("3.- Salir");
            while(!(entradaTecladoS.matches("[1-3?]"))){
                System.out.println("Seleccione la opción a realizar");
                entradaTecladoS = entradaEscaner.nextLine();
                if(entradaTecladoS.matches("[0-9]")){
                    entradaTeclado = Integer.parseInt(entradaTecladoS);
                }
            }
            
            if(entradaTeclado == 1){
                System.out.printf("%15s %n", "Menú");
                System.out.printf("%-15s %10d %n", "1.- House Blend", 25);
                System.out.printf("%-15s %10d %n", "2.- Dark Roast", 40);
                System.out.printf("%-15s %10d %n", "3.- Decaf", 50);
                System.out.printf("%-15s %10d %n", "4.- Expresso", 65);

                entradaTecladoS = "S";
                while(!(entradaTecladoS.matches("[1-4?]"))){
                    System.out.println("Seleccione el número de su base");
                    entradaTecladoS = entradaEscaner.nextLine();
                    if(entradaTecladoS.matches("[0-9]")){
                        entradaTeclado = Integer.parseInt(entradaTecladoS);
                    }
                }

                switch(entradaTeclado){
                    case 1:
                        bebida = new HouseBlend();
                        break;
                    case 2:
                        bebida = new DarkRoast();
                        break;
                    case 3:
                        bebida = new Decaf();
                        break;
                    case 4:
                        bebida = new Expresso();
                        break;
                }
                entradaTecladoS = "D";
                while(!(entradaTecladoS.toUpperCase().matches("[SN]"))){
                    System.out.println("¿Desea agregar condimentos?");
                    entradaTecladoS = entradaEscaner.nextLine();
                    entradaTecladoS = String.valueOf(entradaTecladoS.charAt(0));
                    if(entradaTecladoS.toUpperCase().matches("[S]")){
                        System.out.printf("%15s %n", "Condimentos");
                        System.out.printf("%-10s %10d %n", "1.- Leche", 10);
                        System.out.printf("%-10s %10d %n", "2.- Soya", 10);
                        System.out.printf("%-10s %10d %n", "3.- Mocha", 10);

                        while(!(entradaTecladoS.matches("[1-3?]"))){
                            System.out.println("Seleccione el número de su condimento");
                            entradaTecladoS = entradaEscaner.nextLine();
                            if(entradaTecladoS.matches("[0-9]")){
                                entradaTeclado = Integer.parseInt(entradaTecladoS);
                            }
                        }

                        switch(entradaTeclado){
                            case 1:
                                bebida = new Milk(bebida);
                                break;
                            case 2:
                                bebida = new Soy(bebida);
                                break;
                            case 3:
                                bebida = new Mocha(bebida);
                                break;

                        }
                    }
                    if(entradaTecladoS.toUpperCase().matches("[N]")){
                        break;
                    }
                    entradaTecladoS = "";
                }
                System.out.println("Su bebida contiene: " + bebida.getDescription());
                System.out.println("Costo total de su bebida: $" + bebida.Costo());
                while(!(entradaTecladoE.matches("[A-Z?]"))&&!(entradaTecladoE.matches("[a-z?]"))&&!(entradaTecladoE.matches("[0-9]"))){
                    System.out.println("introduzca una letra o número para continuar");
                    entradaTecladoE = entradaEscaner.nextLine();
                    entradaTecladoE = String.valueOf(entradaTecladoS.charAt(0));
                }
            }
            else{
                if(entradaTeclado == 2){
                    bebida = new Expresso();
                    bebida = new Milk(bebida);
                    bebida = new Mocha(bebida);
                    bebida = new Mocha(bebida);
                    bebida = new Soy(bebida);
                    bebida = new Milk(bebida);
                    bebida = new Milk(bebida);
                    System.out.println("Su bebida contiene: " + bebida.getDescription());
                    System.out.println("Costo total de su bebida: $" + bebida.Costo());
                    entradaTecladoS = " ";
                    while(!(entradaTecladoE.matches("[A-Z?]"))&&!(entradaTecladoE.matches("[a-z?]"))&&!(entradaTecladoE.matches("[0-9]"))){
                        System.out.println("introduzca una letra o número para continuar");
                        entradaTecladoE = entradaEscaner.nextLine();
                    }
                }
                if(entradaTeclado == 3){
                    break;
                }
            }
        }
        
        
    }
    
}
