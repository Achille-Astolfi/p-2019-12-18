package com.example.melchionda.properties;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class ReadProperties {
	public static void main(String[] args) throws IOException {
		// passo 1: devo individuare il file melchionda.properties
		// Il file viene impacchetato nel jar insieme ai file .class
		// per recuperare qualunque file dal jar si usa il concetto di resource
		// Il percorso relativo nel jar del mio file è /melchionda.properties
		// Il metodo getResource si trova dentro gli oggetti della class Class
		// come si fa ad ottenere un oggetto della class Class? 
		// Ogni tipo Java (esclusi i primitivi) dichiara una costante implicita che 
		// si chiama class
		// Quindi posso usare per esempio: ReadProperties.class Ma posso usare
		// qualunque tipo io abbia definito nel mio progetto Maven, come per esempio Phone.class
		// etc etc
		// la variabile class punta ad un oggetto della class Class
		// tutti i tipi non primitivi identificano una variabile class
		// Il tipo restituito da getResource è java.net.URL
		URL resUrl = ReadProperties.class.getResource("/melchionda.properties");
		// Per convertire una URL in PAth uso i metodi get di Paths e toURI di URL
		Path resPath;
		try {
		    resPath = Paths.get(resUrl.toURI());
		} catch (URISyntaxException e) {
			//questo non può mai succedere perchè la URL restituita da getResource è sempre
			// ben formata sintatticamente
			// in questi casi scrivo così:
			throw new AssertionError(e);
		}

		// Adesso creo l'oggetto Properties (java.util)
		Properties properties = new Properties();
		// Apro un BufferedReader sulla Path con try-with-resources
		try (BufferedReader br = Files.newBufferedReader(resPath)) {
			// adesso che un BufferedReader posso invocare il metodo load di Properties
			properties.load(br);			
		}
		// ci manca solo da verificare che abbiamo caricato correttamente
		System.out.printf("jdbc.driver: %s\n", properties.get("jdbc.driver"));
	} 
}
