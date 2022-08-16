package Designpattern.FactoryMethod.Insurance;

public class shorttermHealthIns implements HealthInsuranceInterface{
  @Override
  public void CreatInsurance(Term term) {
    System.out.println("Short term H:ealth Insurance...");
  }
}
