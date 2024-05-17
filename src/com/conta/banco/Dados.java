package com.conta.banco;

import java.util.Scanner;

public class Dados {

    Scanner d = new Scanner(System.in);
    Conta user =new Conta();

    private int dados_inteiros;
    private String dados_string;
    private String nome_cliente;

    public void recebeDados(){

        System.out.println("Digite  o número da conta: ");
        dados_inteiros = d.nextInt();
        user.setNumero(dados_inteiros);


        System.out.println("Digite  o número da agência: ");
        dados_string = d.next();
        user.setAgencia(dados_string);

        System.out.println("Digite  o nome do cliente: ");
        nome_cliente = d.next();
        user.setNomeCliente(nome_cliente);


    }


    public double saldoCliente(){
        user.setSaldo(1000);
        return user.getSaldo();
    }



    public void printUser(){
        System.out.println("==============================");
        System.out.println("Obrigado " + user.getNomeCliente()
                + ", por abrir sua conta no nosso Banco BCC!" + "\n"
                +  "Conta número: "  + user.getNumero() +"\n"
                +  "Agência número: "  + user.getAgencia() + "\n"
                +  "Cliente: "  + user.getNomeCliente() + "\n"
                +   "Saldo liberado: " + saldoCliente() );
        System.out.println("==============================");

    }

}
