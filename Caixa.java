package javaBank;

public class Caixa extends Funcionario implements Autenticavel {
	
	private Autenticador Login = new Autenticador();;
	private double bonificacao = super.getSalario() * 0.05;;

	public Caixa(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}
	
	public double getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}

	public double getSalario() {
		return super.getSalario() + this.bonificacao;
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
