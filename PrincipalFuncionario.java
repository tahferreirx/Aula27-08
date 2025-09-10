package atividades;

public class PrincipalFuncionario {
	
	public static void main(String[] args) {
		Jornada funcionario1 = new Jornada(1, "Luana", "99754-6248", 101, "Rua A", 400.0, 180);
		Horista funcionario2 = new Horista(2, "Carlos", "99542-2578", 102, "Rua B", 60.0, 190);
		PessoaJuridica funcionario3 = new PessoaJuridica(3, "Empresa Wall", "99248-7462", 103, "Av. Central", 100000.0, 2500.0);
		
		System.out.println(funcionario1.getNome() + " - Salário: R$ " + funcionario1.calculoSalario());
		System.out.println(funcionario2.getNome() + " - Salário: R$ " + funcionario2.calculoSalario());
		System.out.println(funcionario3.getNome() + " - Salário: R$ " + funcionario3.calculoSalario());
	}	

}
