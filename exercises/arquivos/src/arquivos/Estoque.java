package arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Estoque {

	private Produto[] produtos = new Produto[100];
	
	public Estoque() {
	}
	
	public Produto[] getProdutos() {
		return produtos;
	}
	
	public void setProdutos(Produto[] produtos) {
		this.produtos = produtos;
	}
	
	public void preencheEstoque(String fileName) throws IOException {
		FileReader fileReader = new FileReader(fileName);
		BufferedReader buffer = new BufferedReader(fileReader);
		buffer.readLine();
		String line = buffer.readLine();
		String[] productDetails;
		int counter = 0;
		while(line != null) {
			productDetails = line.split("\\s\\*\\s");	
			
			String name = productDetails[0];
			String description = productDetails[1];
			double price = Double.parseDouble(productDetails[2]);
			if (productDetails[3].equals("Alimento")) {
				this.produtos[counter++] = new Alimento(name, description, price, productDetails[4]);
			} else if (productDetails[3].equals("Vestuario")) {
				this.produtos[counter++] = new Vestuario(name, description, price, Integer.parseInt(productDetails[4]));
			} else if (productDetails[3].equals("Eletrodomestico")) {
				this.produtos[counter++] = new Eletrodomestico(name, description, price, Double.parseDouble(productDetails[4]));
			}
			line = buffer.readLine();
		}
		
		buffer.close();
	}
}
