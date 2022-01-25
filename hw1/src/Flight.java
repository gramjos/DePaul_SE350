import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class Flight {
  private Airline airline;
  private Airport origin;
  private Airport destination;
  private String flightNumber;
  private Date departureDate;

  public Flight () {
    Airline airline = new Airline();
    Airport origin = new Airport();
    Airport destination = new Airport();
    String flightNumber = UUID.randomUUID().toString();
    Date departureDate = new Date();
  }
  public Flight ( Airline airline, Airport origin, Airport destination, String
                  flightNumber, Date departureDate){
    setAirline(airline);
    setOrigin(origin);
    setDestination(destination);
    setFlightNumber(flightNumber);
    setDepartureDate(departureDate);
  }
  public String getAirline() { return airline.toString(); }

  public void setAirline(Airline airline) {
    if(null==(airline)) {
      try {
        throw new NullValuePasses("Airline is null");
      } catch (NullValuePasses e) {
        e.printStackTrace();
      }
    }
    this.airline = airline;
  }

  public String getOrigin() {return origin.toString();}

  public void setOrigin(Airport origin) {
    if(null==(origin))
      try {
        throw new NullValuePasses("Origin is null");
      } catch (NullValuePasses e) {
        e.printStackTrace();
      }
    this.origin = origin; }

  public String getDestination() { return destination.toString(); }

  public void setDestination(Airport destination) {
    if(null==(destination))
      try {
        throw new NullValuePasses("Airport destination is null");
      } catch (NullValuePasses e) {
        e.printStackTrace();
      }
    this.destination = destination; }

  public String getFlightNumber() { return flightNumber.toString(); }

  public void setFlightNumber(String flightNumber) { this.flightNumber = flightNumber; }

  public String getDepartureDate() { return departureDate.toString(); }

  public void setDepartureDate(Date departureDate) { this.departureDate = departureDate; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Flight flight = (Flight) o;
    return Objects.equals(airline, flight.airline) && Objects.equals(origin,
        flight.origin) && Objects.equals(destination, flight.destination)
        && Objects.equals(flightNumber, flight.flightNumber) && Objects.equals(
        departureDate, flight.departureDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airline, origin, destination, flightNumber, departureDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();

    sb.append(String.format("airline= %s ", getAirline()));
    sb.append(String.format("origin= %s ", getOrigin()));
    sb.append(String.format("destination= %s ", getDestination()));
    sb.append(String.format("flightNumber= %s ", getFlightNumber()));
    String dateString = new SimpleDateFormat("yyyy-MM-dd").format(getDepartureDate());
    sb.append(String.format("departureDate= %s ", dateString));
    return sb.toString() ;
  }
}

