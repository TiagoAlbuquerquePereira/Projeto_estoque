package objeto;

public class Produto {

	private int id_Produto;
	private String name;
	private double preco;
	private int quantidade_em_estoque;

	public Produto(int id_Produto, String name, double preco, int quantidade_em_estoque) {
		super();
		this.name = name;
		this.preco = preco;
		this.quantidade_em_estoque = quantidade_em_estoque;
		this.id_Produto = id_Produto;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade_em_estoque() {
		return quantidade_em_estoque;
	}

	public void setQuantidade_em_estoque(int quantidade_em_estoque) {
		this.quantidade_em_estoque = quantidade_em_estoque;
	}

	public int getId_Produto() {
		return id_Produto;
	}

	public void setId_Produto(int id_Produto) {
		this.id_Produto = id_Produto;
	}

	public void adicionarEstque(int quantidade_adc) {
		this.quantidade_em_estoque += quantidade_adc;
	}

	public void subtrairEstque(int quantidade) {
		this.quantidade_em_estoque -= quantidade;
	}

	@Override
	public String toString() {
		return "Informações do produto [ID: " + id_Produto + " Nome: " + name + ", Preco: " + preco + ", Quantidade: "
				+ quantidade_em_estoque + "]";
	}

}
