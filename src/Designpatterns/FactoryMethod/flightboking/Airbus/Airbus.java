package Designpatterns.FactoryMethod.flightboking.Airbus;

import Designpatterns.FactoryMethod.flightboking.Boeing.BoeingInterface;
import Designpatterns.FactoryMethod.flightboking.Enum.Type_flight;
import Designpatterns.FactoryMethod.flightboking.Flight;

public class Airbus implements Flight {



  public AirbusInterface bookAirbusFlight(Type_flight type_flight){
    switch (type_flight){
      case INTERNATIONAL:
        return  new InternationalAirbus();
      case DOMESTIC:
        return new DomesticAirbus();
    }
    return null;
  }


  @Override
  public BoeingInterface bookBoeingFlight(Type_flight type_flight) {
    return null;
  }
}
