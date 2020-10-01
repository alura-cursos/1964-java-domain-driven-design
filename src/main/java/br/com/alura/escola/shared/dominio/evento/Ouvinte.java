package br.com.alura.escola.shared.dominio.evento;

public abstract class Ouvinte {
	
	public void processa(Evento evento) {
		if (this.deveProcessar(evento)) {
			this.reageAo(evento);
		}
	}

	protected abstract void reageAo(Evento evento);
	protected abstract boolean deveProcessar(Evento evento);
	
	

}
