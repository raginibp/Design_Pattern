package Designpatterns.FactoryMethod.flightboking;

import Designpatterns.FactoryMethod.flightboking.Boeing.BoeingInterface;
import Designpatterns.FactoryMethod.flightboking.Enum.Type_Plane;
import Designpatterns.FactoryMethod.flightboking.Enum.Type_flight;
import Designpatterns.FactoryMethod.flightboking.Exception.SeatUnavailableException;

public class MainBookingApplication {
  public static void main(String[] args) throws SeatUnavailableException {
    Flight obj = BookingFactory.getFlightbyType(Type_Plane.BOEING);
    BoeingInterface ob = obj.bookBoeingFlight(Type_flight.DOMESTIC);
    BoeingInterface ob1 = obj.bookBoeingFlight(Type_flight.INTERNATIONAL);//
    ob.Setter(20);
    ob1.Setter(10);
    try {
      ob.book(6);
    } catch (SeatUnavailableException e) {
      System.out.println(" Seat Not Available");
    }
    try {
      ob1.book(6);
    } catch (SeatUnavailableException e) {
      System.out.println(" Seat Not Available");
    }
  }
}
