public class Airplane1 {
  String type;
  int numOfEngines;
  double maxSpeed;

  public static void main(String [] args) {
    Airplane1 boeing747 = new Airplane1();
    boeing747.type = "passenger";
    boeing747.numOfEngines = 4;
    boeing747.maxSpeed = 1000;
    System.out.println(boeing747.maxSpeed);
  }
}
