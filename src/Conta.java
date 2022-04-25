
public abstract class Conta implements ContaInterface {
// modificador de acesso abstract proibe que a classe seja instanciada	
// normalmente utilizamos esse modificador de acesso em superclasses	
	
	private String nomeCliente;
	private String numeroConta;
	protected double saldo;
	
	public Conta(String nomeCliente, String numeroConta, double saldo) {
		super();
		this.nomeCliente = nomeCliente;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	
	public void mostrarDados() {
		System.out.println("------------------------------------");
		System.out.println("Nome do correntista: " + this.nomeCliente);
		System.out.println("Número da conta: " + this.numeroConta);
		System.out.println("Saldo da Conta: " + this.saldo);
		
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
