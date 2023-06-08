package presentation;


import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.EventQueue;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;

import businessLogic.FlightManager;
import businessLogic.FlightManagerInterface;
import dataAccess.DataAccess;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.border.EmptyBorder;

import domain.ConcreteFlight;
import domain.ConcreteFlightContainer;

import javax.swing.event.PopupMenuListener;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.ws.Endpoint;
import javax.xml.ws.Service;
import javax.swing.event.PopupMenuEvent;

public class FlightBooking extends JFrame {
	

	private static final long serialVersionUID = 1L;
	private JPanel contentPane= null;
	private JLabel lblDepartCity = new JLabel("Departing city:");
	private JLabel lblArrivalCity = new JLabel("Arrival City");
	private JLabel lblYear = new JLabel("Year:");
	private JLabel lblRoomType = new JLabel("Room Type:");
	private JLabel lblMonth = new JLabel("Month:");
	private JLabel lblDay = new JLabel("Day:");;
	private JLabel searchResult =   new JLabel();
	private JTextField day = null;
	private JComboBox<String> months = null;
	private DefaultComboBoxModel<String> monthNames = new DefaultComboBoxModel<String>();

	private JTextField year = null;
	
	private JRadioButton bussinesTicket = null;
	private JRadioButton firstTicket = null;
	private JRadioButton touristTicket = null;

	private ButtonGroup fareButtonGroup = new ButtonGroup();  
	
	private JButton lookforFlights = null;

	
	private JButton bookFlight = null;
	
	

	
	private Collection<ConcreteFlight> concreteFlightCollection;
	private Collection<ConcreteFlightContainer> concreteFlightContainerCollection;
	
	private static FlightManagerInterface businessLogic;  //  @jve:decl-index=0:;
	
	
	private ConcreteFlight selectedConcreteFlight;
	private JComboBox<String> comboBox;
	private DefaultComboBoxModel<String> bidaiak = new DefaultComboBoxModel<String>();
	private final JComboBox<String> comboBox_1 = new JComboBox<String>();
	private DefaultComboBoxModel<String> arrival = new DefaultComboBoxModel<String>();
	private JComboBox<ConcreteFlight> comboBox_2;
	private DefaultComboBoxModel<ConcreteFlight> hegaldiak = new DefaultComboBoxModel<ConcreteFlight>();
	
	

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FlightBooking frame = new FlightBooking();
					URL url = new URL("http://localhost:9999/ws?wsdl");
					QName qname = new QName("http://businessLogic/","FlightManagerService");
					Service service = Service.create(url, qname);
					FlightManagerInterface bl = service.getPort(FlightManagerInterface.class);
					frame.setBusinessLogic(bl);
					//businessLogic.initialize();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	//Custom operations
	public void setBusinessLogic(FlightManagerInterface g) {businessLogic = g;}
	
	
	private XMLGregorianCalendar newDate(int year, int month, int day) {
		 Calendar calendar = Calendar.getInstance();
		 calendar.set(year, month, day, 0, 0, 0);
		 calendar.set(Calendar.MILLISECOND, 0);
		 return toXMLGregorianCalendar(calendar.getTime());
	 }
	private XMLGregorianCalendar toXMLGregorianCalendar(java.util.Date
			date) {
		GregorianCalendar gCalendar = new GregorianCalendar();
		gCalendar.setTime(date);
		XMLGregorianCalendar xmlCalendar = null;
		try {
			xmlCalendar =
					DatatypeFactory.newInstance().newXMLGregorianCalendar(gCalendar);
		} catch (DatatypeConfigurationException ex) {
			System.out.println(ex);
		}
		return xmlCalendar;
	}
	/**
	 * Create the frame
	 * 
	 * @return void
	 */
	private  FlightBooking() {
		
		setTitle("Book Flight");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 353);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblDepartCity = new JLabel("Depart City");
		lblDepartCity.setBounds(21, 11, 103, 16);
		contentPane.add(lblDepartCity);
		
		
		lblYear = new JLabel("Year:");
		lblYear.setBounds(21, 62, 33, 16);
		contentPane.add(lblYear);
		
		lblMonth = new JLabel("Month:");
		lblMonth.setBounds(117, 62, 50, 16);
		contentPane.add(lblMonth);
	    
		months = new JComboBox<String>();
		months.setBounds(163, 58, 116, 27);
		contentPane.add(months);
		months.setModel(monthNames);
		
		monthNames.addElement("January");
		monthNames.addElement("February");
		monthNames.addElement("March");
		monthNames.addElement("April");
		monthNames.addElement("May");
		monthNames.addElement("June");
		monthNames.addElement("July");
		monthNames.addElement("August");
		monthNames.addElement("September");
		monthNames.addElement("October");
		monthNames.addElement("November");
		monthNames.addElement("December");
		months.setSelectedIndex(1);
		
		lblDay = new JLabel("Day:");
		lblDay.setBounds(291, 62, 38, 16);
		contentPane.add(lblDay);
		
		day = new JTextField();
		day.setText("23");
		day.setBounds(331, 57, 50, 26);
		contentPane.add(day);
		day.setColumns(10);
		
		lblRoomType = new JLabel("Seat Type:");
		lblRoomType.setBounds(21, 242, 84, 16);
		contentPane.add(lblRoomType);
		
		bussinesTicket = new JRadioButton("Business");
		bussinesTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bookFlight.setEnabled(true);
			}
		});
		fareButtonGroup.add(bussinesTicket);
		bussinesTicket.setBounds(99, 238, 101, 23);
		contentPane.add(bussinesTicket);
		bussinesTicket.setEnabled(false);
		
		firstTicket = new JRadioButton("First");
		firstTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bookFlight.setEnabled(true);
			}
		});
		fareButtonGroup.add(firstTicket);
		firstTicket.setBounds(202, 238, 77, 23);
		contentPane.add(firstTicket);
		firstTicket.setEnabled(false);
		
		touristTicket = new JRadioButton("Tourist");
		touristTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bookFlight.setEnabled(true);
			}
		});
		fareButtonGroup.add(touristTicket);
		touristTicket.setBounds(278, 238, 77, 23);
		contentPane.add(touristTicket);
		touristTicket.setEnabled(false);
		
		lookforFlights = new JButton("Look for Concrete Flights");
		lookforFlights.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hegaldiak.removeAllElements();
				bussinesTicket.setEnabled(false);
				firstTicket.setEnabled(false);
				touristTicket.setEnabled(false);
				fareButtonGroup.clearSelection();
				bookFlight.setEnabled(false);
				bookFlight.setText("");
				
				try {
					XMLGregorianCalendar date =newDate(Integer.parseInt(year.getText()),months.getSelectedIndex(),Integer.parseInt(day.getText()));
					
					//concreteFlightCollection=businessLogic.getConcreteFlights(bidaiak.getSelectedItem().toString(),arrival.getSelectedItem().toString(),date);
					concreteFlightContainerCollection=businessLogic.getListConcreteFlightContainer(bidaiak.getSelectedItem().toString(),arrival.getSelectedItem().toString(),date);
					
					comboBox_2.setEnabled(true);
					searchResult.setText("Choose an available flight in this list:");
				}
				catch (java.lang.NumberFormatException | java.lang.NullPointerException errorea) {
					comboBox_2.setEnabled(false);
					searchResult.setText("Data desegokia, aldatu data.");
				}
			}
		});
		lookforFlights.setBounds(81, 90, 261, 40);
		contentPane.add(lookforFlights);	
		lookforFlights.setEnabled(false);
		
		
		
		bookFlight = new JButton("");
		bookFlight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bussinesTicket.setEnabled(false);
				firstTicket.setEnabled(false);
				touristTicket.setEnabled(false);
				
				selectedConcreteFlight = (ConcreteFlight) hegaldiak.getSelectedItem();
				
				int num=0;
				boolean error=false;
				if (bussinesTicket.isSelected()) { 
					businessLogic.bookSeat(selectedConcreteFlight, "Business");
				}
				else if (firstTicket.isSelected()) {
					businessLogic.bookSeat(selectedConcreteFlight, "First");
				}
				else if (touristTicket.isSelected()) {
					businessLogic.bookSeat(selectedConcreteFlight, "Tourist");
				}
				if (error) bookFlight.setText("Error: There were no seats available!");
				else bookFlight.setText("Booked. #seat left: "+(num-1));
				bookFlight.setEnabled(false);
				
				hegaldiak.removeAllElements();
				comboBox_2.setEnabled(false);
			}
		});
		bookFlight.setBounds(31, 273, 399, 40);
		contentPane.add(bookFlight);
		bookFlight.setEnabled(false);

		year = new JTextField();
		year.setText("2023");
		year.setBounds(57, 57, 50, 26);
		contentPane.add(year);
		year.setColumns(10);
		
		lblArrivalCity.setBounds(21, 39, 84, 16);
		contentPane.add(lblArrivalCity);
		
		searchResult.setBounds(31, 141, 314, 16);
		contentPane.add(searchResult);
		searchResult.setText("Choose an available flight in this list:");
		
		comboBox = new JComboBox<String>();
		comboBox.addPopupMenuListener(new PopupMenuListener() {
			public void popupMenuCanceled(PopupMenuEvent e) {
			}
			public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
			}
			public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
				lookforFlights.setEnabled(false);
				bidaiak.removeAllElements();
				arrival.removeAllElements();
				for (String bidaia: businessLogic.getAllDepartingCities()) {
					bidaiak.addElement(bidaia);
				}
			}
		});
		comboBox.setBounds(99, 8, 243, 22);
		contentPane.add(comboBox);
		comboBox.setModel(bidaiak);
		
		comboBox_1.addPopupMenuListener(new PopupMenuListener() {
			public void popupMenuCanceled(PopupMenuEvent e) {
			}
			public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
			}
			public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
				lookforFlights.setEnabled(true);
				if (bidaiak.getSelectedItem() != null) {
					arrival.removeAllElements();
					for (String bidaia: businessLogic.getArrivalCitiesFrom(bidaiak.getSelectedItem().toString())) {
						arrival.addElement(bidaia);
					}
				}
			}
		});
		comboBox_1.setBounds(99, 38, 243, 22);
		contentPane.add(comboBox_1);
		comboBox_1.setModel(arrival);
		
		comboBox_2 = new JComboBox<ConcreteFlight>();
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bussinesTicket.setEnabled(false);
				firstTicket.setEnabled(false);
				touristTicket.setEnabled(false);
				fareButtonGroup.clearSelection();
				
				ConcreteFlight selectedConcreteFlight = (ConcreteFlight) hegaldiak.getSelectedItem();
				if (selectedConcreteFlight != null) {
					if (selectedConcreteFlight.getBusinessNumber() != 0) {
						bussinesTicket.setEnabled(true);
					}
					if (selectedConcreteFlight.getFirstNumber() != 0) {
						firstTicket.setEnabled(true);
					}
					if (selectedConcreteFlight.getTouristNumber() != 0) {
						touristTicket.setEnabled(true);
					}
					
					bookFlight.setEnabled(false);
					bookFlight.setText("Book: "+selectedConcreteFlight);  // TODO Auto-generated Event stub valueChanged()
				}
			}
		});
		comboBox_2.addPopupMenuListener(new PopupMenuListener() {
			public void popupMenuCanceled(PopupMenuEvent e) {
			}
			public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
			}
			public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
				for (ConcreteFlightContainer f : concreteFlightContainerCollection) 
					hegaldiak.addElement(f.getConcreteFlight()); 
				if (concreteFlightContainerCollection.isEmpty()) searchResult.setText("No flights in that city in that date");
			}
		});
		comboBox_2.setBounds(31, 170, 380, 22);
		contentPane.add(comboBox_2);
		comboBox_2.setModel(hegaldiak);
		comboBox_2.setEnabled(false);

	}
}  //  @jve:decl-index=0:visual-constraint="18,9"
