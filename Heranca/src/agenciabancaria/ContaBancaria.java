package agenciabancaria;

public class ContaBancaria {
	private int numero;
	private double saldo;
	
	
	/* Dois construtores diferentes do padr�o \/ 
	 * Os construtores padr�es s�o autom�ticos quando vc cria um arquivo, n existem no c�digo */
	
	public ContaBancaria (int numero) {
		this.numero = numero;
	}
	
	public ContaBancaria (int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}

	
	// */

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar (double valor) {
		saldo += valor;  //saldo = saldo + valor
	}
	
	public void retirar (double valor) {
		if (saldo >= valor)
			saldo -= valor; // saldo = saldo - valor
		else
			System.out.printf("Saldo Insuficiente!");
	}
	
	public void exibirSaldo () {
		System.out.printf("Saldo = %.2f \n", saldo);
	}
}
