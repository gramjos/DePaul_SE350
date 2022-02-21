import java.util.Date;
import java.util.UUID;

public class FlightFactory {

  private FlightFactory() {}

  public static Flight createFlight(Airline airline, Airport origin, Airport destination,
      UUID flightNumber, Date departDate, FlightType ft, int passengerCapacity){

    return new PassengerFlight(airline, origin, destination, flightNumber, departDate, passengerCapacity);
  }
  public static Flight createFlight(Airline airline, Airport origin, Airport destination,
      UUID flightNumber, Date departDate, FlightType ft){

      return new CommercialFlight(airline, origin, destination, flightNumber, departDate);
  }
}


