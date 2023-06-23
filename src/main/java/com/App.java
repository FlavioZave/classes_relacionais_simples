package com;

import java.util.Scanner;

import com.controller.SobrenomeController;
import com.model.Nome;
import com.model.Sobrenome;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        boolean cont = true;
        Scanner entrada = new Scanner(System.in);

        /* Passando nome e sobrenome diretamente */
        SobrenomeController.salvar(new Sobrenome(new Nome("Gaby") ,"Agatha"));

        while(cont){
            System.out.println("-- Cadastrando nomes ---");

            /* Passando nome e sobrenome atraves do teclado */
            System.out.println("Envie somente Nome e em seguida o Sobrenome:");
            SobrenomeController.salvar(new Sobrenome(new Nome(entrada.nextLine()), entrada.nextLine()));

            System.out.println("1. Para salvar main um nome ou 0 para encerrar:");
            int opc = entrada.nextInt();
            entrada.nextLine();
            if(opc == 0) {
                cont = false;
            }
        }
        entrada.close();
    }
}
