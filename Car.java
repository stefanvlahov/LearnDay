class Car {
  private String color;
  private String name;

  public Car(String color, String name) {
    this.color = color;
    this.name = name;
  }
  public Car(String name) {
    this("red", name);
  }

  public static void main(String [] args) {
    Car car = new Car("Honda");
    System.out.println(car.color);
  }
}
