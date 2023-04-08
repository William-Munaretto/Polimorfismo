package teste;

public class App {

	public static void main(String[] args) {
		Impressora impressora1 = new Impressora();
		String cabecalhouUsp = "USP";
		String cabecalhoUfrj = "UFRJ";
		impressora1.imprimeCabecalho(cabecalhouUsp);
		impressora1.imprimeCabecalho(cabecalhoUfrj);

	}

}
