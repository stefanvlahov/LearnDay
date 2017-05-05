public class AirplaneMulti {
  String type;
  int numOfEngines;
  double maxSpeed;

  public AirplaneMulti() {
    type = "passenger";
    numOfEngines = 2;
    maxSpeed = 1000;
  }

  public AirplaneMulti(String airplaneType, int engines, double maxVelocity) {
    this.type = airplaneType;
    this.numOfEngines = engines;
    this.maxSpeed = maxVelocity;
  }

  public void flying() {
    System.out.println("I am flying");
  }

  public static void main(String [] args) {
    AirplaneMulti f16 = new AirplaneMulti("military", 2, 1200.5);
    f16.flying();
    AirplaneMulti airbusA350 = new AirplaneMulti();
    airbusA350.flying();
  }
}
