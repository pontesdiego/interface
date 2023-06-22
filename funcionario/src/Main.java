import java.time.LocalDate;
import java.time.Month;

import funcionario.Genero;
import funcionario.Setor;
import functions.Diretor;
import functions.Motoboy;

public class Main {

	public static void main(String[] args) {
		Motoboy moto = new Motoboy("Diego", LocalDate.of(2005, Month.APRIL, 30), Genero.MASCULINO, Setor.OPERACOES, 1200, "889587457");
		
		Diretor direct = new Diretor("Diego", LocalDate.of(2005, Month.APRIL, 30), Genero.MASCULINO, Setor.OPERACOES, 1200, 0.2);
		
		direct.admitir(moto);
		
		
		System.out.println(direct); 

	}

}
