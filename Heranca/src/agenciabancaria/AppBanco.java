package agenciabancaria;

public class AppBanco {

	public static void main(String[] args) {
		ContaBancaria c1;
		Poupanca p1;
		
		c1 = new ContaBancaria(1001);
		//c1.setNumero(1001);
		c1.setSaldo(1000);
		
		p1 = new Poupanca(2001, 500);
		//p1.setNumero(2001);
		//p1.setSaldo(500);
		
		c1.depositar(200);
		c1.exibirSaldo();
		
		p1.depositar(500);
		p1.calcularRendimentos(1);
		p1.exibirSaldo();

	}

}
