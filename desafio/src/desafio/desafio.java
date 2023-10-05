package desafio;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

public class desafio {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        int resultado = random.nextInt(10); 

        int numero=-1;

        try { for (int i = 0; i < 10; i++) {
            System.out.println("\nIngresa un numero entre 0 y 100: ");
            System.out.println("Tu numero en el intento " + (i + 1) + " es: ");
            numero = entrada.nextInt();

            if (numero == resultado) {
                System.out.println("¡Ganaste! tu cantidad de intento es: " + (i + 1) );
                break;
            }  
            
            if (numero < 0) {
                throw new ArithmeticException();
              }
            if (numero > 100) {
                throw new ArithmeticException();
            }
            
            	 if(resultado<numero) {
                System.out.println("El numero es menor.");
         
            	 }
            	 if(resultado>numero) {
                     System.out.println("El numero es mayor.");
              
                 	 }
            }
        
        }catch (ArithmeticException e) { 
            System.out.println("Error: numero negativo o mayor 100.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar un dato valido.");
        } 
        
        if (numero != resultado) {
            System.out.println("Perdiste. El número ganador era: " + resultado);
        }
    }
}