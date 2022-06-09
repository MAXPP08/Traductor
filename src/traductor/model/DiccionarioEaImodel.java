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

public class DiccionarioEaImodel {
    public HashMap<String, String> CrearESaIN(HashMap<String, String> palabraESaIN) {

		// PALABRAS DE ESPAÑOL A INGLÉS
		palabraESaIN.put("computadora", "computer");
		palabraESaIN.put("gato", "cat");
		palabraESaIN.put("rojo", "Red");
		palabraESaIN.put("árbol", "tree");
		palabraESaIN.put("pingüino", "penguin");
		palabraESaIN.put("sol", "sun");
		palabraESaIN.put("agua", "water");
		palabraESaIN.put("viento", "wind");
		palabraESaIN.put("siesta", "snap");
		palabraESaIN.put("arriba", "up");
		palabraESaIN.put("raton", "mouse");
		palabraESaIN.put("estadio", "arena");
		palabraESaIN.put("calumnia", "aspersion");
		palabraESaIN.put("aguacate", "avocado");
		palabraESaIN.put("cuerpo", "body");
		palabraESaIN.put("concurso", "contest");
		palabraESaIN.put("cena", "dinner");
		palabraESaIN.put("salida", "exit");
		palabraESaIN.put("cima", "top");
		palabraESaIN.put("cacerola", "pan");
		palabraESaIN.put("pastel", "pie");
		palabraESaIN.put("hola", "hello");
		palabraESaIN.put("maestro", "teacher");
                palabraESaIN.put("disfrutar", "enjoy");
                palabraESaIN.put("facil", "easy");
                palabraESaIN.put("seguir", "follow");
                palabraESaIN.put("bueno", "good");
                palabraESaIN.put("enorme", "huge");
                palabraESaIN.put("amable", "friendly");
                palabraESaIN.put("examen", "exam");
                palabraESaIN.put("saltar", "jump");
                palabraESaIN.put("hablar", "speak");
                palabraESaIN.put("playa", "beach");
                palabraESaIN.put("bienvenido", "welcome");
                palabraESaIN.put("dificil", "hard");
		return palabraESaIN;
	}

	public String ESaIN(HashMap<String, String> palabraESaIN, String entradaE) {
		if ((palabraESaIN.containsKey(entradaE.toLowerCase()))) {
			return palabraESaIN.get(entradaE.toLowerCase());
		}
		return null;
	}

	public HashMap<String, String> AgregarESaIN(HashMap<String, String> palabraESaIN, Palabra palabra) {
		palabraESaIN.put(palabra.getEspaniol(), palabra.getIngles());

		return palabraESaIN;
	}
}
