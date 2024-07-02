package dev.anto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DiasDeLaSemana{
  private List<String> days;

  public DiasDeLaSemana() {
    days = new ArrayList<>();
  }

  public void crearListaDeDias() {
    days.clear();
    days.add("lunes");
    days.add("martes");
    days.add("miercoles");
    days.add("jueves");
    days.add("viernes");
    days.add("sabado");
    days.add("domingo");
  }

  public List<String> getDias() {
    return new ArrayList<>(days);
  }

  public int getLargoDeLista() {
    return days.size();
  }

  public boolean eliminarDia(String dia) {
    return days.remove(dia);
  }

  public String getDia(int index) {
    if (index >= 0 && index < days.size()) {
      return days.get(index);
    } else {
      return null; 
    }
  }

  public boolean existeDia(String dia) {
    return days.contains(dia);
  }

  public void ordenarDias() {
    Collections.sort(days);
  }

  public void vaciarLista() {
    days.clear();
  }
}
