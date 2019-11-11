package Empresa;

public class Hospedagem {

    protected double valorDiaria;
    protected int tempoMinimoDeHospedagem;
    protected boolean cafeDaManha;
    protected double HchackIn;
    protected double HchackOut;
    protected boolean permiteCancelarGratis;
    protected String idiomasFalados;
    protected int avaliaçãoUsuario;
    protected String nome;
 
    public Hospedagem() {
    }
 
    public Hospedagem(
    		String nome, 
    		double _valorDiaria, 
    		int _tempoMinimoDeHospedagem, 
    		boolean _cafeDaManha,
    		double _HchackIn, 
    		double _HchackOut, 
    		boolean _permiteCancelarGratis,
    		String _idiomasFalados, 
    		int _avaliaçãoUsuario) 
    {
    	
        this.nome = nome;
    	this.valorDiaria = _valorDiaria;
        this.tempoMinimoDeHospedagem = _tempoMinimoDeHospedagem;
        this.cafeDaManha = _cafeDaManha;
        this.HchackIn = _HchackIn;
        this.HchackOut = _HchackOut;
        this.permiteCancelarGratis = _permiteCancelarGratis;
        this.idiomasFalados = _idiomasFalados;
        this.avaliaçãoUsuario = _avaliaçãoUsuario;
        
    }
    public String getNome() {
    	return nome;
    }
    
    public void setNome(String nome) {
    	this.nome = nome;
    }

	public double getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(float valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public int getTempoMinimoDeHospedagem() {
		return tempoMinimoDeHospedagem;
	}

	public void setTempoMinimoDeHospedagem(int tempoMinimoDeHospedagem) {
		this.tempoMinimoDeHospedagem = tempoMinimoDeHospedagem;
	}

	public boolean isCafeDaManha() {
		return cafeDaManha;
	}

	public void setCafeDaManha(boolean cafeDaManha) {
		this.cafeDaManha = cafeDaManha;
	}

	public double getHchackIn() {
		return HchackIn;
	}

	public void setHchackIn(float hchackIn) {
		HchackIn = hchackIn;
	}

	public double getHchackOut() {
		return HchackOut;
	}

	public void setHchackOut(float hchackOut) {
		HchackOut = hchackOut;
	}

	public boolean isPermiteCancelarGratis() {
		return permiteCancelarGratis;
	}

	public void setPermiteCancelarGratis(boolean permiteCancelarGratis) {
		this.permiteCancelarGratis = permiteCancelarGratis;
	}

	public String getIdiomasFalados() {
		return idiomasFalados;
	}

	public void setIdiomasFalados(String idiomasFalados) {
		this.idiomasFalados = idiomasFalados;
	}

	public int getAvaliaçãoUsuario() {
		return avaliaçãoUsuario;
	}

	public void setAvaliaçãoUsuario(int avaliaçãoUsuario) {
		this.avaliaçãoUsuario = avaliaçãoUsuario;
	}
	
}
