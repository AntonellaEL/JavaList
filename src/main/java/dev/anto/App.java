package dev.anto;

    public class App {
        public static void main(String[] args) {
          DiasDeLaSemana dias = new DiasDeLaSemana();
      
          for (String dia : dias.getDays()) {
            System.out.println(dia);
          }
        }
      }
      

