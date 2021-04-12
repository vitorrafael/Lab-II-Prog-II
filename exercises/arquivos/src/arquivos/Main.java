package arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		Estoque estoque = new Estoque();
		estoque.preencheEstoque("./produtos.txt");
			
		Alimento mostExpensiveFood = null;
		Eletrodomestico cheapestAppliance = null;
		Vestuario[] clothes = new Vestuario[estoque.getProdutos().length];
		int counter = 0;
		for (Produto product : estoque.getProdutos()) {
			if (product instanceof Alimento && (mostExpensiveFood == null || product.getPreco() > mostExpensiveFood.getPreco()))
				mostExpensiveFood = (Alimento) product;
			else if (product instanceof Eletrodomestico && (cheapestAppliance == null || product.getPreco() < cheapestAppliance.getPreco()))
				cheapestAppliance = (Eletrodomestico) product;
			else if (product instanceof Vestuario)
				clothes[counter++] = (Vestuario) product;
		}
		
		File infoFile = new File("./info.txt");
		FileWriter fileWriter = new FileWriter(infoFile);
		PrintWriter printWriter = new PrintWriter(fileWriter);
		
		printWriter.println("Alimento mais caro: " + mostExpensiveFood.getNome());
		printWriter.println("Eletrodoméstico mais barato: " + cheapestAppliance.getNome());
		printWriter.println("Vestuário:");
		for (Vestuario clothing : clothes) {
			if (clothing == null) break;
			printWriter.println(clothing.getNome() + " - " + clothing.getQtdeEstoque());
		}
		printWriter.close();
	}

}
