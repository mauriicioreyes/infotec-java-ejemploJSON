package com.example.demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import com.google.gson.Gson;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EjemploJsonApplication {

	public static void main(String[] args) {
		
		String jsonFinal = "";
		Gson gson = new Gson();
		try {
			BufferedReader br = new BufferedReader(new FileReader("prueba.json"));
			
			String linea = "";
			
			try {
				while((linea = br.readLine()) != null) {
					jsonFinal += linea;
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		// Conversión de JSON a Objeto Java
		personaDTO datos = gson.fromJson(jsonFinal, personaDTO.class);
		
		// Conversion de Objeto Java a JSON
		String jsonJava = gson.toJson(datos);
		
		System.out.println("Resultado: " + jsonFinal);
	}
}