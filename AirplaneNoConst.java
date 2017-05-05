public class AirplaneNoConst {
  String type;
  int numOfEngines;
  double maxSpeed;

  public static void main(String[] args) {
    AirplaneNoConst boeing747 = new AirplaneNoConst();
    boeing747.type = "passenger";
    boeing747.numOfEngines = 4;
    boeing747.maxSpeed = 1000;
    System.out.println(boeing747.maxSpeed);
  }
}
