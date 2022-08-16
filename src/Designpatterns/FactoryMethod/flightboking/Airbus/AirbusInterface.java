package Designpatterns.FactoryMethod.flightboking.Airbus;

import Designpatterns.FactoryMethod.flightboking.Exception.SeatUnavailableException;

public interface AirbusInterface {
  public void book(int Seat_no) throws SeatUnavailableException;
  public void Setter(int Total_seats);


}
