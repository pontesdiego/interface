package funcionario;

public enum Genero {
	
	MASCULINO("Masculino"),
	FEMININO("Feminino");
	
	protected final String texto;

	private Genero(String texto) {
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}
	
	

}
