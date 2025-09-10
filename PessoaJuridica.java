package atividades;

public class PessoaJuridica extends Funcionario {

	private double valorBruto;
	private double imposto;
	
	public PessoaJuridica(int id, String nome, String telefone, int matricula, String endereco, double valorBruto, double imposto) {
		super(id, nome, telefone, matricula, endereco);
		this.valorBruto = valorBruto;
		this.imposto = imposto;
	}

	public double calculoSalario() {
		return valorBruto - imposto;
	
	}

	@Override
	public double calculaSalario() {
		return 0;
	}	
}
