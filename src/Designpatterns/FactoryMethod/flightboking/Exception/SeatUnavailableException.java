package Designpatterns.FactoryMethod.flightboking.Exception;

public class SeatUnavailableException extends Throwable {
  public SeatUnavailableException(String message) {
    super(message);
  }
}
