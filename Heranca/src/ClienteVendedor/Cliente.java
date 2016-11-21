package ClienteVendedor;

public class Cliente extends Pessoa {
	
	private double RendaMensal;
	
	public Cliente (int id, String nome, char sexo, double RendaMensal) {
		super (id, nome, sexo);
		this.RendaMensal = RendaMensal;
	}
	
	
	public double getRendaMensal() {
		return RendaMensal;
	}

	public void setRendaMensal(double rendaMensal) {
		RendaMensal = rendaMensal;
	}

	public double calcularLimiteCredito() {
		return RendaMensal += RendaMensal * 0.3;
	}

	
}
