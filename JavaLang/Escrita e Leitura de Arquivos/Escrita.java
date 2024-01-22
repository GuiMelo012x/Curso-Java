package escrita_e_leitura_de_arquivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Escrita {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            PrintStream escrever = new PrintStream(new FileOutputStream("aula88_leitura_e_escrita.txt", true));
            // é uma função com uma exceção do tipo IO, então tem que tratar
            for (int i = 0; i < 5; i++) {
                System.out.println("Escreva algo: ");
                String msg = sc.nextLine();
                escrever.println(msg);
            }
            escrever.close();
        }catch (FileNotFoundException e){
            System.out.println("Não foi possível criar o arquivo");
        }

        sc.close();
    }
}
