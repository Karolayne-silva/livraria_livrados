
public class CD extends Produto {

	private String cantor;
	private String produtor;
	
	public CD(int id, double preco, String nome, String descricao, String dataRegistro, int quantidade, String dataLancamento, String genero, String cantor, String produtor) {
		super(id, preco, nome, descricao, dataRegistro, quantidade, dataLancamento, genero);
		this.cantor = cantor;
		this.produtor = produtor;
		
	}

	public String getCantor() {
		return cantor;
	}

	public void setCantor(String cantor) {
		this.cantor = cantor;
	}

	public String getProdutor() {
		return produtor;
	}

	public void setProdutor(String produtor) {
		this.produtor = produtor;
	}

	@Override
	public String toString() {
		return "CD" + super.toString() + "[cantor=" + cantor + ", produtor=" + produtor + "]";
	}
	
	

}
