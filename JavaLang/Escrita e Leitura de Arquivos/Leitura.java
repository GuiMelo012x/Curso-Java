package escrita_e_leitura_de_arquivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new FileInputStream("aula88_leitura.txt"));
            while (sc.hasNextLine()) {
                String linha = sc.nextLine();
                System.out.println(linha);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
        }

    }
}
