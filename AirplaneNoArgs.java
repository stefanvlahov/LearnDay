public class AirplaneNoArgs {

  public AirplaneNoArgs() {}

  public void flying() {
    System.out.println("I am flying");
  }

  public static void main(String [] args) {
    AirplaneNoArgs md80 = new AirplaneNoArgs();
    md80.flying();
  }
}
