/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

import java.util.Scanner;
public class ejercicioTresPptx {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        String nombre,sector;
        int horasCant, sueldoTotal;
        Scanner aqui=new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado");
        nombre=aqui.next();
        System.out.println("Ingrese sector del empleado");
        sector=aqui.next();
        System.out.println("Teniendo en cuenta el sector del empleado se le va a abonar $350 la hora de trabajo");
        final int precioHora=350;
        System.out.println("Ingrese la cantidad de horas trabajadas");
        horasCant=aqui.nextInt();
        sueldoTotal=horasCant*precioHora;
        System.out.println("El sueldo total de" + nombre + "es" + sueldoTotal);
    }
}
