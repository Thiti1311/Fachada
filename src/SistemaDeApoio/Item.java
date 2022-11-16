package SistemaDeApoio;

public class Item {

	private float preco;
	private String nome;
	private String descricao;
	
	public Item(float preco, String nome) {
		this.preco = preco;
		this.nome = nome;
	}
	
	public Item(float preco, String nome, String descricao) {
		this.preco = preco;
		this.nome = nome;
		this.descricao = descricao;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
	return "Descrição do produto: " + "\nNome: " + nome + "\nPreço: " + preco + "Descrição: " + descricao;
	}
	
}
