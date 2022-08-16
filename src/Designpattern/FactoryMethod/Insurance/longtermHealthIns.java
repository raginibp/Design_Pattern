package Designpattern.FactoryMethod.Insurance;

public class longtermHealthIns implements HealthInsuranceInterface{

  @Override
  public void CreatInsurance(Term term) {
    System.out.println("Long term Health ?Insurance....");
  }
}
