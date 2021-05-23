package br.inatel.cdg.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import br.inatel.cdg.funcionario.Funcionario;

public class CSVUtils {

	public static void criaOrdenandoSalario(Path arquivo) {
		
		
		List<Funcionario> funcionarios = leCsv(arquivo);
		
		Collections.sort(funcionarios, (f1,f2) -> (int) Math.signum((f2.getSalario() - f1.getSalario())));
		
		criaCsv(funcionarios, "novosDados.csv");
	}
	
	private static List<Funcionario> leCsv(Path arquivo) {
		
		List<Funcionario> funcionarios = new ArrayList<>();
		
		try {
			List<String> linhas = Files.readAllLines(arquivo);
			
			linhas.remove(0);//remover o cabecalho do csv
			linhas.forEach((linha) -> {
				String[] linhaQuebrada = linha.split(",");
				
				Funcionario f = new Funcionario(
						 Integer.parseInt(linhaQuebrada[0]),
						 linhaQuebrada[1],
						 Double.parseDouble(linhaQuebrada[4]),
						 Integer.parseInt(linhaQuebrada[3]),
						 Integer.parseInt(linhaQuebrada[6]));
				
				funcionarios.add(f);
			});
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return funcionarios;
		
	}
	
	private static void criaCsv(List<Funcionario> funcionarios, String nomeArquivo) {
		
		String headerFinal = "Id,Est.civil,Filhos,Salario,Meses\n";
		
		Path arquivoFinal = Paths.get(nomeArquivo);
		
		try {
			Files.writeString(arquivoFinal, headerFinal);
			
			StringBuilder builder = new StringBuilder();
			
			funcionarios.stream().filter(f -> f.getNumFilhos()==0).forEach((func) -> {
				builder.append(func.getId()).append(",")
				.append(func.getEstCivil()).append(",")
				.append(func.getNumFilhos()).append(",")
				.append(func.getMesesTrabalho()).append(",")
				.append(func.getSalario()).append("\n");
			});
			
			Files.writeString(arquivoFinal, builder, StandardOpenOption.APPEND);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
}