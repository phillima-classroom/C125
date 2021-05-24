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

	public static void geraNovoCsvSemFilhos(Path arquivo) {
		
		List<Funcionario> funcionarios = leCsv(arquivo);
		
		criaCsv(funcionarios, "func_filtrado.csv");
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
						 Double.parseDouble(linhaQuebrada[4]),
						 Integer.parseInt(linhaQuebrada[3]));
				funcionarios.add(f);
			});
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return funcionarios;
		
	}
	
	private static void criaCsv(List<Funcionario> funcionarios, String nomeArquivo) {
		
		String headerFinal = "Id,Filhos,Salario\n";
		
		Path arquivoFinal = Paths.get(nomeArquivo);
		
		try {
			Files.writeString(arquivoFinal, headerFinal);
			
			StringBuilder builder = new StringBuilder();
			
			funcionarios.stream().filter(f -> f.getNumFilhos()>0).forEach((func) -> {
				builder.append(func.getId()).append(",")
				.append(func.getNumFilhos()).append(",")
				.append(func.getSalario()).append("\n");
			});
			
			Files.writeString(arquivoFinal, builder, StandardOpenOption.APPEND);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
}