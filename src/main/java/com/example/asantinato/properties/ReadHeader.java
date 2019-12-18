package com.example.asantinato.properties;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Scanner;

public class ReadHeader {
	public static void main(String[] args) {
		// stessi passaggi dell'altra class Read
		
		// [Passo 1]: identifico il file santinato.properties
				URL resUrl = ReadProperties.class.getResource("/header.txt");
				
				// per convertire una URL in una PATH ( più facile da gestire) devo utilizzare i metodi get di Paths e toURI di URL
				Path resPath;
				try {
					resPath = Paths.get(resUrl.toURI());
				} catch (URISyntaxException urise) {
					throw new AssertionError(urise);
				}
				
				// uso lo scan per aprire e leggere il file. tutto dentro ad un try-catch per gestire più eccezioni
				String header;
				try {
					try (Scanner input = new Scanner(resPath)) {
						header = input.nextLine();
						System.out.println(header);
					}
				} catch (IOException | NoSuchElementException e) {
					// TODO: handle exception
					// in questo modo gestisto due possibili exception nello stesso blocco catch
				}
				
	}
}
