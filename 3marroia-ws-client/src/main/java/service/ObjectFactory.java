
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BookSeat_QNAME = new QName("http://businessLogic/", "bookSeat");
    private final static QName _BookSeatResponse_QNAME = new QName("http://businessLogic/", "bookSeatResponse");
    private final static QName _GetAllDepartingCities_QNAME = new QName("http://businessLogic/", "getAllDepartingCities");
    private final static QName _GetAllDepartingCitiesResponse_QNAME = new QName("http://businessLogic/", "getAllDepartingCitiesResponse");
    private final static QName _GetArrivalCitiesFrom_QNAME = new QName("http://businessLogic/", "getArrivalCitiesFrom");
    private final static QName _GetArrivalCitiesFromResponse_QNAME = new QName("http://businessLogic/", "getArrivalCitiesFromResponse");
    private final static QName _GetConcreteFlights_QNAME = new QName("http://businessLogic/", "getConcreteFlights");
    private final static QName _GetConcreteFlightsResponse_QNAME = new QName("http://businessLogic/", "getConcreteFlightsResponse");
    private final static QName _GetListConcreteFlightContainer_QNAME = new QName("http://businessLogic/", "getListConcreteFlightContainer");
    private final static QName _GetListConcreteFlightContainerResponse_QNAME = new QName("http://businessLogic/", "getListConcreteFlightContainerResponse");
    private final static QName _Initialize_QNAME = new QName("http://businessLogic/", "initialize");
    private final static QName _InitializeResponse_QNAME = new QName("http://businessLogic/", "initializeResponse");
    private final static QName _StoreFlight_QNAME = new QName("http://businessLogic/", "storeFlight");
    private final static QName _StoreFlightResponse_QNAME = new QName("http://businessLogic/", "storeFlightResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BookSeat }
     * 
     */
    public BookSeat createBookSeat() {
        return new BookSeat();
    }

    /**
     * Create an instance of {@link BookSeatResponse }
     * 
     */
    public BookSeatResponse createBookSeatResponse() {
        return new BookSeatResponse();
    }

    /**
     * Create an instance of {@link GetAllDepartingCities }
     * 
     */
    public GetAllDepartingCities createGetAllDepartingCities() {
        return new GetAllDepartingCities();
    }

    /**
     * Create an instance of {@link GetAllDepartingCitiesResponse }
     * 
     */
    public GetAllDepartingCitiesResponse createGetAllDepartingCitiesResponse() {
        return new GetAllDepartingCitiesResponse();
    }

    /**
     * Create an instance of {@link GetArrivalCitiesFrom }
     * 
     */
    public GetArrivalCitiesFrom createGetArrivalCitiesFrom() {
        return new GetArrivalCitiesFrom();
    }

    /**
     * Create an instance of {@link GetArrivalCitiesFromResponse }
     * 
     */
    public GetArrivalCitiesFromResponse createGetArrivalCitiesFromResponse() {
        return new GetArrivalCitiesFromResponse();
    }

    /**
     * Create an instance of {@link GetConcreteFlights }
     * 
     */
    public GetConcreteFlights createGetConcreteFlights() {
        return new GetConcreteFlights();
    }

    /**
     * Create an instance of {@link GetConcreteFlightsResponse }
     * 
     */
    public GetConcreteFlightsResponse createGetConcreteFlightsResponse() {
        return new GetConcreteFlightsResponse();
    }

    /**
     * Create an instance of {@link GetListConcreteFlightContainer }
     * 
     */
    public GetListConcreteFlightContainer createGetListConcreteFlightContainer() {
        return new GetListConcreteFlightContainer();
    }

    /**
     * Create an instance of {@link GetListConcreteFlightContainerResponse }
     * 
     */
    public GetListConcreteFlightContainerResponse createGetListConcreteFlightContainerResponse() {
        return new GetListConcreteFlightContainerResponse();
    }

    /**
     * Create an instance of {@link Initialize }
     * 
     */
    public Initialize createInitialize() {
        return new Initialize();
    }

    /**
     * Create an instance of {@link InitializeResponse }
     * 
     */
    public InitializeResponse createInitializeResponse() {
        return new InitializeResponse();
    }

    /**
     * Create an instance of {@link StoreFlight }
     * 
     */
    public StoreFlight createStoreFlight() {
        return new StoreFlight();
    }

    /**
     * Create an instance of {@link StoreFlightResponse }
     * 
     */
    public StoreFlightResponse createStoreFlightResponse() {
        return new StoreFlightResponse();
    }

    /**
     * Create an instance of {@link ConcreteFlight }
     * 
     */
    public ConcreteFlight createConcreteFlight() {
        return new ConcreteFlight();
    }

    /**
     * Create an instance of {@link Flight }
     * 
     */
    public Flight createFlight() {
        return new Flight();
    }

    /**
     * Create an instance of {@link ConcreteFlightContainer }
     * 
     */
    public ConcreteFlightContainer createConcreteFlightContainer() {
        return new ConcreteFlightContainer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookSeat }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BookSeat }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "bookSeat")
    public JAXBElement<BookSeat> createBookSeat(BookSeat value) {
        return new JAXBElement<BookSeat>(_BookSeat_QNAME, BookSeat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookSeatResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BookSeatResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "bookSeatResponse")
    public JAXBElement<BookSeatResponse> createBookSeatResponse(BookSeatResponse value) {
        return new JAXBElement<BookSeatResponse>(_BookSeatResponse_QNAME, BookSeatResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDepartingCities }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllDepartingCities }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getAllDepartingCities")
    public JAXBElement<GetAllDepartingCities> createGetAllDepartingCities(GetAllDepartingCities value) {
        return new JAXBElement<GetAllDepartingCities>(_GetAllDepartingCities_QNAME, GetAllDepartingCities.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDepartingCitiesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllDepartingCitiesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getAllDepartingCitiesResponse")
    public JAXBElement<GetAllDepartingCitiesResponse> createGetAllDepartingCitiesResponse(GetAllDepartingCitiesResponse value) {
        return new JAXBElement<GetAllDepartingCitiesResponse>(_GetAllDepartingCitiesResponse_QNAME, GetAllDepartingCitiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetArrivalCitiesFrom }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetArrivalCitiesFrom }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getArrivalCitiesFrom")
    public JAXBElement<GetArrivalCitiesFrom> createGetArrivalCitiesFrom(GetArrivalCitiesFrom value) {
        return new JAXBElement<GetArrivalCitiesFrom>(_GetArrivalCitiesFrom_QNAME, GetArrivalCitiesFrom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetArrivalCitiesFromResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetArrivalCitiesFromResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getArrivalCitiesFromResponse")
    public JAXBElement<GetArrivalCitiesFromResponse> createGetArrivalCitiesFromResponse(GetArrivalCitiesFromResponse value) {
        return new JAXBElement<GetArrivalCitiesFromResponse>(_GetArrivalCitiesFromResponse_QNAME, GetArrivalCitiesFromResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConcreteFlights }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConcreteFlights }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getConcreteFlights")
    public JAXBElement<GetConcreteFlights> createGetConcreteFlights(GetConcreteFlights value) {
        return new JAXBElement<GetConcreteFlights>(_GetConcreteFlights_QNAME, GetConcreteFlights.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConcreteFlightsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConcreteFlightsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getConcreteFlightsResponse")
    public JAXBElement<GetConcreteFlightsResponse> createGetConcreteFlightsResponse(GetConcreteFlightsResponse value) {
        return new JAXBElement<GetConcreteFlightsResponse>(_GetConcreteFlightsResponse_QNAME, GetConcreteFlightsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListConcreteFlightContainer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetListConcreteFlightContainer }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getListConcreteFlightContainer")
    public JAXBElement<GetListConcreteFlightContainer> createGetListConcreteFlightContainer(GetListConcreteFlightContainer value) {
        return new JAXBElement<GetListConcreteFlightContainer>(_GetListConcreteFlightContainer_QNAME, GetListConcreteFlightContainer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListConcreteFlightContainerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetListConcreteFlightContainerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getListConcreteFlightContainerResponse")
    public JAXBElement<GetListConcreteFlightContainerResponse> createGetListConcreteFlightContainerResponse(GetListConcreteFlightContainerResponse value) {
        return new JAXBElement<GetListConcreteFlightContainerResponse>(_GetListConcreteFlightContainerResponse_QNAME, GetListConcreteFlightContainerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Initialize }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Initialize }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "initialize")
    public JAXBElement<Initialize> createInitialize(Initialize value) {
        return new JAXBElement<Initialize>(_Initialize_QNAME, Initialize.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitializeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InitializeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "initializeResponse")
    public JAXBElement<InitializeResponse> createInitializeResponse(InitializeResponse value) {
        return new JAXBElement<InitializeResponse>(_InitializeResponse_QNAME, InitializeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreFlight }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StoreFlight }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "storeFlight")
    public JAXBElement<StoreFlight> createStoreFlight(StoreFlight value) {
        return new JAXBElement<StoreFlight>(_StoreFlight_QNAME, StoreFlight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreFlightResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StoreFlightResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "storeFlightResponse")
    public JAXBElement<StoreFlightResponse> createStoreFlightResponse(StoreFlightResponse value) {
        return new JAXBElement<StoreFlightResponse>(_StoreFlightResponse_QNAME, StoreFlightResponse.class, null, value);
    }

}
