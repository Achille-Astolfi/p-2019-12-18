package com.example.astolfi.properties;

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
		// passo 1: devo individuare il file astolfi.properties
		// Il file viene impachettato nel Jar insieme ai file .class
		// Per recuperare un file (qualunque file) dal Jar si usa il concetto di Resource
		// Il percorso relativo nel Jar del mio file è /astolfi.properties
		// Il metodo getResource si trova dentro gli oggetti della class Class
		// Come si fa a ottenere un oggetto della class Class? Ogni tipo Java (esclusi i primitivi)
		// dichiara una costante implicita che si chiama class
		// Quindi posso usare per esempio: ReadProperties.class Ma posso usare
		// qualunque tipo io abbia definito nel mio progetto Maven, come per esempio Phone.class
		// eccetera eccetera
		// Il tipo restituito da getResource è java.net.URL
		URL resUrl = ReadProperties.class.getResource("/astolfi.properties");
		// Per convertire una URL in Path uso i metodi get di Paths e toURI di URL
		Path resPath;
		try {
			resPath = Paths.get(resUrl.toURI());
		} catch (URISyntaxException e) {
			// questo non può mai succedere perché la URL restituita da getResource è sempre
			// ben formata sintatticamente
			// in questi casi io Achille Astolfi scrivo così:
			// Sollevo un' "eccezione" che si chiama AssertionError
			throw new AssertionError(e);
		}
		// Adesso creo l'oggetto Properties (java.util)
		Properties properties = new Properties();
		// Apro un BufferedReader sulla Path con try-with-resources
		try (BufferedReader br = Files.newBufferedReader(resPath)) {
			// adesso che ho un BufferedReader posso invocare il metodo load di Properties
			properties.load(br);
		}
		// ci manca solo da verificare se abbiamo caricato correttamente
		System.out.printf("jdbc.driver: %s\n", properties.get("jdbc.driver"));
	}
}
