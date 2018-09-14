/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notamedia;

// Importo el paquete java.util para poder utilizar la clase Scanner

import java.util.*;

/**
 *
 * @author Amarico
 */
public class NotaMedia {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    
    //Realiza un programa que calcule la media de tres notas
    
    // Creo un objeto de la clase Scanner
    
    Scanner entrada = new Scanner(System.in);
    
    // Creo cuatro variables de tipo double
    
    double nota1, nota2, nota3;
    
    double notaMedia;
    
    // Pido las notas por teclado
    
    System.out.println("Introduce la primera nota: ");
    
    nota1 = entrada.nextDouble();
    
    System.out.println("Introduce la segunda nota: ");
    
    nota2 = entrada.nextDouble();
    
    System.out.println("Introduce la tercera nota: ");
    
    nota3 = entrada.nextDouble();
    
    // Calculo la nota media
    
    notaMedia = (nota1 + nota2 + nota3) / 3;
    
    // Imprimo el resultado
    System.out.print("La nota media es: " );
    
    // Imprime solo los dos primeros número decimales
    System.out.printf("%.2f\n", notaMedia);
    
    
    
    
    
    
  }
  
}
