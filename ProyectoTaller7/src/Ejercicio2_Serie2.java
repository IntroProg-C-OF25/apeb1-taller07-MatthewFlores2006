/***
 * Generar un programa Java que permita ingresar 4 estudiantes; 
 * por cada uno de ellos ingresar el nombre del estudiante, 
 * el promedio de ciclo. Presentar el siguiente reporte  		
 *Estudiante1 	10 	Aprobado
 *Estudiante2 	6.9 	Reprobado
 *Estudiante3 	7 	Aprobado
 *Estudiante4 	5 	Reprobado
 * Atención; con base al valor del promedio, 
 * usted debe asignar en cada registro el tipo Aprobado o Reprobado.
 */
import java.util.Scanner;
public class Ejercicio2_Serie2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nom, estado;
        double prom;
        int cont;
        cont = 1;
        while(cont <= 4) 
        {
            System.out.println("Ingrese el nombre y promedio del estudiante " + cont + " ");
            nom = in.next();
            prom = in.nextDouble(); 
            if (prom >= 7)
                estado = "Aprobado";
            else 
                estado = "Reprobado";
            cont++;
            System.out.printf("| %s\t| %s | %s|%n", "NOMBRE", "PROMEDIO", "ESTADO");
            System.out.printf("| %s\t| %.2f\t|%s|%n", nom, prom, estado);
        }
    }
}
