import java.util.HashMap;
import java.util.Map;

public class AirlineFactory {
  private static Map<String, Airline> airlineCache = new HashMap<>();
  private AirlineFactory (){}
  public static Airline getAirline(String airline){
    return airlineCache.computeIfAbsent(airline, newAirline -> {
      return new Airline(airline);
    });
  }
}
