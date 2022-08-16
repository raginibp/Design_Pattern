package Designpatterns.FactoryMethod.flightboking.Boeing;

import Designpatterns.FactoryMethod.flightboking.Booking;
import Designpatterns.FactoryMethod.flightboking.Exception.SeatUnavailableException;

public class InternationalBoeing  implements BoeingInterface {
  Booking booking = new Booking() ;

  public void setBook(Booking book) {
    this.booking = booking;
  }
  @Override
  public void Setter(int Total_seats) {
    booking.setTotal_seats(Total_seats);
    int[] seats = new int[Total_seats+2];
    for(int i=0; i< Total_seats; i++){
      seats[i] =1+i;
    }
    booking.setAvailable_seats(seats);
    booking.setBooked_seats(seats);
  }
  public void book(int Seat_no)  {
    try {
      booking.flightbooking(Seat_no);
      System.out.println("Seat " + Seat_no + " booked in International Boeing..");
    } catch (SeatUnavailableException e) {
      System.out.println("No." + Seat_no + " Seat is Unavailable in International Boeing");
    }
  }


}
