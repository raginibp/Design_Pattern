package Designpattern.FactoryMethod.Insurance;

public class shorttermVehicleInc implements VahicleInsuranceInterface{
  @Override
  public void CreatInsurance(Term term) {
    System.out.println("Short term Vahicle Insurance....");
  }
}
