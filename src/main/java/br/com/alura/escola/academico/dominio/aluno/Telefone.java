package br.com.alura.escola.academico.dominio.aluno;

public class Telefone {
	
	private String ddd;
	private String numero;

	public Telefone(String ddd, String numero) {
		if (ddd == null || numero == null) {
			throw new IllegalArgumentException("DDD e Numero sao obrigatorios!");
		}

		if (!ddd.matches("\\d{2}")) {
			throw new IllegalArgumentException("DDD invalido!");
		}
		
		if (!numero.matches("\\d{8}|\\d{9}")) {
			throw new IllegalArgumentException("Numero invalido!");
		}
		this.ddd = ddd;
		this.numero = numero;
	}

	public String getDdd() {
		return ddd;
	}
	
	public String getNumero() {
		return numero;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ddd == null) ? 0 : ddd.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telefone other = (Telefone) obj;
		if (ddd == null) {
			if (other.ddd != null)
				return false;
		} else if (!ddd.equals(other.ddd))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		return true;
	}
	
}
