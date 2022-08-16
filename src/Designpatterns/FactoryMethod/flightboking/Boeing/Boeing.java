package Designpatterns.FactoryMethod.flightboking.Boeing;

import Designpatterns.FactoryMethod.flightboking.Airbus.AirbusInterface;
import Designpatterns.FactoryMethod.flightboking.Booking;
import Designpatterns.FactoryMethod.flightboking.Enum.Type_flight;
import Designpatterns.FactoryMethod.flightboking.Exception.SeatUnavailableException;
import Designpatterns.FactoryMethod.flightboking.Flight;

public class Boeing implements Flight {
  Booking booking=new Booking();

  public void setBooking(Booking booking) {
    this.booking = booking;
  }

  public BoeingInterface bookBoeingFlight(Type_flight type_flight){
    switch (type_flight){
      case INTERNATIONAL:
        return  new InternationalBoeing();
      case DOMESTIC:
        return new DomesticBoeing();
    }
    return null;
  }
//  public void fb(int Seat_no) throws SeatUnavailableException {
//    try {
//      booking.flightbooking(Seat_no);
//    } catch (SeatUnavailableException e) {
//      throw new SeatUnavailableException("Seat Unavailable!!");
//    }
//  }



  @Override
  public AirbusInterface bookAirbusFlight(Type_flight type_flight) {
    return null;
  }
}
