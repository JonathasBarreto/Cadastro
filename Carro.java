package Empresa;
 
public class Carro {
 
    protected boolean condicionado;
    protected int numPassageiros;
    protected String tipoCombustivel;
    protected double valorDiaria;
    protected boolean SeQuilometragemLivre;
    protected String numPlaca;
    protected int AnoDeFabricacao;
    protected int quilometroRodados;
    protected String nome;
 
    public Carro() {
    }
 
    public Carro(
    		String nome, 
    		boolean _condicionado, 
    		int _numPassageiros, 
    		String _tipoCombustivel, 
    		double _valorDiaria, 
    		boolean _SeQuilometragemLivre, 
    		String _numPlaca, 
    		int _AnoDeFabricacao, 
    		int _quilometroRodados) 
    {
    	
    	this.nome = nome;
        this.condicionado = _condicionado;
        this.numPassageiros = _numPassageiros;
        this.tipoCombustivel = _tipoCombustivel;
        this.valorDiaria = _valorDiaria;
        this.SeQuilometragemLivre = _SeQuilometragemLivre;
        this.numPlaca = _numPlaca;
        this.AnoDeFabricacao = _AnoDeFabricacao;
        this.quilometroRodados = _quilometroRodados;
    }
	public String getnome() {
		return nome;
	}

	public void setnome(String nome) {
		this.nome = nome;
	}

	public boolean isCondicionado() {
		return condicionado;
	}

	public void setCondicionado(boolean condicionado) {
		this.condicionado = condicionado;
	}

	public int getNumPassageiros() {
		return numPassageiros;
	}

	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public double getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public boolean isSeQuilometragemLivre() {
		return SeQuilometragemLivre;
	}

	public void setSeQuilometragemLivre(boolean seQuilometragemLivre) {
		SeQuilometragemLivre = seQuilometragemLivre;
	}

	public String getNumPlaca() {
		return numPlaca;
	}

	public void setNumPlaca(String numPlaca) {
		this.numPlaca = numPlaca;
	}

	public int getAnoDeFabricacao() {
		return AnoDeFabricacao;
	}

	public void setAnoDeFabricacao(int AnoDeFabricacao) {
		this.AnoDeFabricacao = AnoDeFabricacao;
	}

	public int getQuilometroRodados() {
		return quilometroRodados;
	}

	public void setQuilometroRodados(int quilometroRodados) {
		this.quilometroRodados = quilometroRodados;
	}

}
