package com.example.melchionda.properties;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.net.URISyntaxException;
import java.net.URL;
import java.io.IOException;


public class ReadHeader {
	public static void main(String[] args) {
		//stessi passaggi dell'altra class: ottengo la URL col metodo getResource su ReadHeader.class
		// converto in Path usando Paths.get e URL.toURI
		// uso Scanner per leggere la Path
		URL resUrl = ReadHeader.class.getResource("/header.txt");
		Path resPath;
		try {
			resPath = Paths.get(resUrl.toURI());
		} catch (URISyntaxException urise) {
			throw new AssertionError(urise);
		} catch (NullPointerException npe) {
			// gestisco diverse exception in modi diversi 
			resPath = Paths.get("C:", "Temp", "header.txt");
		}
		String header; 
		// per l'esempio richiesto (gestire più eccezioni) uso un blocco try-catch
		try {
			try (Scanner in = new Scanner(resPath)) {
				// non controllo apposta hasNextLine()
				header = in.nextLine();
			}
		}  catch (IOException | NoSuchElementException e) {
			// in questo modo gestisco due possibili exception nello stesso blocco catch
		}
	}
}
