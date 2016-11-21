package agenciabancaria;

public class Poupanca extends ContaBancaria {

		public Poupanca (int numero) {
			//Chama o construtor ContaBancaria(int) da superclasse
			super(numero);
		}
		
		public Poupanca (int numero, double saldo) {
			super(numero, saldo);
		}
		
		public void calcularRendimentos (double percentual) {
		setSaldo( getSaldo() + getSaldo() * percentual / 100); //J� foi quest�o de prova
		//saldo = saldo + saldo * percentual / 100; ^ A linha de cima era dessa forma que est� aqui, mas por causa do private em ContaBancaria, tem que mudar a forma que est� a cima, se usar o protected, o programa fica vuner�vel
	}

}


//Construtor diferente do padr�o deve-se declarar na classe filha (Poupanca) e implementa-l� na padr�o
// Por�m na classe filha tem q usar a palavra "SUPER" Exemplo: super (numero);
