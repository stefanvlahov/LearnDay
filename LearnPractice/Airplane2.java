public class Airplane2 {
  int numOfEngines;
  String type;
  double maxSpeed;

  public Airplane2() {
    type = "passenger";
    numOfEngines = 2;
    maxSpeed = 1000;
  }

  public Airplane2(int numOfEngines, String type, double maxSpeed) {
    this.numOfEngines = numOfEngines;
    this.type = type;
    this.maxSpeed = maxSpeed;
  }

  public Airplane2(int numOfEngines, String type) {
    this.numOfEngines = numOfEngines;
    this.type = type;
    this.maxSpeed = maxSpeed;
  }

  public void flying() {
    System.out.println("VOORRRMMMM");
  }

  public static void main(String[] args) {
    Airplane2 f16 = new Airplane2(2, "military", 1500);
    f16.flying();
    System.out.println(f16.numOfEngines);
    System.out.println(f16.type);
    Airplane2 airbusA350 = new Airplane2();
    System.out.println(airbusA350.type);
  }
}
