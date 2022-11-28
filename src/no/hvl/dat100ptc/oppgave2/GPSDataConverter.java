package no.hvl.dat100ptc.oppgave2;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import no.hvl.dat100ptc.oppgave1.GPSPoint;

public class GPSDataConverter {

	// konverter tidsinformasjon i gps data punkt til antall sekunder fra midnatt
	// dvs. ignorer information om dato og omregn tidspunkt til sekunder
	// Eksempel - tidsinformasjon (som String): 2017-08-13T08:52:26.000Z
    // skal omregnes til sekunder (som int): 8 * 60 * 60 + 52 * 60 + 26 
	
	private static int TIME_STARTINDEX = 11; // posisjon for start av tidspunkt i timestr

	public static int toSeconds(String timestr) {
		int secs; 
		int hr, min, sec;
		hr=parseInt( timestr.substring(11,13))*60*60;
        min=parseInt(timestr.substring(14, 16))*60;
        sec=parseInt(timestr.substring(17,19));
        secs=hr+min+sec;
		return secs; 
		
		// TODO
		// OPPGAVE - START
		
//		throw new UnsupportedOperationException(TODO.method());

		// OPPGAVE - SLUTT
		
	}

	public static GPSPoint convert(String timeStr, String latitudeStr, String longitudeStr, String elevationStr){

		GPSPoint gpspoint= new GPSPoint(8*60*60+52*60+26,parseDouble(latitudeStr),parseDouble(longitudeStr),parseDouble(elevationStr));
		return gpspoint;

		// TODO - START ;
		
//		throw new UnsupportedOperationException(TODO.method());

		// OPPGAVE - SLUTT ;
	    
	}
	
}
