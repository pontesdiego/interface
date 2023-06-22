package funcionario;

public enum Setor {

	RECURSOS_HUMANOS("Recursos Humanos"),
	FINANCEIRO("Financeiro"),
	OPERACOES("Operações");
	

	protected final String texto;

	private Setor(String texto) {
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}
	
	
	
	
}
