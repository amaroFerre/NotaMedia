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
    System.out.print("La nota media es: ");

    // Imprime solo los dos primeros número decimales
    System.out.printf("%.2f\n", notaMedia);

    // Amplía el programa anterior para que diga la nota del boletín (insuficiente,
    //suficiente, bien, notable o sobresaliente). 
    if ((notaMedia >= 0) && (notaMedia <= 4.9)) {

      System.out.println("Los siento con la nota " + notaMedia + " tienes un INSUFICIENTE");

    } else if ((notaMedia >= 5) && (notaMedia <= 5.9)) {

      System.out.println("Seguro que te puedes esforzar un poco más, con la nota,  " + notaMedia + " tienes SUFICIENTE");

    } else if ((notaMedia >= 6) && (notaMedia <= 6.9)) {

      System.out.println("Vas por el buen camino con un " + notaMedia + "  tienes un BIEN");

    } else if ((notaMedia >= 7) && (notaMedia <= 8.9)) {

      System.out.println("Con la nota " + notaMedia + " tines un NOTABLE");

    } else if ((notaMedia >= 9) && (notaMedia <= 10)) {

      System.out.println("TIENES UN SOBRESALIENTE");
    } else {
      System.out.println("LO SIENTO NO ES UNA NOTA CORRECTA");
    }

  }

}
