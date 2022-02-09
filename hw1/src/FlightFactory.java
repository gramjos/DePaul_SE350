import java.util.Date;
import java.util.UUID;

public class FlightFactory {


  private FlightFactory() {
  }


  public static Flight createFlight(Airline airline, Airport origin, Airport destination,
      UUID flightNumber, Date departDate, FlightType ft){
    if ( ft.equals(FlightType.COMMERCIAL)){
      return new CommercialFlight(airline, origin, destination, flightNumber, departDate);
    }
    return null;
  }
  //?
}


