package Designpattern.FactoryMethod.Insurance;

public class longtermVehicleIns implements VahicleInsuranceInterface{
  @Override
  public void CreatInsurance(Term term) {
    System.out.println("Long term Vahicle Insurance...");
  }
}
