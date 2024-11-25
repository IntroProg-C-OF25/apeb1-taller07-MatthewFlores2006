import java.util.Scanner;
public class Ejercicio7_Serie3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cont1 = 1, cont = 1, lim;
        String sign = null;
        System.out.print("Ingrese la cantidad de elementos: ");
        lim = in.nextInt();
        while(cont <= lim) {
            cont1 = cont1 * -1;
            if (cont1 >= 1)
                sign = "+";
            else
                sign = "-";
              System.out.print( sign + " (" + 1 + "/" + cont + ") ");
            cont++;
        }
    }
}
