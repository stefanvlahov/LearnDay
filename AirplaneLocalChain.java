public class AirplaneLocalChain {
  String type;
  int numOfEngines;
  double maxSpeed;

  public AirplaneLocalChain() {
    this("passenger", 2, 1000);
  }

  public AirplaneLocalChain(String airplaneType, int engines, double maxVelocity) {
    this.type = airplaneType;
    this.numOfEngines = engines;
    this.maxSpeed = maxVelocity;
  }

  public void flying() {
    System.out.println("I am flying");
  }

  public static void main(String [] args) {
    AirplaneLocalChain f16 = new AirplaneLocalChain("military", 2, 1200.5);
    f16.flying();
    AirplaneLocalChain airbusA350 = new AirplaneLocalChain();
    System.out.println(airbusA350.type);
  }
}
