package ClienteVendedor;

public class Main {

	public static void main(String[] args) {
		
		
		Cliente cli;
		Vendedor ven;
		
		cli = new Cliente (1, "Victor", 'M', 1200);
		ven = new Vendedor (2, "Reis", 'F', 800, 300);
		
		cli.calcularLimiteCredito();
		
		ven.calcularSalario(200);
		
		ven.reajustarSalarioBase(15);
		System.out.printf("-------------------------------------------------");
		System.out.printf("\n");
		System.out.printf("");
		System.out.printf("SISTEMA BANCARIO---TELA DE CREDITO");
		System.out.printf("\n");
		System.out.printf("-------------------------------------------------");
		System.out.printf("\n");
		System.out.printf("");
		System.out.printf("\nSeu limite de cr�dito �: %.2f \n", cli.calcularLimiteCredito());
		System.out.printf("O sal�rio do Vendedor �: %.2f \n", ven.calcularSalario(2));
		System.out.printf("Reajuste de Sal�rio �: %.2f \n", ven.getSalarioBase());
		System.out.printf("Nome funcionario: "+ ven.getNome());
		System.out.printf("\n");
		System.out.printf("Nome do cliente: "+ cli.getNome());
		System.out.printf("\n");
		System.out.printf("-------------------------------------------------");
		

	}

}
