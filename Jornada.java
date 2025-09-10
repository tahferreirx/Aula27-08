package atividades;

public class Jornada extends Funcionario{
	
	private double salarioHora;
	private int horasTrabalhadas;
	
	public Jornada (int id, String nome, String telefone, int matricula, String endereco, double salarioHora, int horasTrabalhadas) {
		super (id, nome, telefone, matricula, endereco);
		
		this.salarioHora = salarioHora;
		this.horasTrabalhadas = horasTrabalhadas;
			
	}
	
	@Override 
	public double calculoSalario() {
		return salarioHora * horasTrabalhadas;
	}
	
	@Override
	public double calculaSalario() {
		return 0;
	}

}
