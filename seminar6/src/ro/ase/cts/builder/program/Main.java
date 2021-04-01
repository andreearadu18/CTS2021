package ro.ase.cts.builder.program;

import ro.ase.cts.builder.clase.Rezervare;
import ro.ase.cts.builder.clase.RezervareBuilder;

public class Main {

	public static void main(String[] args) {
		// E.3 - builder
		Rezervare rezervare1 = new RezervareBuilder().setAreBauturaInclusa(true).setCodRezervare(200).build();
		Rezervare rezervare2 = new RezervareBuilder().setAreScaunErgonomic(true).setCodRezervare(100).build();
		
		Rezervare rezervare3 = new Rezervare(300,false,true,true,false,"Rock");
		
		RezervareBuilder newBuilder = new RezervareBuilder().setAreMancareInclusa(true).setAreBauturaInclusa(true).setAreScaunErgonomic(true);
		//shallow copy - prb builder
		Rezervare rezervare4 = newBuilder.setCodRezervare(100).build();
		Rezervare rezervare5 = newBuilder.setCodRezervare(101).build();
		
		
		System.out.println(rezervare1.toString());
		System.out.println(rezervare2.toString());
		System.out.println(rezervare3.toString());
	}

}
