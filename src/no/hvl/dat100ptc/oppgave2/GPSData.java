package no.hvl.dat100ptc.oppgave2;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import no.hvl.dat100ptc.TODO;
import no.hvl.dat100ptc.oppgave1.GPSPoint;

public class GPSData {

	private GPSPoint[] gpspoints;
	protected int antall = 0;

	public GPSData(int n) {
		gpspoints=new GPSPoint [n];
		this.antall=0;
		

		// TODO - START
		
//		throw new UnsupportedOperationException(TODO.construtor("GPSData"));

		// TODO - SLUTT
	}

	public GPSPoint[] getGPSPoints() {
		
		return this.gpspoints;
	}
	
	protected boolean insertGPS(GPSPoint gpspoint) {

		boolean inserted = false;
		if (this.antall<this.gpspoints.length) {
			this.gpspoints[antall]=gpspoint;
		    antall++;
		    return !inserted;}
		    else
		    	return inserted;		

		// TODO - START
		
//		throw new UnsupportedOperationException(TODO.method());

		// TODO - SLUTT
	}

	public boolean insert(String time, String latitude, String longitude, String elevation){
		int secs; 
		int hr, min, sec;
		hr=parseInt( time.substring(11,13))*60*60;
        min=parseInt(time.substring(14, 16))*60;
        sec=parseInt(time.substring(17,19));
        secs=hr+min+sec;
		double la=parseDouble(latitude);
        double lo=parseDouble(longitude);
        double el=parseDouble(elevation);
		GPSPoint gpspoint = new GPSPoint(secs,la,lo,el);
		return true;

		// TODO - START
		
//		throw new UnsupportedOperationException(TODO.method());

		// TODO - SLUTT
		
	}

	public void print() {

		System.out.println("====== Konvertert GPS Data - START ======");

		// TODO - START

		throw new UnsupportedOperationException(TODO.method());

		// TODO - SLUTT
		
		// System.out.println("====== Konvertert GPS Data - SLUTT ======");

	}
}
