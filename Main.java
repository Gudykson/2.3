import java.util.Random;
class Main {
  public static void main(String[] args) {
    double suma = 0;
    for(int i=0;i<5;i++){
      Random rand = new Random();
        int upperbound = 101;
      double a = rand.nextDouble(upperbound);
      suma = suma + Math.pow(a,2);
      
    }

    System.out.println("Suma kwadratow 5 liczb losowych w zakresie od 0 do 100 wynosi " + suma);
  }
}