package Empresa;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Carro implements Comparable<Carro>, Avaliavel, Arrumavel{
	
	protected TIPO tipo;
	protected String nom;
    protected boolean condicionado;
    protected int numPassageiros;
    protected String tipoCombustivel;
    protected double valorDiaria;
    protected boolean SeQuilometragemLivre;
    protected String numPlaca;
    protected int AnoDeFabricacao;
    protected int quilometroRodados;
 
    public Carro() {
    }
 
    public Carro(
    		TIPO tipo, 
    		String nom,
    		boolean _condicionado, 
    		int _numPassageiros, 
    		String _tipoCombustivel, 
    		double _valorDiaria, 
    		boolean _SeQuilometragemLivre, 
    		String _numPlaca, 
    		int _AnoDeFabricacao, 
    		int _quilometroRodados) 
    {
    	
    	this.tipo = tipo;
    	this.nom = nom;
        this.condicionado = _condicionado;
        this.numPassageiros = _numPassageiros;
        this.tipoCombustivel = _tipoCombustivel;
        this.valorDiaria = _valorDiaria;
        this.SeQuilometragemLivre = _SeQuilometragemLivre;
        this.numPlaca = _numPlaca;
        this.AnoDeFabricacao = _AnoDeFabricacao;
        this.quilometroRodados = _quilometroRodados;
        
    }
	public TIPO getTipo() {
		return tipo;
	}

	public void setTipo(TIPO tipo) {
		this.tipo = tipo;
	}
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
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

	@Override
	public int compareTo(Carro o) {
        if (this.getAnoDeFabricacao() < o.getAnoDeFabricacao()) {
            return -1;
        }
        if (this.getAnoDeFabricacao() > o.getAnoDeFabricacao()) {
            return 1;
        }
        return 0;
    }

	@Override
	public int getNota(int n) {

		return n;
	}
	
	@Override
	public String dataHora() {

		Date data = new Date();
		SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat formatarHora = new SimpleDateFormat("H:m:s");
		String dataFormatada = formatarData.format(data);
		String horaFormatada = formatarHora.format(data);
		

		return "A data atual e horas são: "+ dataFormatada + " as " + horaFormatada;
	}

}
