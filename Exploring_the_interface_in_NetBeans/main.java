    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeSala;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author scalabrini
 */
public class main {
    public static void main(String[] args) {
        
        try{
            File arquivo = new File("/home/scalabrini/NetBeansProjects/mavenproject2/src/main/java/atividadeSala/dados.txt");
            
            if(arquivo.createNewFile()){
                System.out.printf(" Arquivo criado %s", arquivo.getName());
            }else{
                System.out.printf(" O arquivo já existe ");
            }
    
        }catch(IOException e){
            System.out.printf(" Erro ao criar arquivo Erro: %s ", e.getMessage());
        }
    }
}
