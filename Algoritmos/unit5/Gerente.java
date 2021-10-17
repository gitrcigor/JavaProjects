package unit5;

public class Gerente extends Funcionario {
	private int senha;
	private int numeroDeFuncionariosGerenciados;
	
	@Override	
	public double getBonificacao() {
		return this.getSalario() * 0.15;
	}
	

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso	Permitido!");
			return true;
		} else {
			System.out.println("Acesso	Negado!");
			return false;
		}
		
	}
	
	
	
	
	
	
	// setter da senha omitido
}