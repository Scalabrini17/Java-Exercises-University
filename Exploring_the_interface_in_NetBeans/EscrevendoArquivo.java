/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author scalabrini
 */
public class EscrevendoArquivo {
    public static void main(String[] args) {
        
            String caminho = "/home/scalabrini/NetBeansProjects/mavenproject2/dados.txt";
            String texto1 = "Hello World!";
            String texto2 = "Java é Ótimo!";
            
        try (FileWriter escritor = new FileWriter(caminho, true)) {
            
            escritor.write(texto1 + System.lineSeparator());
            escritor.write(texto2 + System.lineSeparator());
            System.out.println("Texto Gravado com Sucesso!");
    
        }catch(IOException e){
            System.out.printf(" Erro ao criar arquivo Erro: %s ", e.getMessage());
        }
    }
}
