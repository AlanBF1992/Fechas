import java.util.Scanner;

public class Fechas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la primera fecha como DD/MM/AAAA");
        String fecha1 = sc.nextLine();

        System.out.println("Ingresa la segunda fecha como DD/MM/AAAA");
        String fecha2 = sc.nextLine();

        System.out.println(mayor(fecha1, fecha2));
    }

    private static String mayor(String fecha1, String fecha2) {
        int d1 = Integer.parseInt(fecha1.substring(0,2));
        int m1 = Integer.parseInt(fecha1.substring(3,5));
        int a1 = Integer.parseInt(fecha1.substring(6));

        int d2 = Integer.parseInt(fecha2.substring(0,2));
        int m2 = Integer.parseInt(fecha2.substring(3,5));
        int a2 = Integer.parseInt(fecha2.substring(6));

        if (a1 < a2) return "Persona 1 es mayor";
        if (a2 < a1) return "Persona 2 es mayor";
        if (m1 < m2) return "Persona 1 es mayor";
        if (m2 < m1) return "Persona 2 es mayor";
        if (d1 < d2) return "Persona 1 es mayor";
        if (d2 < d1) return "Persona 2 es mayor";

        return "Tienen la misma edad";
    }
}