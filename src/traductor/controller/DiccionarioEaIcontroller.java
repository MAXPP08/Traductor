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
import traductor.model.DiccionarioEaImodel;
import traductor.pojo.Palabra;


public class DiccionarioEaIcontroller {
    DiccionarioEaImodel diccionario = new DiccionarioEaImodel();

	// Matodos de DiccionarioESaIN
	public HashMap<String, String> CrearESaIN(HashMap<String, String> palabraESaIN) {
		return diccionario.CrearESaIN(palabraESaIN);
	}

	public String ESaIN(HashMap<String, String> palabraESaIN, String entradaE) {
		return diccionario.ESaIN(palabraESaIN, entradaE);
	}

	public HashMap<String, String> AgregarESaIN(HashMap<String, String> palabraESaIN, Palabra palabra) {
		return diccionario.AgregarESaIN(palabraESaIN, palabra);
	}

}
