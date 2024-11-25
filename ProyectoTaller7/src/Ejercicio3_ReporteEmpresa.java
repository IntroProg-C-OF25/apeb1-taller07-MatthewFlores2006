import java.util.Scanner;
public class Ejercicio3_ReporteEmpresa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ndtrab = 0, cont = 1;
        double costd = 0, total = 0;
        String nombre = null;
        while (cont <= 5) {
            System.out.println("Ingrese el nombre, numero de dias trabajados y salario diario del empleado: " + cont);
            nombre = in.next();
            ndtrab = in.nextInt();
            costd = in.nextDouble();
            total = ndtrab * costd;
            if (cont == 1) {System.out.printf("| %s | %s | %s | %s |", "nombre", "numero de dias", "costo diario", "total");}
            cont++;     
        }
        System.out.printf("| %s | %d | %.2f | %.2f |", nombre, ndtrab, costd, total); 
    }
}
