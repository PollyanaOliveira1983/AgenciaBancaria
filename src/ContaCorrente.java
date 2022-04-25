
public class ContaCorrente extends Conta {

	public ContaCorrente(String nomeCliente, String numeroConta, double saldo) {
		super(nomeCliente, numeroConta, saldo);
		
	}

	@Override
	public void sacar(double valor) {
		
		//if (valor <= this.getSaldo()) {
		//	this.saldo -= valor;
		//}else {
		//	System.out.println("Saldo insuficiente para esse saque!");
		//} 
		///******************** ou faça da forma abaixo***************
		if (valor <= this.getSaldo()) {
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("---------------------------- ");
			System.out.println("Saque realizado com sucesso ");
			System.out.println("Seu no saldo é de: R$ " + this.getSaldo());
		}else {
			System.out.println("Saldo insuficiente para esse saque!");
		}
	}

	@Override
	public void depositar(double valor) {
		
		this.setSaldo(this.getSaldo() + valor);
		
	}

	
}
