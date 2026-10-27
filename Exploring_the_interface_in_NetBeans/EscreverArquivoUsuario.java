    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeSala;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author scalabrini
 */
public class EscreverArquivoUsuario {
    public static void main(String[] args) {
        String caminho = "/home/scalabrini/NetBeansProjects/mavenproject2/src/main/java/atividadeSala/dados.txt";
            
        try (Scanner leitor = new Scanner (new File(caminho))) {
            
           while (leitor.hasNextLine()) {
               String linha = leitor.nextLine();
               System.out.println(linha);
           }
    
        }catch(FileNotFoundException e){
            System.out.printf(" Arquivo não encontrado Erro: %s ", e.getMessage());
        }
    }
}
