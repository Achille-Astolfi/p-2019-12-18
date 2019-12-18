package com.example.asantinato.properties;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class ReadProperties {
	public static void main(String[] args) {
		// [Passo 1]: identifico il file santinato.properties
		URL resUrl = ReadProperties.class.getResource("/santinato.properties");
		
		// per convertire una URL in una PATH ( più facile da gestire) devo utilizzare i metodi get di Paths e toURI di URL
		Path resPath;
		try {
			resPath = Paths.get(resUrl.toURI());
		} catch (URISyntaxException e) {
			throw new AssertionError(e);
		}
		
		// creo l'oggetto Properties
		Properties properties = new Properties();
		
		// apro un BufferedReader sulla path specificatata usando il try-with-resources
		try (BufferedReader lettore = Files.newBufferedReader(resPath)){
			properties.load(lettore);
		} catch (IOException e) {
			// TODO Auto-generated catch block
		}
		
		System.out.println("jdbc.driver: " + properties.get("jdbc.driver"));
	}
}
