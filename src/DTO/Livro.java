package DTO;

public class livro extends Produto {

		private String isbn13;
		private String autor;
		private String editora;
		private String sinopse;
		
		public livro(int id, double preco, String nome, String descricao, String dataRegistro, int quantidade, String dataLancamento, String genero, String isbn13, String autor, String editora, String sinopse) {
			super(id, preco, nome, descricao, dataRegistro, quantidade, dataLancamento, genero);
			this.isbn13 = isbn13;
			this.autor = autor;
			this.editora = editora;
			this.sinopse = sinopse;
			
		}

		public String getIsbn13() {
			return isbn13;
		}

		public void setIsbn13(String isbn13) {
			this.isbn13 = isbn13;
		}

		
		
		public String getAutor() {
			return autor;
		}

		public void setAutor(String autor) {
			this.autor = autor;
		}
		
		
		
		public String getEditora() {
			return editora;
		}

		public void setEditora(String editora) {
			this.editora = editora;
		}
		
		
		
		
		public String getSinopse() {
			return sinopse;
		}

		public void setSinopse(String sinopse) {
			this.sinopse = sinopse;
		}

		@Override
		public String toString() {
			return "livro" + super.toString() + "isbn13=" + isbn13 + ", autor=" + autor + ", editora=" + editora + ", sinopse=" + sinopse + "]";
		}
		
		public void cadastrar() {
			
		}
		public void alterar() {
			
		}
		public void deletar() {
			
		}
		public void buscar() {
			
		}

	}
