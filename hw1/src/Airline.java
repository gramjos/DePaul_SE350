import java.util.Objects;

public class Airline {
  private String name;
  public Airline ( String name ){ setAirlineName(name); }
  public Airline () { this.name = new String(); }

  private void setAirlineName(String name) {
    try {
      if( name.length() > 8 || name.length() <= 0) throw new FormatException("Airline name 1-8 len");
      else this.name=name;
    }
    catch (FormatException e){ System.out.println(e.getMessage()); }
  }
  private String getAirlineName(){
    return this.name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Airline airline = (Airline) o;
    return Objects.equals(name, airline.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(String.format("%s", getAirlineName()));
    return sb.toString();
  }
}
