package DTO;

public abstract class Produto {

	private int id;
	private double preco;
	private String nome;
	private String descricao;
	private String dataRegistro;
	private int quantidade;
	private String dataLancamento;
	private String genero;

	public Produto(int id, double preco, String nome, String descricao, String dataRegistro, int quantidade, String dataLancamento, String genero){
	       this.id = id;
	       this.preco = preco;
	       this.nome = nome;
	       this.descricao = descricao;
	       this.dataRegistro = dataRegistro;
	       this.quantidade = quantidade;
	       this.dataLancamento = dataLancamento;
	       this.genero = genero;
	  }


	
	

	
	public String descricao() {
		return "Produto [id=" + id + ", preco=" + preco + ", nome=" + nome + ", descricao=" + descricao
				+ ", dataRegistro=" + dataRegistro + ", quantidade=" + quantidade + ", dataLancamento=" + dataLancamento
				+ ", disponivel=" + disponivel + ", genero=" + genero + "]";
	}





	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
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


	public String getDataRegistro() {
		return dataRegistro;
	}


	public void setDataRegistro(String dataRegistro) {
		this.dataRegistro = dataRegistro;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public String getDataLancamento() {
		return dataLancamento;
	}


	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}



	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	
	

}
