import java.util.Random;
class Main {
  public static void main(String[] args) {
    double suma = 0;
    for(int i=0;i<5;i++){
      Random rand = new Random();
        int upperbound = 101;
      double a = rand.nextDouble(upperbound);
      suma = suma + Math.pow(a,2);
      System.out.println("Wygenerowana liczba nr." + (i + 1) +  ": " + a);
      
    }

    System.out.println("Suma kwadratow tych 5 liczb losowych wynosi " + suma);
  }
}