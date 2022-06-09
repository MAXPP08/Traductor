/* 
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2022
 * Fecha de Actualización: 09/06/2022
 * Descripción: Programa que traduce palabras de Español a Inglés  y viceversa , 
 * 	también ofrece opciones de crear una nueva traducción y también eliminar   
 * 
 * */
package traductor.controller;


import java.util.HashMap;
import traductor.model.DiccionarioINaESmodel;
import traductor.pojo.Palabra;

public class DiccionarioINaEScontroller {
    	DiccionarioINaESmodel diccionario = new DiccionarioINaESmodel();

	// Matodos de DiccionarioINaES
	public HashMap<String, String> CrearINaES(HashMap<String, String> palabraINaES) {
		return diccionario.CrearINaES(palabraINaES);
	}

	public String INaES(HashMap<String, String> palabraINaES, String entradaI) {
		return diccionario.INaES(palabraINaES, entradaI);
	}

	public HashMap<String, String> AgregarINaES(HashMap<String, String> palabraESaIN, Palabra palabra) {
		return diccionario.AgregarINaES(palabraESaIN, palabra);
	}
}
