
package service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para flight complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="flight"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="flightCode" type="{http://www.w3.org/2001/XMLSchema}ID" minOccurs="0"/&gt;
 *         &lt;element name="departingCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="arrivingCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="concreteFlights" type="{http://businessLogic/}concreteFlight" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flight", propOrder = {
    "flightCode",
    "departingCity",
    "arrivingCity",
    "concreteFlights"
})
public class Flight {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String flightCode;
    protected String departingCity;
    protected String arrivingCity;
    @XmlElement(nillable = true)
    protected List<ConcreteFlight> concreteFlights;

    /**
     * Obtiene el valor de la propiedad flightCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightCode() {
        return flightCode;
    }

    /**
     * Define el valor de la propiedad flightCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightCode(String value) {
        this.flightCode = value;
    }

    /**
     * Obtiene el valor de la propiedad departingCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartingCity() {
        return departingCity;
    }

    /**
     * Define el valor de la propiedad departingCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartingCity(String value) {
        this.departingCity = value;
    }

    /**
     * Obtiene el valor de la propiedad arrivingCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivingCity() {
        return arrivingCity;
    }

    /**
     * Define el valor de la propiedad arrivingCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivingCity(String value) {
        this.arrivingCity = value;
    }

    /**
     * Gets the value of the concreteFlights property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the concreteFlights property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConcreteFlights().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConcreteFlight }
     * 
     * 
     */
    public List<ConcreteFlight> getConcreteFlights() {
        if (concreteFlights == null) {
            concreteFlights = new ArrayList<ConcreteFlight>();
        }
        return this.concreteFlights;
    }
    
    public String toString() {return flightCode+"/"+departingCity+"/"+arrivingCity;}

}
