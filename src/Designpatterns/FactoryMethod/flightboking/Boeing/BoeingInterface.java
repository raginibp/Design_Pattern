package Designpatterns.FactoryMethod.flightboking.Boeing;

import Designpatterns.FactoryMethod.flightboking.Booking;
import Designpatterns.FactoryMethod.flightboking.Exception.SeatUnavailableException;

public interface BoeingInterface   {
//  public void setTotal_seats(int total_seats);
  public void book(int Seat_no) throws SeatUnavailableException;
  public void Setter(int Total_seats);

}
