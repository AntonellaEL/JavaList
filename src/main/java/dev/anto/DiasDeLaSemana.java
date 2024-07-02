package dev.anto;

import java.util.ArrayList;

public class DiasDeLaSemana {
  private ArrayList<String> days;

  public DiasDeLaSemana() {
    days = new ArrayList<String>();
    days.add("lunes");
    days.add("martes");
    days.add("miercoles");
    days.add("jueves");
    days.add("viernes");
    days.add("sabado");
    days.add("domingo");
  }

  public ArrayList<String> getDays() {
    return days;
  }
}
