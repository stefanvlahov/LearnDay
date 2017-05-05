public class AirplaneB {
  private String fuelType;
  private boolean inProduction;
  private String purpose;

  public String getFuelType() {
    return fuelType;
  }

  public boolean getInProduction() {
    return inProduction;
  }

  public String getPurpose() {
    return purpose;
  }

  public void setFuelType(String fuelType) {
    this.fuelType = fuelType;
  }

  public void setInProduction(boolean inProduction) {
    this.inProduction = inProduction;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public static Builder builder() {
    return new Builder();
  }

  private static class Builder {
    private String fuelType;
    private boolean inProduction;
    private String purpose;

    public Builder fuelType(String fuelType) {
      this.fuelType = fuelType;
      return this;
    }

    public Builder inProduction(boolean inProduction) {
      this.inProduction = inProduction;
      return this;
    }

    public Builder purpose(String purpose) {
      this.purpose = purpose;
      return this;
    }

    public AirplaneB build() {
      // implement
      AirplaneB airplaneB = new AirplaneB();
      airplaneB.setFuelType(fuelType);
      airplaneB.setInProduction(inProduction);
      airplaneB.setPurpose(purpose);
      return airplaneB;
    }
  }

  public static void main(String [] args) {
    AirplaneB boeing737 = AirplaneB.builder().fuelType("kerosene").inProduction(true).purpose("commercial").build();
    System.out.println(boeing737.getFuelType());
  }
}
