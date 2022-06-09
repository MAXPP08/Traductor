/* 
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2022
 * Fecha de Actualización: 09/06/2022
 * Descripción: Programa que traduce palabras de Español a Inglés  y viceversa , 
 * 	también ofrece opciones de crear una nueva traducción y también eliminar   
 * 
 * */
package traductor.model;

import java.util.HashMap;
import traductor.pojo.Palabra;

public class DiccionarioINaESmodel {
    public HashMap<String, String> CrearINaES(HashMap<String, String> palabraINaES) {

		// PALABRAS DE INGLÉS A ESPAÑOL
		palabraINaES.put("computer", "computadora");
		palabraINaES.put("cat", "gato");
		palabraINaES.put("red", "Rojo");
		palabraINaES.put("tree", "árbol");
		palabraINaES.put("penguin", "pingüino");
		palabraINaES.put("sun", "sol");
		palabraINaES.put("water", "agua");
		palabraINaES.put("wind", "viento");
		palabraINaES.put("siesta", "siesta");
		palabraINaES.put("up", "arriba");
		palabraINaES.put("mouse", "ratón");
		palabraINaES.put("arena", "estadio");
		palabraINaES.put("aspersion", "calumnia");
		palabraINaES.put("avocado", "aguacate");
		palabraINaES.put("body", "cuerpo");
		palabraINaES.put("contest", "concurso");
		palabraINaES.put("dinner", "cena");
		palabraINaES.put("exit", "salida");
		palabraINaES.put("lentil", "lenteja");
		palabraINaES.put("pan", "cacerola");
		palabraINaES.put("pie", "pastel");
		palabraINaES.put("quince", "membrillo");
		palabraINaES.put("teacher", "maestro");
                palabraINaES.put("hello", "hola");
                palabraINaES.put("enjoy", "disfrutar");
                
                palabraINaES.put("easy", "facil");
                palabraINaES.put("follow", "seguir");
                palabraINaES.put("good", "bueno");
                palabraINaES.put("huge", "enorme");
                palabraINaES.put("friendly", "amable");
                palabraINaES.put("exam", "examen");
                palabraINaES.put("jump", "saltar");
                palabraINaES.put("speak", "hablar");
                palabraINaES.put("beach", "playa");
                palabraINaES.put("welcome", "bienvenido");
                palabraINaES.put("hard", "dificil");

		return palabraINaES;

	}

	public String INaES(HashMap<String, String> palabraINaES, String entradaI) {
		// if ((palabraINaES.containsKey(entradaI.toLowerCase()))) {
		return palabraINaES.get(entradaI.toLowerCase());
		// }
		// return null;
	}

	public HashMap<String, String> AgregarINaES(HashMap<String, String> palabraINaES, Palabra palabra) {
		palabraINaES.put(palabra.getIngles(), palabra.getEspaniol());

		return palabraINaES;
	}
}
