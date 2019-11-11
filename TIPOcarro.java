package Empresa;

public enum TIPO {
	BASICO("basico"),
	COMUM("comum"),
	EXECUTIVO("executivo"),
	LUXO("luxo");
	
	private String nome;
	
	TIPO(String nome){
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
}
