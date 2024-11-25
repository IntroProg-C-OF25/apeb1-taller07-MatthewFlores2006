import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        String nom = "Nombre";
        double costo = 0, dscnt = 0, costF;
        int tipo = 0, cont = 0;
        Scanner in = new Scanner(System.in);
        while (cont < 7) {
            System.out.println(" - Datos de la compra " + (cont +1) + " - ");
            System.out.println("Ingrese el nombre del cliente: ");
            nom = in.next();
            System.out.println("Ingrese el costo de la computadora: ");
            costo = in.nextDouble();
            System.out.println("Ingrese el tipo de cliente: ");
            tipo = in.nextInt();
            switch (tipo) {
                case 1:
                    dscnt = costo * 0.10;
                    break;
                case 2:
                    dscnt = costo * 0.20;
                    break;
                default: dscnt = 0;
                    break;
            }
            cont++;
        }
        costF = costo - dscnt;
        System.out.println("\tNombre\tCosto de la computadora\tTipo de cliente\t costo final");
        cont = 0;
        while (cont > 7){
            System.out.printf("%s\t%.2f\t%d\t%.2f\t", nom, costo, tipo, costF);
            cont++;}
    }
}
