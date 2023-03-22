import java.util.Random;
class Main {
  public static void main(String[] args) {
    
        Random rand = new Random();
        int upperbound = 101;
        double a = rand.nextDouble(upperbound);
        double b = rand.nextDouble(upperbound);
        double c = rand.nextDouble(upperbound);
        double d = rand.nextDouble(upperbound);
        double skw = a*a + b*b + c*c + d*d;
    System.out.println("suma kwadratow liczb losowych wynosi " + skw);
  }
}