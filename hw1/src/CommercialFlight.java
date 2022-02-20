import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class CommercialFlight implements Flight{
  private Airline airline;
  private Airport origin;
  private Airport destination;
  private UUID flightNumber;
  private Date departureDate;

  public CommercialFlight( Airline airline, Airport origin, Airport destination, UUID
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

  public UUID getFlightNumber() { return flightNumber; }

  public void setFlightNumber(UUID flightNumber) {
   this.flightNumber = flightNumber;
  }

  public String getDepartureDate() { return departureDate.toString(); }

  public void setDepartureDate(Date departureDate) {
    this.departureDate = new Date(2022, 07, 07 ,11,28);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommercialFlight commercialFlight = (CommercialFlight) o;
    return Objects.equals(airline, commercialFlight.airline) && Objects.equals(origin,
        commercialFlight.origin) && Objects.equals(destination, commercialFlight.destination)
        && Objects.equals(flightNumber, commercialFlight.flightNumber) && Objects.equals(
        departureDate, commercialFlight.departureDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airline, origin, destination, flightNumber, departureDate);
  }

  @Override
  public String toString() {
    String sb = String.format("airline= %s ", getAirline())
        + String.format("origin= %s ", getOrigin())
        + String.format("destination= %s ", getDestination())
        + String.format("flightNumber= %s ", getFlightNumber())
        + String.format("departureDate= %s ", getDepartureDate());
    return sb;
  }
}

