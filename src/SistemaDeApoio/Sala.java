package SistemaDeApoio;

public class Sala {
	
	private int num;
	private String descricao;
	private TiposDeSalas tipo = TiposDeSalas.AULA;

	public Sala (int num) {
		this.num = num;
	}
	
	public Sala (int num, TiposDeSalas tipo) {
		this.num = num;
		this.tipo = tipo;
	}
	
	public Sala (int num, TiposDeSalas tipo, String descricao) {
		this.num = num;
		this.tipo = tipo;
		this.descricao = descricao;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public TiposDeSalas isTipo() {
		return tipo;
	}
	
	public void setTipo(TiposDeSalas tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "Tipo de sala: " + tipo.getTipo() + "\nNúmero: " + num + "Descrição: " + descricao;
	}
}
