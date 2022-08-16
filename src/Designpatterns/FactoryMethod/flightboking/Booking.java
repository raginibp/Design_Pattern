package Designpatterns.FactoryMethod.flightboking;
import Designpatterns.FactoryMethod.flightboking.Exception.SeatUnavailableException;

public  class Booking {
  public int[] getBooked_seats() {
    return booked_seats;
  }

  public int[] getAvailable_seats() {
    return available_seats;
  }

  public void setBooked_seats(int[] booked_seats) {
    this.booked_seats = booked_seats;
  }

  public void setAvailable_seats(int[] available_seats) {
    this.available_seats = available_seats;
  }

  private int total_seats;



  private int[] booked_seats;
  private int[] available_seats;

  public Booking() {
    this.total_seats = total_seats;
    this.booked_seats= new int[total_seats];
    this.available_seats=new int[total_seats];
    for (int i=0; i<total_seats;i++){
      this.available_seats[i]=i+1;
    }


  }

  public void flightbooking(int seat_no) throws SeatUnavailableException {
    boolean flag=true;
    for (int element : this.available_seats) {
      if (element == seat_no) {
        booked_seats[element-1] = seat_no;
       seat_no= 0;
        available_seats[element - 1] = seat_no;
        flag = false;
        break;
      }
    }
    try{
      if (flag == true){
     throw new SeatUnavailableException("Unavailable seat!! ");
      }
    }catch (SeatUnavailableException e){
      e.getMessage();
      throw new SeatUnavailableException("Unavailable seat!! for thread ");
    }
    try {
      Thread.sleep((long) (Math.random() * 5000));
    } catch (Exception e) {
      System.out.println(e);
    }

  }

  public int getTotal_seats() {
    return total_seats;
  }

  public void setTotal_seats(int total_seats) {
    this.total_seats = total_seats;
  }
}
