import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TravelManager {
  public static void main(String[] args) throws FormatException, NullValuePasses{
    Airport airport = new Airport("ORD");
    System.out.println(airport.toString());
    Airline airline = new Airline("Soul");
    String string = "January 2, 2010";
    DateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
    try {
      Date date = format.parse(string);
      Flight flight = new Flight(airline, airport, new Airport("MEX"), "444", date );
      System.out.println(flight);
    }
    catch (ParseException e){
      System.err.println("Date parse Exception");
    }
  }
}
