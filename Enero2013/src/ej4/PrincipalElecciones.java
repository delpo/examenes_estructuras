package ej4;

import java.util.Collection;

import ej3.DoubleLinkedList;

public class PrincipalElecciones {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EleccionesGenerales elecciones = new EleccionesGenerales();
		elecciones.IncluirProvincia("Castellon");
		elecciones.VotosPartido("Castellon", "PP", 34000);
		elecciones.VotosPartido("Castellon", "PSOE", 15000);
		elecciones.VotosPartido("Castellon", "Compromis", 7000);
		elecciones.VotosPartido("Castellon", "IU", 2000);
		elecciones.VotosPartido("Castellon", "UPyD", 1920);
		System.out.println("--Castell—n--");
		elecciones.MostrarVotosProvincia("Castellon");
		elecciones.IncluirProvincia("Barcelona");
		elecciones.VotosPartido("Barcelona", "PP", 140000);
		elecciones.VotosPartido("Barcelona", "PSOE", 310000);
		elecciones.VotosPartido("Barcelona", "CiU", 420000);
		elecciones.VotosPartido("Barcelona", "IU", 110000);
		elecciones.VotosPartido("Barcelona", "ERC", 390000);
		System.out.println("--Barcelona--");
		elecciones.MostrarVotosProvincia("Barcelona");
		System.out.println("--Suma de ambas provincias--");
		Collection<String> partidos = new DoubleLinkedList<String>();
		partidos = elecciones.TodosPartidos();
		System.out.println(partidos.toString());
		Collection<Integer> totales = new DoubleLinkedList<Integer>();
		totales = elecciones.TodosTotales();
		System.out.println(totales.toString());
	}

}
