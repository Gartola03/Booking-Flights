package dataAccess;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.xml.datatype.XMLGregorianCalendar;

import domain.ConcreteFlight;
import domain.Flight;

public class DataAccess {
	private EntityManager db;
	private EntityManagerFactory emf;
	String fileName = "FlightBooking.odb";
	
	private void openDb() {

		emf = Persistence.createEntityManagerFactory("objectdb:"+fileName);
		db = emf.createEntityManager();	

		
		System.out.println("Database opened");
		
	}
	
	public void closeDb(){
		db.close();
		System.out.println("DataBase closed");
	}
	
	public void storeFlight (Flight f) {
		try {
			openDb();
			db.getTransaction().begin();
			db.persist(f);
			db.getTransaction().commit();
			System.out.println("object added "+f.getFlightCode());
		} catch (Exception e) {
			e.printStackTrace();
		} finally { closeDb(); }

	}
	
	public List<String> getAllDepartingCities(){
		List<String> results = new ArrayList<String>();
		try {
			openDb();
			TypedQuery<String> query = db.createQuery("SELECT DISTINCT f.departingCity FROM Flight f", String.class);
			results = query.getResultList();
			results.sort(null);
			
		} catch	(Exception e) {	e.printStackTrace();
		} finally { closeDb(); }
		return results;
	}
	public List<String> getArrivalCitiesFrom(String departingCity){
		List<String> arrivingCities = new ArrayList<String>();
		try {
			openDb();
			TypedQuery<String> query = db.createQuery("SELECT DISTINCT f.arrivingCity FROM Flight f WHERE f.departingCity=?1", String.class);
			query.setParameter(1,departingCity);
			arrivingCities = query.getResultList();
			arrivingCities.sort(null);
			
		} catch	(Exception e) {	e.printStackTrace();
		} finally { closeDb(); }
		return arrivingCities;
	}
	public Collection<ConcreteFlight> getConcreteFlights(String departingCity, String arrivingCity, XMLGregorianCalendar date){
		Collection<ConcreteFlight> concreteFlight = null;
		try {
			openDb();
			TypedQuery<ConcreteFlight> query = db.createQuery("SELECT cf FROM ConcreteFlight cf WHERE cf.flight.departingCity=?1 AND cf.flight.arrivingCity=?2 AND cf.date=?3", ConcreteFlight.class);
			query.setParameter(1,departingCity);
			query.setParameter(2,arrivingCity);
			Date date2 = date.toGregorianCalendar().getTime();
			query.setParameter(3,date2);
			concreteFlight = query.getResultList();
			
		} catch	(Exception e) {	e.printStackTrace();
		} finally { closeDb(); }
		return concreteFlight;
	}
	public void bookSeat (ConcreteFlight selectedconcreteFlight, String type) {
		try {
			openDb();
			db.getTransaction().begin();
			ConcreteFlight cf = db.find(ConcreteFlight.class, selectedconcreteFlight.getConcreteFlightCode());
			int num;
			switch (type) {
				case "Business":
					num = cf.getBusinessNumber();
					cf.setBusinessNumber(num-1);
					break;
				case "First":
					num = cf.getFirstNumber();
					cf.setFirstNumber(num-1);
					break;
				case "Tourist":
					num = cf.getTouristNumber();
					cf.setTouristNumber(num-1);
					break;
			}
			
			System.out.println("Updated: " + cf.toString());
			
			db.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally { closeDb(); }
	}
	
	private Date newDate(int year,int month,int day) {

	     Calendar calendar = Calendar.getInstance();
	     calendar.set(year, month, day,0,0,0);
	     calendar.set(Calendar.MILLISECOND, 0);

	     return calendar.getTime();
	}
	
	public void storePreviousFlights() {		
		
		Flight f1 = new Flight("F1","Donostia","Bilbo");
		f1.addConcreteFlight("CF1-1",newDate(2023,1,23),0,2,3,"12:00");
		f1.addConcreteFlight("CF1-2",newDate(2023,1,23),3,0,3,"12:30");
		f1.addConcreteFlight("CF1-3",newDate(2023,1,23),1,2,2,"13:00");
		f1.addConcreteFlight("CF1-4",newDate(2023,1,23),3,3,0,"14:00");
		f1.addConcreteFlight("CF1-5",newDate(2023,1,23),3,3,0,"15:00");
		f1.addConcreteFlight("CF1-6",newDate(2023,1,23),3,3,0,"16:00");
		f1.addConcreteFlight("CF1-7",newDate(2023,1,23),3,3,0,"17:00");
		
		Flight f2 = new Flight("F2","Donostia","Madrid");
		f2.addConcreteFlight("CF2-1",newDate(2023,1,23),1,2,3,"12:00");
		f2.addConcreteFlight("CF2-2",newDate(2023,1,23),3,0,3,"12:30");
		f2.addConcreteFlight("CF2-3",newDate(2023,1,23),1,2,2,"13:00");
		f2.addConcreteFlight("CF2-4",newDate(2023,1,23),3,3,0,"14:00");
		f2.addConcreteFlight("CF2-5",newDate(2023,1,23),3,3,0,"15:00");
		f2.addConcreteFlight("CF2-6",newDate(2023,1,23),3,3,0,"16:00");
		f2.addConcreteFlight("CF2-7",newDate(2023,1,23),3,3,0,"17:00");
				
		Flight f3 = new Flight("F3","Barcelona","Donostia");
		f3.addConcreteFlight("CF3-1",newDate(2023,1,23),1,2,3,"10:00");
		f3.addConcreteFlight("CF3-2",newDate(2023,1,23),3,0,3,"11:00");
		f3.addConcreteFlight("CF3-3",newDate(2023,1,23),1,2,2,"12:00");
		f3.addConcreteFlight("CF3-4",newDate(2023,1,23),3,3,0,"13:00");
		f3.addConcreteFlight("CF3-5",newDate(2023,1,23),3,3,0,"15:00");
		f3.addConcreteFlight("CF3-6",newDate(2023,1,23),3,3,0,"19:00");
		f3.addConcreteFlight("CF3-7",newDate(2023,1,23),3,3,0,"21:00");
		
		Flight f4 = new Flight("F4","Barcelona","Malaga");
		f4.addConcreteFlight("CF4-1",newDate(2023,1,22),1,2,3,"9:00");
		f4.addConcreteFlight("CF4-2",newDate(2023,1,23),3,0,3,"11:00");
		f4.addConcreteFlight("CF4-3",newDate(2023,1,23),1,2,2,"13:00");
		f4.addConcreteFlight("CF4-4",newDate(2023,1,23),3,3,0,"15:00");
		f4.addConcreteFlight("CF4-5",newDate(2023,1,23),3,3,0,"17:00");
		f4.addConcreteFlight("CF4-6",newDate(2023,1,23),3,3,0,"19:00");
		f4.addConcreteFlight("CF4-7",newDate(2023,1,23),3,3,0,"21:00");
		
		Flight f5 = new Flight("F5","Sevilla","Madrid");
		f5.addConcreteFlight("CF5-1",newDate(2023,1,22),1,2,3,"8:00");
		f5.addConcreteFlight("CF5-2",newDate(2023,1,23),3,0,3,"10:00");
		f5.addConcreteFlight("CF5-3",newDate(2023,1,23),1,2,2,"12:00");
		f5.addConcreteFlight("CF5-4",newDate(2023,1,23),3,3,0,"14:00");
		f5.addConcreteFlight("CF5-5",newDate(2023,1,23),3,3,0,"16:00");
		f5.addConcreteFlight("CF5-6",newDate(2023,1,23),3,3,0,"18:00");
		f5.addConcreteFlight("CF5-7",newDate(2023,1,23),3,3,0,"20:00");
		
		
		Flight f6 = new Flight("F6","Sevilla","Santander");
		f6.addConcreteFlight("CF6-1",newDate(2023,1,22),1,2,3,"8:30");
		f6.addConcreteFlight("CF6-2",newDate(2023,1,23),3,0,3,"10:30");
		f6.addConcreteFlight("CF6-3",newDate(2023,1,23),1,2,2,"12:30");
		f6.addConcreteFlight("CF6-4",newDate(2023,1,23),3,3,0,"14:30");
		f6.addConcreteFlight("CF6-5",newDate(2023,1,23),3,3,0,"16:30");
		f6.addConcreteFlight("CF6-6",newDate(2023,1,23),3,3,0,"18:30");
		f6.addConcreteFlight("CF6-7",newDate(2023,1,23),3,3,0,"20:30");
		
		Flight f7 = new Flight("F7","Sevilla","Granada");
		
		storeFlight(f1);
		storeFlight(f2);
		storeFlight(f3);
		storeFlight(f4);
		storeFlight(f5);
		storeFlight(f6);
		storeFlight(f7);
	}
	
}
