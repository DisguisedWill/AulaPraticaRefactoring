import java.util.Enumeration;

public class TextStatement extends Statement {
    
    public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String result = writeName(aCustomer);
      result += writeMovies(rentals);
      //add footer lines
      result += writeFooter(aCustomer);
      
      return result;
   }

    public String writeName(Customer aCustomer) {
        return "Rental Record for " + aCustomer.getName() +
      "\n";
    }

    public String writeMovies(Enumeration rentals) {
        String result = "";
        while (rentals.hasMoreElements()) {
            
            Rental each = (Rental) rentals.nextElement();
            //show figures for this rental
            result += "\t" + each.getMovie().getTitle()+ "\t" +
            String.valueOf(each.getCharge()) + "\n";
        }
        return result;
    }

    public String writeFooter(Customer aCustomer) {
        String result = "";
        result += "Amount owed is " +
        String.valueOf(aCustomer.getTotalCharge()) + "\n";
        result += "You earned " +
        String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
        " frequent renter points";
        return result;
    }
}