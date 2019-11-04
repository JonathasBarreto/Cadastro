package Empresa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Aplicacao {
	 
    public static void main(String[] args){
    	Scanner entrada = new Scanner(System.in);
    	Basico bas1, bas2, bas3;
    	//hospedagens
        Albergues alb1 = new Albergues();
        Aluguel alu1 = new Aluguel();
        Hoteis hot1 = new Hoteis();
        Pousadas pou1 = new Pousadas();
        //carros
        bas1 = new Basico("gg1", true, 12, "gg1", 12.99, true, "ggp23", 1200, 12);
        bas2 = new Basico("gg2", true, 16, "gg2", 12.99, true, "ggp23", 199, 16);
        bas3 = new Basico("gg3", true, 14, "gg3", 12.99, true, "ggp23", 300, 14);
        Comum com1 = new Comum("gg1", true, 13, "gg", 12.99, true, "ggp23", 12, 15);
        Comum com2 = new Comum("gg2", true, 13, "gg", 12.99, true, "ggp23", 12, 15);
        Comum com3 = new Comum("gg3", true, 13, "gg", 12.99, true, "ggp23", 12, 15);
        Luxo lux1 = new Luxo();
        Executivo exec1 = new Executivo();
        
        //devo passar o array list como parametro para os construtores?
        ArrayList<Albergues> albergues = new ArrayList<Albergues>();
        ArrayList<Aluguel> aluguel = new ArrayList<Aluguel>();
        ArrayList<Hoteis> hoteis = new ArrayList<Hoteis>();
        ArrayList<Pousadas> pousadas = new ArrayList<Pousadas>();
        ArrayList<Basico> basico = new ArrayList<Basico>();
        ArrayList<Comum> comum = new ArrayList<Comum>();
        ArrayList<Executivo> executivo = new ArrayList<Executivo>();
        ArrayList<Luxo> luxo = new ArrayList<Luxo>();
        comum.add(com1);
        comum.add(com2);
        comum.add(com3);
        basico.add(bas1);
        basico.add(bas2);
        basico.add(bas3);
        
        System.out.println(basico);      
        Collections.sort(basico); ////ERRO AQ
        System.out.println(basico);
		//Collections.sort(basico);
        
        //Listar l = new Listar();
        //basico.forEach(l);
        /*int confirm = 1;
        do {
	        int i = 0;
	        for(Basico b : basico) {
	        	i++;
	        	System.out.print("("+i+") ");
	        	System.out.println(b.getnome());
	        	
	        }

        	System.out.println("Informe o numero referente ao carro desejado:");
        	int x = entrada.nextInt();
        	Basico p = (Basico)basico.get(x - 1);
	        System.out.printf("%s, %b, %d, %s, %2f, %b, %s, %d, %d \n\n",
	        		p.getnome(),//String
	        		p.isCondicionado(),//boolean
	        		p.getNumPassageiros(),//int
	        		p.getTipoCombustivel(),//string
	        		p.getValorDiaria(),//double
	        		p.isSeQuilometragemLivre(),//boolean
	        		p.getNumPlaca(),//string
	        		p.getAnoDeFabricação(),//int
	        		p.getQuilometroRodados()//int
	        		);
	        System.out.println("Deseja alugar o veiculo digite 1 caso não deseje?");
	        confirm = entrada.nextInt();
        }while(confirm != 1);
        	System.out.println("Sucesso");*/
        //if(basico.forEach(l).equalsIgnoreCase("gg1")) {
        	
        //}
        //ArrayList<Comum> comum = new ArrayList<Comum>();
        //ArrayList<Luxo> luxo = new ArrayList<Luxo>();
        //ArrayList<Executivo> executivo = new ArrayList<Executivo>();
        
        System.out.println("Menu");
        System.out.println("Qual tipo de serviço vc deseja?");
        System.out.println("1 - Carros");
        System.out.println("2 - Hospedagem");
        System.out.println("3 - Sair");
        System.out.println("Opção: ");
 
        int opcao = entrada.nextInt();
 
        switch(opcao){
            case 1:
            	
                System.out.println("Qual tipo de veículo deseja cadastrar?:");
                System.out.println("1 - Básico");
                System.out.println("2 - Comum");
                System.out.println("3 - Executivo");
                System.out.println("4 - Luxo");
                System.out.println("5 - Sair");
                System.out.println("Opção: ");
         
                int opcao2 = entrada.nextInt();
         
                switch(opcao2){
                    case 1:
                        int confirm = 1;
                        do {
                	        int i = 0;
                	        for(Basico b : basico) {
                	        	i++;
                	        	System.out.print("("+i+") ");
                	        	System.out.println(b.getnome());
                	        	
                	        }

                        	System.out.println("Informe o numero referente ao carro desejado:");
                        	int x = entrada.nextInt();
                        	Basico p = (Basico)basico.get(x - 1);
                	        System.out.printf("%s, %b, %d, %s, %2f, %b, %s, %d, %d \n\n",
                	        		p.getnome(),//String
                	        		p.isCondicionado(),//boolean
                	        		p.getNumPassageiros(),//int
                	        		p.getTipoCombustivel(),//string
                	        		p.getValorDiaria(),//double
                	        		p.isSeQuilometragemLivre(),//boolean
                	        		p.getNumPlaca(),//string
                	        		p.getAnoDeFabricação(),//int
                	        		p.getQuilometroRodados()//int
                	        		);
                	        System.out.println("Se deseja alugar o veiculo digite 1 caso não deseje,"
                	        		+ " aperte qualquer outra tecla para voltar a tela de seleção!");
                	        confirm = entrada.nextInt();
                        }while(confirm != 1);
                        	System.out.println("Parabens!! Aluguel efetuado com sucesso. ");
                    break;
                    case 2:
                        int confirm2 = 1;
                        do {
                	        int i = 0;
                	        for(Comum c : comum) {
                	        	i++;
                	        	System.out.print("("+i+") ");
                	        	System.out.println(c.getnome());
                	        	
                	        }

                        	System.out.println("Informe o numero referente ao carro desejado:");
                        	int x = entrada.nextInt();
                        	Comum p = (Comum)comum.get(x - 1);
                	        System.out.printf("%s, %b, %d, %s, %2f, %b, %s, %d, %d \n\n",
                	        		p.getnome(),//String
                	        		p.isCondicionado(),//boolean
                	        		p.getNumPassageiros(),//int
                	        		p.getTipoCombustivel(),//string
                	        		p.getValorDiaria(),//double
                	        		p.isSeQuilometragemLivre(),//boolean
                	        		p.getNumPlaca(),//string
                	        		p.getAnoDeFabricação(),//int
                	        		p.getQuilometroRodados()//int
                	        		);
                	        System.out.println("Se deseja alugar o veiculo digite 1 caso não deseje,"
                	        		+ " aperte qualquer outra tecla para voltar a tela de seleção!");
                	        confirm2 = entrada.nextInt();
                        }while(confirm2 != 1);
                        	System.out.println("Parabens!! Aluguel efetuado com sucesso. ");
                    break;
                    case 3:
                        int confirm3 = 1;
                        do {
                	        int i = 0;
                	        for(Executivo e : executivo) {
                	        	i++;
                	        	System.out.print("("+i+") ");
                	        	System.out.println(e.getnome());
                	        	
                	        }

                        	System.out.println("Informe o numero referente ao carro desejado:");
                        	int x = entrada.nextInt();
                        	Executivo p = (Executivo)executivo.get(x - 1);
                	        System.out.printf("%s, %b, %d, %s, %2f, %b, %s, %d, %d \n\n",
                	        		p.getnome(),//String
                	        		p.isCondicionado(),//boolean
                	        		p.getNumPassageiros(),//int
                	        		p.getTipoCombustivel(),//string
                	        		p.getValorDiaria(),//double
                	        		p.isSeQuilometragemLivre(),//boolean
                	        		p.getNumPlaca(),//string
                	        		p.getAnoDeFabricação(),//int
                	        		p.getQuilometroRodados()//int
                	        		);
                	        System.out.println("Se deseja alugar o veiculo digite 1 caso não deseje,"
                	        		+ " aperte qualquer outra tecla para voltar a tela de seleção!");
                	        confirm3 = entrada.nextInt();
                        }while(confirm3 != 1);
                        	System.out.println("Parabens!! Aluguel efetuado com sucesso. ");
                    break;
                    case 4:
                        int confirm4 = 1;
                        do {
                	        int i = 0;
                	        for(Luxo l : luxo) {
                	        	i++;
                	        	System.out.print("("+i+") ");
                	        	System.out.println(l.getnome());
                	        	
                	        }

                        	System.out.println("Informe o numero referente ao carro desejado:");
                        	int x = entrada.nextInt();
                        	Luxo p = (Luxo)luxo.get(x - 1);
                	        System.out.printf("%s, %b, %d, %s, %2f, %b, %s, %d, %d \n\n",
                	        		p.getnome(),//String
                	        		p.isCondicionado(),//boolean
                	        		p.getNumPassageiros(),//int
                	        		p.getTipoCombustivel(),//string
                	        		p.getValorDiaria(),//double
                	        		p.isSeQuilometragemLivre(),//boolean
                	        		p.getNumPlaca(),//string
                	        		p.getAnoDeFabricação(),//int
                	        		p.getQuilometroRodados()//int
                	        		);
                	        System.out.println("Se deseja alugar o veiculo digite 1 caso não deseje,"
                	        		+ " aperte qualquer outra tecla para voltar a tela de seleção!");
                	        confirm4 = entrada.nextInt();
                        }while(confirm4 != 1);
                        	System.out.println("Parabens!! Aluguel efetuado com sucesso. ");
                    break;
                    case 5:
                        System.out.println("Até Logo...");
                    break;
                    default:
                        System.out.println("Por favor, digite uma opção válida");
                    break;
                }
            break;
            case 2:

                System.out.println("Qual tipo de Hospedagem deseja cadastrar?:");
                System.out.println("1 - Hóteis");
                System.out.println("2 - Pousadas");
                System.out.println("3 - Aluguel de casas ou\r\n" + 
                		"apartamentos");
                System.out.println("4 - Albergues");
                System.out.println("5 - Sair");
                System.out.println("Opção: ");
         
                int opcao3 = entrada.nextInt();
         
                switch(opcao3){
                    case 1:
                        int confirm5 = 1;
                        do {
                	        int i = 0;
                	        for(Hoteis h : hoteis) {
                	        	i++;
                	        	System.out.print("("+i+") ");
                	        	System.out.println(h.getNome());
                	        	
                	        }

                        	System.out.println("Informe o numero referente ao carro desejado:");
                        	int x = entrada.nextInt();
                        	Hoteis p = (Hoteis)hoteis.get(x - 1);
                	        System.out.printf("%s, %2f, %d, %b, %2f, %2f, %b, %s, %d, %b, %d \n\n",
                	        		p.getNome(),//String
                	        		p.getValorDiaria(),//double
                	        		p.getTempoMinimoDeHospedagem(),//int
                	        		p.isCafeDaManha(),//boolean
                	        		p.getHchackIn(),//double
                	        		p.getHchackOut(),//double
                	        		p.isPermiteCancelarGratis(),//boolean
                	        		p.getIdiomasFalados(),//String
                	        		p.getAvaliaçãoUsuario(),//int
                	        		p.isTranslados(),//boolean
                	        		p.getnEstrelas()//int
                	        		);

                	        System.out.println("Se deseja alugar a hospedagem digite 1 caso não deseje,"
                	        		+ " aperte qualquer outra tecla para voltar a tela de seleção!");
                	        confirm5 = entrada.nextInt();
                        }while(confirm5 != 1);
                        	System.out.println("Parabens!! Aluguel efetuado com sucesso. ");
                    break;
                    case 2:
                        int confirm6 = 1;
                        do {
                	        int i = 0;
                	        for(Pousadas p : pousadas) {
                	        	i++;
                	        	System.out.print("("+i+") ");
                	        	System.out.println(p.getNome());
                	        	
                	        }

                        	System.out.println("Informe o numero referente ao carro desejado:");
                        	int x = entrada.nextInt();
                        	Pousadas p = (Pousadas)pousadas.get(x - 1);
                	        System.out.printf("%s, %2f, %d, %b, %2f, %2f, %b, %s, %d, %b \n\n",
                	        		p.getNome(),//String
                	        		p.getValorDiaria(),//double
                	        		p.getTempoMinimoDeHospedagem(),//int
                	        		p.isCafeDaManha(),//boolean
                	        		p.getHchackIn(),//double
                	        		p.getHchackOut(),//double
                	        		p.isPermiteCancelarGratis(),//boolean
                	        		p.getIdiomasFalados(),//String
                	        		p.getAvaliaçãoUsuario(),//int
                	        		p.isTranslados()//boolean
                	        		);

                	        System.out.println("Se deseja alugar a hospedagem digite 1 caso não deseje,"
                	        		+ " aperte qualquer outra tecla para voltar a tela de seleção!");
                	        confirm6 = entrada.nextInt();
                        }while(confirm6 != 1);
                        	System.out.println("Parabens!! Aluguel efetuado com sucesso. ");
                    break;
                    case 3:
                        int confirm7 = 1;
                        do {
                	        int i = 0;
                	        for(Aluguel a : aluguel) {
                	        	i++;
                	        	System.out.print("("+i+") ");
                	        	System.out.println(a.getNome());
                	        	
                	        }

                        	System.out.println("Informe o numero referente ao carro desejado:");
                        	int x = entrada.nextInt();
                        	Aluguel p = (Aluguel)aluguel.get(x - 1);
                	        System.out.printf("%s, %2f, %d, %b, %2f, %2f, %b, %s, %d, %b, %d \n\n",
                	        		p.getNome(),//String
                	        		p.getValorDiaria(),//double
                	        		p.getTempoMinimoDeHospedagem(),//int
                	        		p.isCafeDaManha(),//boolean
                	        		p.getHchackIn(),//double
                	        		p.getHchackOut(),//double
                	        		p.isPermiteCancelarGratis(),//boolean
                	        		p.getIdiomasFalados(),//String
                	        		p.getAvaliaçãoUsuario(),//int
                	        		p.isSeCozinha(),//boolean
                	        		p.getQuartos()//int
                	        		);

                	        System.out.println("Se deseja alugar a hospedagem digite 1 caso não deseje,"
                	        		+ " aperte qualquer outra tecla para voltar a tela de seleção!");
                	        confirm7 = entrada.nextInt();
                        }while(confirm7 != 1);
                        	System.out.println("Parabens!! Aluguel efetuado com sucesso. ");
                    break;
                    case 4:
                        int confirm8 = 1;
                        do {
                	        int i = 0;
                	        for(Albergues al : albergues) {
                	        	i++;
                	        	System.out.print("("+i+") ");
                	        	System.out.println(al.getNome());
                	        	
                	        }

                        	System.out.println("Informe o numero referente ao carro desejado:");
                        	int x = entrada.nextInt();
                        	Albergues p = (Albergues)albergues.get(x - 1);
                	        System.out.printf("%s, %2f, %d, %b, %2f, %2f, %b, %s, %d, %d \n\n",
                	        		p.getNome(),//String
                	        		p.getValorDiaria(),//double
                	        		p.getTempoMinimoDeHospedagem(),//int
                	        		p.isCafeDaManha(),//boolean
                	        		p.getHchackIn(),//double
                	        		p.getHchackOut(),//double
                	        		p.isPermiteCancelarGratis(),//boolean
                	        		p.getIdiomasFalados(),//String
                	        		p.getAvaliaçãoUsuario(),//int
                	        		p.getQuantMaxHospedesPorQuarto()//int
                	        		);

                	        System.out.println("Se deseja alugar a hospedagem digite 1 caso não deseje,"
                	        		+ " aperte qualquer outra tecla para voltar a tela de seleção!");
                	        confirm8 = entrada.nextInt();
                        }while(confirm8 != 1);
                        	System.out.println("Parabens!! Aluguel efetuado com sucesso. ");
                    break;
                    case 5:
                        System.out.println("Até Logo...");
                    break;
                    default:
                        System.out.println("Por favor, digite uma opção válida");
                    break;
                }
            break;
            case 3:
                System.out.println("Até Logo...");
            break;
            default:
                System.out.println("Por favor, digite uma opção válida");
            break;
        }
 
    } 
 

}
