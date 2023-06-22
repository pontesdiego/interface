package functions;

import java.time.LocalDate;

import funcionario.Funcionario;
import funcionario.Genero;
import funcionario.Setor;
import interfaces.Contratacao;

public class Diretor extends Funcionario implements Contratacao{
	
	private double premio;

	public Diretor(String nome, LocalDate dataNascimento, Genero genro, Setor setor, double salarioBase,
			double premio) {
		super(nome, dataNascimento, genro, setor, salarioBase);
		this.premio = premio;
	}

	public double getPremio() {
		return premio;
	}

	public void setPremio(double premio) {
		this.premio = 0.2;
	}

	@Override
	public double getSalarioFinal() {
		return salarioBase + (salarioBase * this.premio);
	}

	@Override
	public void admitir(Funcionario funcionario) {
	   System.out.println("Funcionario contratado: " + funcionario);
	}

	@Override
	public void demitir(Funcionario funcionario) {
		System.out.println("Funcionario demitido: " + funcionario);
		
	}

	@Override
	public String toString() {
		return "Diretor " +
	            super.toString()
				+ "premio: " + premio ;
	}
	
	

}
