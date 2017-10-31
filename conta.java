public class conta{
	double numero;
	double saldo;
	double limite;
	cliente titular = new cliente();

	// metodos //

	void deposita(double valor) {
		this.saldo += valor;
	}
	
	boolean saca(double valor) {
		if(this.saldo < valor) {
			System.out.println("Saldo insuficiente");
			return false;
		}
		else {
			this.saldo -= valor;
			return true;
		}
	}
	
	boolean transfere(conta destino, double valor) {
		if (this.saca(valor) == false) {
			return false;
		}
		else {
			destino.deposita(valor);
			return true;
		}
	}
}