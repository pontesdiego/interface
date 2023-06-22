package functions;

import java.time.LocalDate;

import funcionario.Funcionario;
import funcionario.Genero;
import funcionario.Setor;

public class Motoboy extends Funcionario{
	
	private String carteiraDeHabilitacao;

	public Motoboy(String nome, LocalDate dataNascimento, Genero genro, Setor setor, double salarioBase,
			String carteiraDeHabilitacao) {
		super(nome, dataNascimento, genro, setor, salarioBase);
		this.carteiraDeHabilitacao = carteiraDeHabilitacao;
	}

	public String getCarteiraDeHabilitacao() {
		return carteiraDeHabilitacao;
	}

	public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
		this.carteiraDeHabilitacao = carteiraDeHabilitacao;
	}

	@Override
	public String toString() {
		return "Motoboy " +
	            super.toString()
				+ "\n carteiraDeHabilitacao: " + carteiraDeHabilitacao;
	}

	@Override
	public double getSalarioFinal() {
		return salarioBase;
	}
	
	
	
	

}
