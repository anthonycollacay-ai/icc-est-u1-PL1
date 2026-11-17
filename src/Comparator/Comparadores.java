package Comparator;

import java.util.Comparator;
import java.util.List;

import Models.Estudiante;

public class Comparadores 
{
    public static void c1(List<Estudiante> estC1)
    {
        estC1.sort(null);
    }

    public static void c2(List<Estudiante> estC2)
    {
        Comparator<Estudiante> comparador = (e1, e2) -> {
            int resultado = e1.getNombre().compareTo(e2.getNombre());
                if (resultado == 0) 
                {
                    resultado = e1.getCodigo().compareTo(e2.getCodigo());
                }

            return resultado;
        };

        estC2.sort(comparador);
    }

    public static void c3(List<Estudiante> estC3)
    {
        Comparator<Estudiante> comparador = Comparator.comparingDouble(Estudiante::getNota);

        estC3.sort(comparador);
    }

    public static void c4(List<Estudiante> estC4) 
    {
        Comparator<Estudiante> comparador =
                Comparator.comparingDouble(Estudiante::getNota)
                        .reversed()
                        .thenComparing(Estudiante::getNombre);

        estC4.sort(comparador);
    }

    public static void c5(List<Estudiante> estC5) 
    {
        Comparator<Estudiante> comparador =
                Comparator.comparingInt(Estudiante::getEdad)
                        .thenComparing(
                                Comparator.comparing(Estudiante::getNombre).reversed()
                        );

        estC5.sort(comparador);
    }

    public static void c6(List<Estudiante> estC6) 
    {
        Comparator<Estudiante> comparador =
                Comparator.comparing(Estudiante::getCarrera)
                        .thenComparing(
                                Comparator.comparingDouble(Estudiante::getNota).reversed()
                        )
                        .thenComparing(Estudiante::getNombre)
                        .thenComparing(Estudiante::getCodigo);

        estC6.sort(comparador);
    }

    public static void c7(List<Estudiante> estC7) 
    {
        Comparator<Estudiante> comparador =
                Comparator.comparingDouble((Estudiante e) -> {
                    if (e.getCarrera().equals("Computacion")) {
                        return Math.min(10.0, e.getNota() + 0.5);
                    }
                    return e.getNota();
                }).reversed()
                        .thenComparing(Estudiante::getNombre)
                        .thenComparing(Estudiante::getCodigo);

        estC7.sort(comparador);
    }
}
