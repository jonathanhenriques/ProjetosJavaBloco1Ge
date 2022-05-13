package listadepoo2.collections;

public class Item {
	private String nome;
	private double preco;
	
	public Item(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double valor) {
		this.preco = valor;
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("nome: " + this.nome);
		sb.append(" || preco: " + this.preco);
		return sb.toString();
	}
}
