package ej3;

import java.util.LinkedList;

public class GestorMemoria {
	public int cantidad;
	LinkedList<Bloque> memoria;
	
	public GestorMemoria(int cantidad){
		this.cantidad = cantidad;
		memoria = new LinkedList<Bloque>();
		Bloque bloque_unico = new Bloque(0, cantidad-1);
		memoria.add(bloque_unico);
	}
	
	public int Reserva(int cantidad) throws ExcepcionMemoriaLlena{
		int dirMemoria = 0; int indice = 0;
		Boolean ok = false;
		
		for(Bloque blq : memoria){
			int capacidadBloque = blq.fin - blq.inicio;
			if(capacidadBloque == cantidad){
				blq.ocupado = true;
				ok = true;
			}else if(capacidadBloque > cantidad){
				int fin = blq.fin;
				memoria.get(indice).fin = memoria.get(indice).inicio + cantidad;
				memoria.add(indice+1, new Bloque(memoria.get(indice).inicio + cantidad +1, fin));
				ok = true;
			}
			indice++;
		}
		if(!ok) throw new ExcepcionMemoriaLlena();
		return dirMemoria;
		
	}
	
	public void Libera(int direccion) throws ExcepcionDireccionInvalida{
		Boolean encontrado = false;
		for(Bloque blq : memoria){
			if(blq.inicio == direccion){
				blq.ocupado = false;
				encontrado = true;
			}
		}
		if(!encontrado) throw new ExcepcionDireccionInvalida();
	}

}
