/* 
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2022
 * Fecha de Actualización: 09/06/2022
 * Descripción: Programa que traduce palabras de Español a Inglés  y viceversa , 
 * 	también ofrece opciones de crear una nueva traducción y también eliminar   
 * 
 * */
package traductor.pojo;


public class Palabra {
    private String espaniol;
	private String ingles;

	public Palabra() {
	}

	public Palabra(String espaniol, String ingles) {
		this.espaniol = espaniol;
		this.ingles = ingles;
	}

	public String getEspaniol() {
		return espaniol;
	}

	public void setEspaniol(String espaniol) {
		this.espaniol = espaniol;
	}

	public String getIngles() {
		return ingles;
	}

	public void setIngles(String ingles) {
		this.ingles = ingles;
	}

}
