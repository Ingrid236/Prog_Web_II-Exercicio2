package modelo;

import anotacao.Campo;

public class Pessoa extends SuperTabela<Integer>{
	@Campo(colunaNome="super_ID",isPk=true, isObrigatorio=true)
	private Integer id;
	@Campo(colunaNome="txt_nome",isObrigatorio=true)
	private String nome;

	private Boolean transienteSave;


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Boolean getTransienteSave() {
		return transienteSave;
	}

	public void setTransienteSave(Boolean transienteSave) {
		this.transienteSave = transienteSave;
	}

}

