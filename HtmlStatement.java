import java.util.Enumeration;

public class HtmlStatement extends Statement {

    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = writeName(aCustomer);
        result += writeMovies(rentals);
        //add footer lines
        result += writeFooter(aCustomer);
      
        return result;
   }

    public String writeName(Customer aCustomer) {
        return "<H1>Rentals for <EM>" + aCustomer.getName() +
        "</EM></H1><P>\n";
    }

    public String writeMovies(Enumeration rentals) {
        String result = "";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            //show figures for each rental
            result += each.getMovie().getTitle()+ ": " +
            String.valueOf(each.getCharge()) + "<BR>\n";
        }
        return result;
    }

    public String writeFooter(Customer aCustomer) {
        String result = "";
        result += "<P>You owe <EM>" +
        String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
        result += "On this rental you earned <EM>" + 
        String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
        "</EM> frequent renter points<P>";
        return result;
    }
}