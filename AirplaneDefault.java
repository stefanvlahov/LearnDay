public class AirplaneDefault {

  public void pushingBack() {
    System.out.println("Ready for pushback!");
  }

  public static void main(String [] args) {
    AirplaneDefault boeing737 = new AirplaneDefault();
    boeing737.pushingBack();
  }
}
