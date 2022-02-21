import java.util.HashMap;
import java.util.Map;

public class AirportFactory {
  private static Map<String, Airport> airportCache = new HashMap<>();

  private AirportFactory(){}

  public static Airport getAirport(String airport){
    return airportCache.computeIfAbsent(airport, newAirport -> {
      try {
        return new Airport(airport);
      } catch (FormatException e) {
        e.printStackTrace();
      } catch (NullValuePasses e) {
        e.printStackTrace();
      }
      return null;
    });
  }

}
