public class AirplaneAllArgs {
  String type;
  int numOfEngines;
  double maxSpeed;

  public AirplaneAllArgs(String airplaneType, int engines, double maxVelocity) {
    this.type = airplaneType;
    this.numOfEngines = engines;
    this.maxSpeed = maxVelocity;
  }

  public void flying() {
    System.out.println("I am flying");
  }

  public static void main(String [] args) {
    AirplaneAllArgs f16 = new AirplaneAllArgs("military", 2, 1200.5);
    f16.flying();
  }
}
