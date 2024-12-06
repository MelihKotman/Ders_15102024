package ufakOrnekler;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
public class lab6 {

	public static void main(String[] args) {
		/**
		LinkedList<String> car = new LinkedList<String>();
		car.add("Volvo");
		car.add("BMW");
		car.add(0,"Mercedes"); //mercedesi volvo arasina baglanti attik...
		for(String  ncar : car  ) {
			System.out.println(ncar);
		
		}
		**/
		//HASH MAP <key,value> seklinde calisir
		HashMap <String, Integer> m = new HashMap<String, Integer>();
		// int yerine Integer yazma sebebimiz Integer bir class'tır ve int yazinca integer sinifindan bilgi cekiyordu simdi sinifi yazdik
		m.put("Bolu",14 );
		m.put("Ankara", 6);
		m.put("Istanbul", 34);
		for(String i : m.keySet()) { //keySet dedigimiz keyleri alip i'ye attik ve printleyince m.get(i) value'lari aldik
			System.out.println("Key : " + i + " Value : " + m.get(i));
		}
	}
}

