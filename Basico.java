package Empresa;

import Empresa.Basico;

public class Basico extends Carro implements Comparable<Basico>{
	
	public Basico() {
		
	}
    public Basico(
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

	@Override
	public int compareTo(Basico o) {
        if (this.getAnoDeFabricacao() < o.getAnoDeFabricacao()) {
            return -1;
        }
        if (this.getAnoDeFabricacao() > o.getAnoDeFabricacao()) {
            return 1;
        }
        return 0;
    }
}

/*class Comparador extends Basico implements Comparable<Basico> {

	 public Comparador(
	    		String nome,
	    		boolean _condicionado, 
	    		int _numPassageiros, 
	    		String _tipoCombustivel, 
	    		double _valorDiaria, 
	    		boolean _SeQuilometragemLivre, 
	    		String _numPlaca, 
	    		int _AnoDeFabricação, 
	    		int _quilometroRodados) {
		    super(
		    		nome,
		    		_condicionado,
		    		_numPassageiros,
		    		_tipoCombustivel,
		    		_valorDiaria,
		    		_SeQuilometragemLivre,
		    		_numPlaca,
		    		_AnoDeFabricação,
		    		_quilometroRodados);
			 }
	 @Override
	public int compareTo(Basico o) {
	    if (this.valorDiaria < o.valorDiaria) {
	       return -1;
	      }
	   if (this.valorDiaria > o.valorDiaria) {
	         return 1;
	           }
	           return 0;
	           }*/
	 /*public Comparador implements Comparable {
	        
		    private int numero;
		    private String titular;
		    // outros metodos e atributos

		    public int compareTo(Basico outraConta) {
		        if (this.numero < outraConta.numero) {
		            return -1;
		        }
		        if (this.numero > outraConta.numero) {
		            return 1;
		        }
		        return 0;
		    }
	 }
    class Basico  extends Carro implements Comparable<Basico> {
		private String nome; 
		private boolean _condicionado;
		private int _numPassageiros; 
		private String _tipoCombustivel;
		private double _valorDiaria;
		private boolean _SeQuilometragemLivre;
		private String _numPlaca;
		private int _AnoDeFabricação; 
		private int _quilometroRodados;
		private boolean condicionado;
		private int numPassageiros;
		private String tipoCombustivel;
		private double valorDiaria;
		private boolean SeQuilometragemLivre;
		private String numPlaca;
		private int AnoDeFabricação;
		private int quilometroRodados; 

        public Basico(
        		String nome, 
        		boolean _condicionado, 
        		int _numPassageiros, 
        		String _tipoCombustivel, 
        		double _valorDiaria, 
        		boolean _SeQuilometragemLivre, 
        		String _numPlaca, 
        		int _AnoDeFabricação, 
        		int _quilometroRodados) 
        {
        	
        	this.nome = nome;
            this.condicionado = _condicionado;
            this.numPassageiros = _numPassageiros;
            this.tipoCombustivel = _tipoCombustivel;
            this.valorDiaria = _valorDiaria;
            this.SeQuilometragemLivre = _SeQuilometragemLivre;
            this.numPlaca = _numPlaca;
            this.AnoDeFabricação = _AnoDeFabricação;
            this.quilometroRodados = _quilometroRodados;
        }

        public int compareTo(Basico o) {
            if (this.getAnoDeFabricação() < o.getAnoDeFabricação()) {
                return -1;
               }
            if (this.getAnoDeFabricação() > o.getAnoDeFabricação()) {
                  return 1;
                    }
                    return 0;
                    }
          }*/


