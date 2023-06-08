
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para concreteFlightContainer complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="concreteFlightContainer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="flight" type="{http://businessLogic/}flight" minOccurs="0"/&gt;
 *         &lt;element name="concreteFlight" type="{http://businessLogic/}concreteFlight" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "concreteFlightContainer", propOrder = {
    "flight",
    "concreteFlight"
})
public class ConcreteFlightContainer {

    protected Flight flight;
    protected ConcreteFlight concreteFlight;

    /**
     * Obtiene el valor de la propiedad flight.
     * 
     * @return
     *     possible object is
     *     {@link Flight }
     *     
     */
    public Flight getFlight() {
        return flight;
    }

    /**
     * Define el valor de la propiedad flight.
     * 
     * @param value
     *     allowed object is
     *     {@link Flight }
     *     
     */
    public void setFlight(Flight value) {
        this.flight = value;
    }

    /**
     * Obtiene el valor de la propiedad concreteFlight.
     * 
     * @return
     *     possible object is
     *     {@link ConcreteFlight }
     *     
     */
    public ConcreteFlight getConcreteFlight() {
        return concreteFlight;
    }

    /**
     * Define el valor de la propiedad concreteFlight.
     * 
     * @param value
     *     allowed object is
     *     {@link ConcreteFlight }
     *     
     */
    public void setConcreteFlight(ConcreteFlight value) {
        this.concreteFlight = value;
    }

}
