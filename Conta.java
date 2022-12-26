package javaBank;

public abstract class Conta {
	private int agencia;
	private int numero;
	private double saldo;
	private Cliente titular;
	private static int totalContas;
	
	
	//CONSTRUTOR
	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		
		System.out.println("Criando conta " + this.numero);
		Conta.totalContas++;
		
		}
	
	//METODO DEPOSITA
	public void deposita(double valor) {
		this.saldo += valor;
		
	}
	
	//METODO SACA
	public void saca(double valor) {
		
		double taxa = valor * 0.01;
				
		if(this.saldo < valor + taxa) {
			System.out.println("Saldo insuficiente");
		} else {
			this.saldo -= valor + taxa;
			System.out.println("Saque efetuado");
		}
	}
	
	//METODO TRANSFERE
	public void transfere(double valor, Conta contaDestino) {
		
		double taxa = valor * 0.01;
		
		if(this.saldo < valor + taxa) {
			System.out.println("Saldo insuficiente");
		} else {
			this.saca(valor + taxa);
			contaDestino.deposita(valor);
		}
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotalContas() {
		return totalContas;
	}

	public static void setTotalContas(int totalContas) {
		Conta.totalContas = totalContas;
	}
	
	
}
