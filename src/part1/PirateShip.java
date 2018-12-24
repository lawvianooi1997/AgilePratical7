package part1;


import java.util.*;

public class PirateShip {
  public Calendar promoStartDate;
  public Calendar promotEndDate;
  
  public double normalTicketPrice;
  public double discountRate;
  public double gstRate;

  public double calculateTicketPrice(Calendar date, int quantity) {
    double charge = quantity * normalTicketPrice;
    if (chk(date)) {
      charge =  charge + (chargeGST(charge));
    }
    else {
      charge = charge * (discount());
    }
    return charge;
  }

    private double discount() {
        return 1 - discountRate;
    }

    private double chargeGST(double charge) {
        return charge * gstRate;
    }

    private boolean chk(Calendar date) {
        return date.before(promoStartDate) || date.after(promotEndDate);
    }
  
  
}