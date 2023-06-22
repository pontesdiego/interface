package funcionario;

public enum Setor {

	RECURSOS_HUMANOS("Recursos Humanos"),
	FINANCEIRO("Financeiro"),
	OPERACOES("Opera��es");
	

	protected final String texto;

	private Setor(String texto) {
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}
	
	
	
	
}
