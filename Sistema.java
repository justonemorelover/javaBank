package javaBank;

public class Sistema {
	public static void main(String[] args) {
		
		//CRIA CLIENTE		
		Cliente fulano = new Cliente("Fulano", "12345678900", "Mecanic");
		System.out.println(fulano.getNome());
		System.out.println(fulano.getCpf());
		System.out.println(fulano.getProfissao());
		
		System.out.println("");
		
		
		//CRIA CAIXA
		Caixa ciclana = new Caixa("Ciclana", "12312312345", 1800.00);
		ciclana.setSenha(1111);
		
		System.out.println(ciclana.getNome());
		System.out.println(ciclana.getCpf());
		System.out.println(ciclana.getSalario());
		System.out.println(ciclana.getBonificacao());
		
		ciclana.autentica(1112);
		System.out.println();
		
		//CRIA GERENTE
		Gerente roberto = new Gerente("Roberto", "11122233344", 3000.0);
		roberto.setSenha(1234);
		
		System.out.println(roberto.getNome());
		System.out.println(roberto.getCpf());
		System.out.println(roberto.getSalario());
		System.out.println(roberto.getBonificacao());
		
		roberto.autentica(1234);
		System.out.println("");
		
		//CRIA DIRETOR 
		Diretor joao = new Diretor("João", "12312312333", 5000.0);
		joao.setSenha(4321);
		
		System.out.println(joao.getNome());
		System.out.println(joao.getCpf());
		System.out.println(joao.getSalario());
		System.out.println(joao.getBonificacao());
		
		joao.autentica(4321);
		System.out.println("");
		
		//CRIA CONTA CORRENTE
		ContaCorrente cc = new ContaCorrente(1230, 3030);
		cc.setTitular(fulano);
		cc.deposita(3000.0);
		System.out.println(cc.getSaldo());
		System.out.println("");
		
		//CRIA CONTA POUPANCA
		ContaPoupanca cp = new ContaPoupanca(1230, 3031);
		cp.setTitular(fulano);
		cp.deposita(1000);
		System.out.println(cp.getSaldo());
		System.out.println("");
		
		cc.transfere(500, cp);
		System.out.println("Saldo atual conta corrente: " + cc.getSaldo());
		System.out.println("Saldo Atual conta poupanca: " + cp.getSaldo());
		System.out.println("");
		
		cc.saca(2600);
		cp.saca(200);
		System.out.println("Saldo atual conta corrente: " + cc.getSaldo());
		System.out.println("Saldo Atual conta poupanca: " + cp.getSaldo());
		System.out.println("");
		
		cc.saca(200);
		cp.saca(2000);
		System.out.println("Saldo atual conta corrente: " + cc.getSaldo());
		System.out.println("Saldo Atual conta poupanca: " + cp.getSaldo());
		System.out.println("");
		
		System.out.println("Total de Contas: " + Conta.getTotalContas());
		
		
		
	}

}
