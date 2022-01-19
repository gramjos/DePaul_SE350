import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class Flight {
  private Airline airline;
  private Airport origine;
  private Airport destination;
  private String flightNumber;
  private Date departureDate;

  public Flight () {
    Airline airline = new Airline();
    Airport origine = new Airport();
    Airport destination = new Airport();
    String flightNumber = UUID.randomUUID().toString();
    Date departureDate = new Date();
  }
  public Flight ( Airline airline, Airport origine, Airport destination, String
                  flightNumber, Date departureDate){
    setAirline(airline);
    setOrigine(origine);
    setDestination(destination);
    setFlightNumber(flightNumber);
    setDepartureDate(departureDate);
  }
  public Airline getAirline() { return airline; }

  public void setAirline(Airline airline) { this.airline = airline; }

  public Airport getOrigine() {return origine;}

  public void setOrigine(Airport origine) { this.origine = origine; }

  public Airport getDestination() { return destination; }

  public void setDestination(Airport destination) { this.destination = destination; }

  public String getFlightNumber() { return flightNumber; }

  public void setFlightNumber(String flightNumber) { this.flightNumber = flightNumber; }

  public Date getDepartureDate() { return departureDate; }

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
    return Objects.equals(airline, flight.airline) && Objects.equals(origine,
        flight.origine) && Objects.equals(destination, flight.destination)
        && Objects.equals(flightNumber, flight.flightNumber) && Objects.equals(
        departureDate, flight.departureDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airline, origine, destination, flightNumber, departureDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();

    sb.append(String.format("airline= %s ", airline));
    sb.append(String.format("origine= %s ", origine));
    sb.append(String.format("destination= %s ", destination));
    sb.append(String.format("flightNumber= %s ", flightNumber));
    String dateString = new SimpleDateFormat("yyyy-MM-dd").format(departureDate);
    sb.append(String.format("departureDate= %s ", dateString));
    return sb.toString() ;
  }
}

