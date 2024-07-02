package dev.anto;
import java.util.List;

public class App {
  public static void main(String[] args) {
    DiasDeLaSemana semanaManager = new DiasDeLaSemana();

    semanaManager.crearListaDeDias();
    System.out.println("Lista de días creada:");
    imprimirLista(semanaManager.getDias());

    System.out.println("Largo de la lista: " + semanaManager.getLargoDeLista());

    semanaManager.eliminarDia("martes");
    System.out.println("Lista después de eliminar 'martes':");
    imprimirLista(semanaManager.getDias());

    System.out.println("Día en el índice 2: " + semanaManager.getDia(2));

    System.out.println("¿Existe 'viernes'? " + semanaManager.existeDia("viernes"));

    semanaManager.ordenarDias();
    System.out.println("Lista de días ordenada alfabéticamente:");
    imprimirLista(semanaManager.getDias());

    semanaManager.vaciarLista();
    System.out.println("Lista después de vaciarla:");
    imprimirLista(semanaManager.getDias());
  }

  public static void imprimirLista(List<String> lista) {
    for (String dia : lista) {
      System.out.println(dia);
    }
    System.out.println();
  }
}
