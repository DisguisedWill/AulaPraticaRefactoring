import java.util.Enumeration;

public abstract class Statement {
    public abstract String writeName(Customer aCustomer);
    public abstract String writeMovies(Enumeration rentals);
    public abstract String writeFooter(Customer aCustomer);


    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = writeName(aCustomer);
        result += writeMovies(rentals);
        //add footer lines
        result += writeFooter(aCustomer);
      
        return result;
   }



}