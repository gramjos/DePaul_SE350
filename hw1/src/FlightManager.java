import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public final class FlightManager {
  private static FlightManager flightManager;
  private static List<Flight> flightManagerList;

  public static FlightManager getInstance(){
    if ( flightManager == null ){
      flightManagerList = new ArrayList<Flight>();
      flightManager = new FlightManager();
    }
    return flightManager;
  }

  private FlightManager(){}

  public void createFlight(Airline airline, Airport origin, Airport destination,
      UUID flightNumber, Date departDate, FlightType ft){
    // call flight factory for creation
    flightManagerList.add( FlightFactory.createFlight(airline, origin, destination, flightNumber,
        departDate, ft) );
  }
  public void createFlight(Airline airline, Airport origin, Airport destination,
      UUID flightNumber, Date departDate, FlightType ft, int passengerCapacity){
    // call flight factory for creation
    flightManagerList.add( FlightFactory.createFlight(airline, origin, destination, flightNumber,
                                            departDate, ft, passengerCapacity) );
  }

  public void pprint(){
    if(flightManagerList!=null){
      for ( Flight fl : flightManagerList){
        System.out.println(fl);
      }
    }
  }

  public Flight getFlightById(UUID flightNumber ) {
    if (flightNumber != null && flightManagerList.size() > 0) {
      for (Flight fl : flightManagerList) {
        if ((fl.getFlightNumber()).equals(flightNumber))
          return fl;
      }
    } else {
      try {
        throw new NullValuePasses("UUID not found in list");
      } catch (NullValuePasses e) {
        e.printStackTrace();
      }
    }
    return null ;
  }
// ? return value
}

