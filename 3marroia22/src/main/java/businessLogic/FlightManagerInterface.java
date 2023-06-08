package businessLogic;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.datatype.XMLGregorianCalendar;

import domain.ConcreteFlight;
import domain.ConcreteFlightContainer;
import domain.Flight;

@WebService
public interface FlightManagerInterface{
	@WebMethod
	public List<String> getAllDepartingCities();
	@WebMethod
	public List<String> getArrivalCitiesFrom(String departingCity);
	@WebMethod
	public Collection<ConcreteFlight> getConcreteFlights(String departingCity, String arrivingCity, XMLGregorianCalendar date);
	@WebMethod
	public void storeFlight (Flight f);
	@WebMethod
	public void bookSeat (ConcreteFlight selectedconcreteFlight, String type);
	@WebMethod
	public List<ConcreteFlightContainer> getListConcreteFlightContainer(String departingCity, String arrivingCity, XMLGregorianCalendar date);
	public void initialize();

}