package domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class ConcreteFlightContainer {
	private Flight flight;
	private ConcreteFlight concreteFlight;
	
	public ConcreteFlightContainer(ConcreteFlight concreteFlight) {
		this.concreteFlight = concreteFlight;
		this.flight=concreteFlight.getFlight();
	}

	public ConcreteFlightContainer() {
		this.concreteFlight = null;
		this.flight=null;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public ConcreteFlight getConcreteFlight() {
		return concreteFlight;
	}

	public void setConcreteFlight(ConcreteFlight concreteFlight) {
		this.concreteFlight = concreteFlight;
	}

}
