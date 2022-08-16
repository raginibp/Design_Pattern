package Designpatterns.FactoryMethod.flightboking.Boeing;

import Designpatterns.FactoryMethod.flightboking.Booking;
import Designpatterns.FactoryMethod.flightboking.Exception.SeatUnavailableException;

public class DomesticBoeing  implements BoeingInterface {
  Booking booking = new Booking() ;

  public void setBook(Booking book) {
    this.booking = booking;
  }
  public void Setter(int Total_seats) {
    booking.setTotal_seats(Total_seats);
    int[] seats = new int[Total_seats+2];
    for(int i=0; i< Total_seats; i++){
      seats[i] =1+i;
    }
    booking.setAvailable_seats(seats);
    booking.setBooked_seats(seats);
  }

  public void book(int Seat_no) throws SeatUnavailableException {
    booking.flightbooking(Seat_no);
    System.out.println("Seat "+Seat_no+" booked in Domestic Boeing..");
  }
}
