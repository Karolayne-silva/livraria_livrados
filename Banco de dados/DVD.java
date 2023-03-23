package livraria_livrados;

public class dvd extends Produto {

		private String diretor;
		
		public dvd(int id, double preco, String nome, String descricao, String dataRegistro, int quantidade, String dataLancamento, String genero, String diretor) {
			super(id, preco, nome, descricao, dataRegistro, quantidade, dataLancamento, genero);
			this.diretor = diretor;
			
		}

		public String getDiretor() {
			return diretor;
		}

		public void setDiretor(String diretor) {
			this.diretor = diretor;
		}

		@Override
		public String toString() {
			return "dvd" + super.toString() + "diretor=" + diretor + "]";
		}
		
}
