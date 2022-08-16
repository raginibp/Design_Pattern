package Designpatterns.FactoryMethod.flightboking;

import Designpatterns.FactoryMethod.flightboking.Airbus.AirbusInterface;
import Designpatterns.FactoryMethod.flightboking.Boeing.BoeingInterface;
import Designpatterns.FactoryMethod.flightboking.Enum.Type_flight;
import Designpatterns.FactoryMethod.flightboking.Exception.SeatUnavailableException;

public interface Flight {
  Booking booking =new Booking();
  AirbusInterface bookAirbusFlight(Type_flight type_flight);
  BoeingInterface bookBoeingFlight(Type_flight type_flight);
}
