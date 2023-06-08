package businessLogic;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.datatype.XMLGregorianCalendar;

import dataAccess.DataAccess;
import domain.ConcreteFlight;
import domain.ConcreteFlightContainer;
import domain.Flight;

@WebService(endpointInterface = "businessLogic.FlightManagerInterface")
public class FlightManager implements FlightManagerInterface {
	DataAccess flightsDB=new DataAccess();

		public FlightManager () {
			
				
		}
		
		@WebMethod
		public List<String> getAllDepartingCities(){

			return flightsDB.getAllDepartingCities();			
		}
		
		@WebMethod
		public List<String> getArrivalCitiesFrom(String departingCity){

			return flightsDB.getArrivalCitiesFrom(departingCity);		
		}
		
		@WebMethod
		public Collection<ConcreteFlight> getConcreteFlights(String departingCity, String arrivingCity, XMLGregorianCalendar date) {
			Collection<ConcreteFlight> list = flightsDB.getConcreteFlights(departingCity, arrivingCity, date);
			if (list!=null) {
				return list;
			}
			return new LinkedList<ConcreteFlight>();		
	}
		@WebMethod
		private Date newDate(int year,int month,int day) {

		     Calendar calendar = Calendar.getInstance();
		     calendar.set(year, month, day,0,0,0);
		     calendar.set(Calendar.MILLISECOND, 0);

		     return calendar.getTime();
		}		
		
		@WebMethod
		public void storeFlight (Flight f) {
			flightsDB.storeFlight(f);
		}
		
		@WebMethod
		public void bookSeat (ConcreteFlight selectedconcreteFlight, String type) {
			flightsDB.bookSeat(selectedconcreteFlight, type);
		}
		
		@WebMethod
		public List<ConcreteFlightContainer> getListConcreteFlightContainer(String departingCity, String arrivingCity, XMLGregorianCalendar date){
			List<ConcreteFlightContainer> listCFC= new LinkedList<ConcreteFlightContainer>();
			for (ConcreteFlight c: this.getConcreteFlights(departingCity, arrivingCity, date)) {
				listCFC.add(new ConcreteFlightContainer(c));
			}
			return listCFC;
		}
		
		public void initialize() {
			flightsDB.storePreviousFlights();
		}
}
