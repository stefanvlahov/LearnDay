public class AirplaneParentChain extends Aircraft {
  String type;
  int numOfEngines;
  double maxSpeed;

  public AirplaneParentChain(String bob, boolean prod, String use) {
    super(fuel, prod, use);
  }

  public static void main(String [] args) {
    AirplaneParentChain plane = new AirplaneParentChain("kerosene", true, "commercial");
    System.out.println(plane.fuel);
    System.out.println(plane.use);
  }
}
