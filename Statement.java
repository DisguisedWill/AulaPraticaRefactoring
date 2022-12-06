import java.util.Enumeration;

public abstract class Statement {
    public abstract String writeName(Customer aCustomer);
    public abstract String writeMovies(Enumeration rentals);
    public abstract String writeFooter(Customer aCustomer);
}