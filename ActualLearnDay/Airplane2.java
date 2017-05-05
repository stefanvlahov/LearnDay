public class Airplane2 extends Aircraft {
  String type;
  int numOfEngines;
  double maxSpeed;

  public Airplane2(String fuelType, boolean inProduction, String purpose) {
    super(fuelType, inProduction, purpose);
  }

  public void flying() {
    System.out.println("VROOMMMMM!");
  }

  public static void main(String[] args) {
    Airplane2 tiffany = new Airplane2("airplane", true, "good jokes");
    System.out.println(tiffany.fuelType);
  }
}
