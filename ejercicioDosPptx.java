/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
import java.util.Scanner;
public class ejercicioDosPptx {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        float nota1 , nota2 , nota3, promedio;
        Scanner tec = new Scanner(System.in);
        System.out.println("Ingrese nombre del alumno");
        String nombre = tec.nextLine();
        System.out.println("Ingrese las 3 notas del alumno");
        nota1 = tec.nextFloat();
        nota2 = tec.nextFloat();
        nota3 = tec.nextFloat();
        promedio = (nota1+nota2+nota3)/3;
        
        System.out.println("El primedio de las 3 notas de" + nombre + "es" + promedio);
        
    }
}
