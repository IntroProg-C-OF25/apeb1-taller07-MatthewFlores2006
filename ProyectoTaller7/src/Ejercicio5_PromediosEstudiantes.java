import java.util.Scanner;
public class Ejercicio5_PromediosEstudiantes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nom, estado ="Aprobado";
        double prom;
        int cont = 1;
        System.out.print("Ingrese el nombre y promedio del estudiante " + cont);
        nom = in.next();
        prom = in.nextDouble();
        while (cont <= 4){
            if (prom < 7)
                estado = "Reprobado";
            else
                estado = "Aprobado";  
            cont++;
        }
        System.out.printf("| %s | %s | %s |%n", "NOMBRE", "PROMEDIO", "ESTADO");
        System.out.printf("| %s | %.2f\t| %s |%n", nom, prom, estado);
    }
}
