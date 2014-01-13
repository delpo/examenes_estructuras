package ej4;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeSet;

import ej3.DoubleLinkedList;

public class EleccionesGenerales {
	
	public class VotosDePartido implements Comparable<VotosDePartido>{
		private String partido;
		private int votos;
		
		public VotosDePartido(){}
		
		public VotosDePartido(String partido, int votos){
			this.partido = partido;
			this.votos = votos;
		}
		
		public String getPartido(){
			return partido;
		}
		
		public int getVotos(){
			return votos;
		}
		
		public void setPartido(String partido){
			this.partido = partido;
		}
		
		public void setVotos(int votos){
			this.votos = votos;
		}

		@Override
		public int compareTo(VotosDePartido arg0) {
			if(this.partido.equals(arg0.getPartido())) return 0;
			else return 1;
		}
		public boolean equals(VotosDePartido arg0){
			if(this.partido.equals(arg0.getPartido())) return true;
			else return false;
		}
	}
	
	private HashMap<String, TreeSet<VotosDePartido>> datos;
	
	public EleccionesGenerales(){
		datos  = new HashMap<String, TreeSet<VotosDePartido>>();
	}
	
	public void IncluirProvincia(String provincia){
		TreeSet<VotosDePartido> votos = new TreeSet<VotosDePartido>();
		if(!datos.containsKey(provincia)){
			datos.put(provincia, votos);
		}
	}
	
	public void VotosPartido(String provincia, String partido, int votos){
		boolean ok = false;
		for (VotosDePartido midato : datos.get(provincia)) {
			if(midato.getPartido().equals(partido)){
				midato.setVotos(votos);
				ok = true;
			}
		}
		if(!ok) datos.get(provincia).add(new VotosDePartido(partido, votos));
	}
	
	public void MostrarVotosProvincia(String provincia){
		for (VotosDePartido entry : datos.get(provincia)) {
			System.out.println("Partido : " + entry.getPartido() + " Votos : "
				+ entry.getVotos());
		}
	}
	
	public int VotosTotal(String partido){
		int votos = 0;
		for (Entry<String, TreeSet<VotosDePartido>> entry : datos.entrySet()) {
			for (VotosDePartido entry2 : entry.getValue()) {
				if(entry2.getPartido().equals(partido)){
					votos += entry2.getVotos();
				}
			}
			
		}
		return votos;
	}
	
	public Collection<Integer> TodosTotales(){
		Collection<Integer> coleccion = new DoubleLinkedList<Integer>();
		TreeSet<VotosDePartido> partidos = obtenerPartidos();
		for (VotosDePartido entry : partidos) { //para cada partido
			for (Entry<String, TreeSet<VotosDePartido>> entry2 : datos.entrySet()) { //miro cada provincia
				for(VotosDePartido mipartido : entry2.getValue()){
						if(mipartido.getPartido().equals(entry.getPartido())){
							int valor = entry.getVotos() + mipartido.getVotos();
							entry.setVotos(valor);
						}
				}
			}
		}
		for (VotosDePartido entry : partidos) {
			coleccion.add(entry.getVotos());
		}
		return coleccion;
		
	}
	public Collection<String> TodosPartidos(){
		Collection<String> coleccion = new DoubleLinkedList<String>();
		TreeSet<VotosDePartido> partidos = obtenerPartidos();
		/*for (VotosDePartido entry : partidos) {
			coleccion.add(entry.getPartido());
		}*/
		Iterator<VotosDePartido> itr=partidos.iterator();
		while(itr.hasNext()){
		    String c=itr.next().getPartido();
		    coleccion.add(c);
		}
		return coleccion;
		
	}
	
	private TreeSet<VotosDePartido> obtenerPartidos(){
		TreeSet<VotosDePartido> partidos = new TreeSet<VotosDePartido>();
		//obtengo todos los partidos
		for (Entry<String, TreeSet<VotosDePartido>> entry : datos.entrySet()) { //cada provincia
			boolean ok = false;
			for (VotosDePartido entry2 : entry.getValue()) { //cada partido
 				ok = false;
				for(VotosDePartido compr : partidos){ //cada partido ya a–adido
					if(compr.equals(entry2))
						ok = true;
				}
				if(!ok){ //nuevo partido
					partidos.add(new VotosDePartido(entry2.getPartido(), 0));
				}
			}
		}
		return partidos;
	}
}
