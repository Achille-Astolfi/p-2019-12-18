package com.example.aprea.properties;

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
		// passo 1: devo individuare il file aprea.properties. Il file viene impacchettato nel jar insieme ai file .classe, per recuperare un file (qualunque file) dal jar
		// si usa il concetto di Resource. Il percorso relativo del jar nel mio file è /aprea.properties. Il metodo getResource si trova dentro gli oggetti
		// della class Class
		// come si fa a ottenere un oggetto della class Class? Ogni tipo java (esclusi i primitivi) dichiara una costante implicita che si chiama class.
		// quindi posso usare per sempio: ReadProperties.class
		// ma posso usare qualunque tipo io abbia definito nel mio progetto Maven, come per esempio Phone.class eccetera
		// il tipo restituito da getResource è java.net.URL
		URL resUrl = ReadProperties.class.getResource("/aprea.properties");
		// la class Class serve per fare introspezione all'interno dei tipi Java
		// Per convertire una URL in Path uso i metodi get di Paths e toURI di URL
		Path resPath;
		try {
			resPath = Paths.get(resUrl.toURI());
		} catch (URISyntaxException e) {
			// questo non può mai succedere perchè la URL restituita da getResource è sempre ben formata sintatticamente,
			// in questi casi il prof scrive così: sollevo un'eccezione che si chiama AssertionError
			throw new AssertionError(e);
		}
		// adesso creo l'oggetto Properties (java.util)
		Properties properties = new Properties();
		// apro un BufferedReader sulla Path col try-with-resources
		try (BufferedReader br = Files.newBufferedReader(resPath)) {
			// adesso che ho un BufferedReader posso evocare il metodo load di Properties
			properties.load(br);
			// Reader è una classa astratta, BufferedReade ad esmepio estente la class Reader
		}
		// ci manca solo da verificare se abbiamo caricato correttamente
		System.out.printf("jdbc.Driver: %s\n", properties.get("jdbc.driver"));
	}
}
