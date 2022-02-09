import java.util.Date;
import java.util.List;
import java.util.UUID;

public class TravelManager {
  public static void pprint(List<Flight> fm){
    for ( Flight fl : fm){
      System.out.println(fl);
    }
  }
  public static void main(String[] args) throws FormatException, NullValuePasses{
    Airport airportORD = new Airport("ORD");
    Airport airportMEX = new Airport("MEX");
    Airline airline = new Airline("Soul");
    Date d = new Date(2022, 07, 07 ,11,28);
    UUID flightNumber = UUID.randomUUID();
    FlightType comFlight = FlightType.COMMERCIAL ;

    FlightManager fm = FlightManager.getInstance();
    FlightManager fm2 = FlightManager.getInstance();
    boolean IsThere_2_Instances = fm == fm2;
    String s = "Instance equality check\nfm == fm2\t"+IsThere_2_Instances;
    boolean is_alike = fm.equals(fm2);
    String s2 = "\nInstance Likeness check\nfm.equals(fm2)\t"+is_alike;
    System.out.println(s+s2);

    System.out.println("debug 1");
    fm.pprint();
    fm.createFlight(airline, airportORD, airportMEX, flightNumber, d, comFlight);


    System.out.println("debug 2");

    fm.pprint();


  }
}
