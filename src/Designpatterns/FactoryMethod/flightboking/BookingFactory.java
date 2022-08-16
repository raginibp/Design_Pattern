package Designpatterns.FactoryMethod.flightboking;

import Designpatterns.FactoryMethod.flightboking.Airbus.Airbus;
import Designpatterns.FactoryMethod.flightboking.Boeing.Boeing;
import Designpatterns.FactoryMethod.flightboking.Boeing.BoeingInterface;
import Designpatterns.FactoryMethod.flightboking.Boeing.DomesticBoeing;
import Designpatterns.FactoryMethod.flightboking.Enum.Type_Plane;

import static Designpatterns.FactoryMethod.flightboking.Enum.Type_Plane.BOEING;

public class BookingFactory{
  public static Flight getFlightbyType(Type_Plane type_plane){
    switch (type_plane){
      case AIRBUS:
        return new Airbus();
      case BOEING:
        return new Boeing();
    }
    return null;
  }

}
