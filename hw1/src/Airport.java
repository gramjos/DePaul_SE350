import java.util.Objects;

public class Airport {
  private String name;
  public  Airport (String name) throws FormatException, NullValuePasses { setAirportName(name); }
  public  Airport () { this.name = new String(); }

  private boolean isAllCap(String name){
    for (int i = 0; i < name.length(); i++) {
      if (Character.isUpperCase(name.charAt(i))) { return false; }
    }
    return true;
  }
  private void setAirportName(String name) throws FormatException, NullValuePasses{
    try{
      if(name == null) throw new NullValuePasses("Airport name is null");
      if (isAllCap(name) == true) throw new FormatException("Airport must be all cap");
      if (name.length() != 3 ) throw new FormatException("Airport must be 3 len");
      this.name = name ;
    }
    catch (FormatException e) { System.out.println(e.getMessage()); }
    catch (NullValuePasses e) { System.out.println(e.getMessage()); }
  }

  private String getAirportName() { return this.name ;}

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Airport airport = (Airport) o;
    return Objects.equals(name, airport.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(String.format("%s", getAirportName()));
    return sb.toString();
  }
}
