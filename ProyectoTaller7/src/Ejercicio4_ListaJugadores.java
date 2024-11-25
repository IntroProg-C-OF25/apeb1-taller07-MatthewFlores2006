import java.util.Scanner;
public class Ejercicio4_ListaJugadores {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nom, pos;
        int cont = 1, lim;
        double edad, estat, promed, cantestat = 0, promst, sumed = 0;
        System.out.print("Ingrese la cantidad de jugadores: ");
        lim = in.nextInt();
        while (cont <= lim) {
        System.out.print("Ingrese el nombre, posicion, edad y estatura del jugador " + cont);
        nom = in.next();
        pos = in.next();
        edad = in.nextDouble();
        estat =in.nextDouble();
        if (cont == 1) { System.out.println("Listado de jugadores");}
            System.out.println(cont + " - " + pos + " - " + nom + " edad " + edad + " estatura " + estat);
            sumed = sumed + edad;
            cantestat = cantestat + estat;
            cont++;
        }
        promed = sumed / lim;
        promst = cantestat / lim;
        System.out.println("Promedio de edades: " + promed);
        System.out.println("Promedio de estuturas: " + promst);
    }  
}
