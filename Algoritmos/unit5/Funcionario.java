package unit5;

public class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	
	public double getBonificacao() {
		return this.getSalario() * 0.10;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	
}


