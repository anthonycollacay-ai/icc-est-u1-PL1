import java.util.ArrayList;
import java.util.List;

import Comparator.Comparadores;
import Datos.Datos;
import Models.Estudiante;

public class App 
{
    public static void main(String[] args) throws Exception {
        
        List<Estudiante> estudiantes = Datos.listaEstudiantes();

            System.out.println("===== LISTA ORIGINAL =====");
            for (Estudiante e : estudiantes) {
                System.out.println(e);
            }

        List<Estudiante> estC1 = new ArrayList<>(estudiantes);
        Comparadores.c1(estC1);

        System.out.println("C1 - Codigo ascendente");
        for (Estudiante e : estC1) {
            System.out.println(e);
        }

        List<Estudiante> estC2 = new ArrayList<>(estudiantes);
        Comparadores.c2(estC2);

        System.out.println("\nC2 - Nombre y codigo ascendente");
        for (Estudiante e : estC2) {
            System.out.println(e);
        }

        List<Estudiante> estC3 = new ArrayList<>(estudiantes);
        Comparadores.c3(estC3);

        System.out.println("\nC3 - Nota ascendente y sin desempate");
        for (Estudiante e : estC3) {
            System.out.println(e);
        }

        List<Estudiante> estC4 = new ArrayList<>(estudiantes);
        Comparadores.c4(estC4);

        System.out.println("\nC4 - Nota descendente y nombre ascendente");
        for (Estudiante e : estC4) {
            System.out.println(e);
        }

        List<Estudiante> estC5 = new ArrayList<>(estudiantes);
        Comparadores.c5(estC5);

        System.out.println("\nC5 - Edad ascendente y nombre descendente");
        for (Estudiante e : estC5) {
            System.out.println(e);
        }

        List<Estudiante> estC6 = new ArrayList<>(estudiantes);
        Comparadores.c6(estC6);

        System.out.println("\nC6 - Carrera ascendente, nota descendente, nombre ascendente y código ascendente.");
        for (Estudiante e : estC6) {
            System.out.println(e);
        }

        List<Estudiante> estC7 = new ArrayList<>(estudiantes);
        Comparadores.c7(estC7);

        System.out.println("\nC7 - Nota ajustada descendente, nombre ascendente y código ascendente.");
        for (Estudiante e : estC7) {
            System.out.println(e);
        }
    }
}
