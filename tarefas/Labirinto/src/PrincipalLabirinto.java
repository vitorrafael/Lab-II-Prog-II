import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrincipalLabirinto {

	public static void main(String[] args) {
		Labirinto labirinto = new Labirinto();

		try {
			boolean foundExit = labirinto.labirinto();
			writeOutputFile(foundExit);
		} catch (IOException e) {
			System.out.println("IOException: Erro ao acessar arquivos do sistema");
		}
	}

	private static void writeOutputFile(boolean foundExit) throws IOException {
		String output = foundExit ? "Existe um caminho para o labirinto" : "Não existe um caminho para o labirinto";
		String outputFileName = "saidaLabirinto.txt";

		File outputFile = new File(outputFileName);

		if (!outputFile.exists())
			outputFile.createNewFile();

		FileWriter fileWriter = new FileWriter(outputFile);
		PrintWriter printWriter = new PrintWriter(fileWriter);

		printWriter.println(output);
		printWriter.close();
	}
}
