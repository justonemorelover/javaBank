package javaBank;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
	
	public void saca(double valor) {
		
		double taxa = valor * 0.02;
		
		if(super.getSaldo() < valor + taxa) {
			System.out.println("Saldo Insuficiente");
		} else {
			super.saca(valor + taxa);
		}
	}

}
