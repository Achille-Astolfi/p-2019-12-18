package com.example.patane.properties;

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
		URL resUrl= ReadProperties.class.getResource("/patane.properties");
		Path resPath;
		try {
			resPath = Paths.get(resUrl.toURI());
		}catch (URISyntaxException e) {
			throw new AssertionError(e);
			// TODO Auto-generated catch block
		}
		Properties properties= new Properties();
		try (BufferedReader br= Files.newBufferedReader(resPath)) {
			properties.load(br);
		}
		System.out.println("JDBC.DRIVER:" + properties.getProperty("jdbc.driver"));
	}
}
