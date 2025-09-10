package atividades;

public abstract class Funcionario {
	
	private int id;
	private String nome;
	private String telefone;
	private int matricula;
	private String endereco;
	
	public Funcionario (int id, String nome, String telefone, int matricula, String endereco) {
		
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.matricula = matricula;
		this.endereco = endereco;
	}
	
	public double calculoSalario() {
		
		return 0;
	}
	
	public int getId() {
		return id;
	
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public String getEndereco() {
		return endereco;
	}

}
