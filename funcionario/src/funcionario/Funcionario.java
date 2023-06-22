package funcionario;

import java.time.LocalDate;

import functions.Util;
import interfaces.SalarioFinal;

public abstract class Funcionario implements SalarioFinal{
	
	protected String nome;
	protected LocalDate dataNascimento;
	protected Genero genero;
	protected Setor setor;
	protected double salarioBase;
	
	public Funcionario(String nome, LocalDate dataNascimento, Genero genro, Setor setor, double salarioBase) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.genero = genro;
		this.setor = setor;
		this.salarioBase = salarioBase;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Genero getGenro() {
		return genero;
	}

	public void setGenro(Genero genro) {
		this.genero = genro;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	@Override
	public String toString() {
		return "Funcionario "
				+ "nome: " + nome + ", dataNascimento=" + Util.formatarData(dataNascimento) + ", genero=" + genero.texto + ", setor="
				+ setor.texto + ", salarioBase=" + Util.formatarBrl(salarioBase) +
				"Salario Final: " + Util.formatarBrl(getSalarioFinal());
	}
	
	
	

}
