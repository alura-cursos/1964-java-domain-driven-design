package br.com.alura.escola.shared.dominio.evento;

import java.time.LocalDateTime;
import java.util.Map;

public interface Evento {
	
	LocalDateTime momento();
	TipoDeEvento tipo();
	Map<String, Object> informacoes();
	
}
