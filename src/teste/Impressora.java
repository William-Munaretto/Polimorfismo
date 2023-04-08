package teste;

public class Impressora implements impressoraInterface {

	@Override
	public void imprimeCabecalho(String empresa) {
		 System.out.println("-------------------------------------------------------------------");
	        if (empresa.equals("USP"))
	            System.out.println("Universidade de São Paulo");
	        else if (empresa.equals("UFRJ"))
	            System.out.println("UFRJ");
		
	}

	@Override
	public void imprimeRodape(String empresa) {
		 System.out.println("-------------------------------------------------------------------");
	        if (empresa.equals("USP"))
	            System.out.println("----------------------- USP -----------------------");
	        else if (empresa.equals("UFRJ"))
	            System.out.println("----------------------- UFRJ ----------------------");
		
	}

}
