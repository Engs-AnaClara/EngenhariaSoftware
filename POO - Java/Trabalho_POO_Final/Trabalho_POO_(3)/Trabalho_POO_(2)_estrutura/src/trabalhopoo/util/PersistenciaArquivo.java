package trabalhopoo.util;

import java.io.*;
import java.util.List;

public class PersistenciaArquivo {

    public static void salvarEmArquivo(String nomeArquivo, List<String> linhas) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (String linha : linhas) {
                writer.write(linha);
                writer.newLine();
            }
            System.out.println("Arquivo salvo com sucesso: " + nomeArquivo);
        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo: " + e.getMessage());
        }
    }

    public static void lerArquivo(String nomeArquivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            System.out.println("\nConteúdo de " + nomeArquivo + ":");
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }
    }
}
