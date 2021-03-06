package aula07.leitorTexto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeitorTexto {
    public static void main(String[] args) throws IOException {
        String pastaDoProjeto = System.getProperty("user.dir"); // pega o caminho da pasta do projeto
        File file = new File(pastaDoProjeto + "\\src\\aula06\\leitorTexto\\arquivo.txt");

        try {
            FileInputStream stream =  new FileInputStream(file);
            InputStreamReader streamReader = new InputStreamReader(stream);
            BufferedReader reader = new BufferedReader(streamReader);

            String linha = "";

            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }

            stream.close();
            streamReader.close();
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("O arquivo não encontrado!");
        }
    }
}