public class AirlineFactoryTest {
  public static void main(String[] args) {
    Airline airline = AirlineFactory.getAirline("thorough");
    airline.customerService();
  }
}
