package javaBank;

public class Gerente extends Funcionario {
	
	private Autenticador Login = new Autenticador();
	private double bonificacao = super.getSalario() * 0.1;

	public Gerente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		this.Login = new Autenticador();
	}
	
	
	public double getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}

	public double getSalario() {
		return super.getSalario() + bonificacao;
	}
	
	public void setSenha(int senha) {
		Login.setSenha(senha);
	}
	
	public int getSenha() {
		return super.getSenha();
	}
	
	public boolean autentica(int senha) {
		return Login.autentica(senha);
	}
}
