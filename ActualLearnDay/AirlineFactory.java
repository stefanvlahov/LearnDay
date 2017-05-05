public class AirlineFactory {
  public static Airline getAirline(String serviceLevel) {
    if (serviceLevel.equals("bottom of the barrel"))
      return new American();
    else if (serviceLevel.equals("thorough"))
      return new United();
    return null;
  }
}
