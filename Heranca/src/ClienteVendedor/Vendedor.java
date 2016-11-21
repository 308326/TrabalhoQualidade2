package ClienteVendedor;

public class Vendedor extends Pessoa {
	
	private double salarioBase;
	private float comissao;
	
	public Vendedor (int id, String nome, char sexo, double salarioBase, float comissao) {
		super (id, nome, sexo);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}
	
	
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public float getComissao() {
		return comissao;
	}
	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	
	public double calcularSalario (double totalVendas) {
		return salarioBase = salarioBase + comissao / totalVendas;
	}
	
	public void reajustarSalarioBase (float percentual) {
		setSalarioBase (getSalarioBase() + getSalarioBase() * percentual/100);
	}
	
}
