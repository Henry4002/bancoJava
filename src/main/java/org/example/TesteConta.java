package org.example;

import org.example.ContaCorente;
import org.example.ContaPoupanca;

public class TesteConta {
    public static void main(String[] args) {
        ContaPoupanca conta1 = new ContaPoupanca("Priscila", 1000);
        System.out.println("Dados da conta poupança: \nTitular: "+conta1.getTitular() + "\nSaldo: " + conta1.getSaldo());
        System.out.println(conta1.consultaSaldo());


        ContaCorente cont2 = new ContaCorente("Lorrany", 1001);
        System.out.println("Dados da conta corrente: \nTitular: "+cont2.getTitular() + "\nSaldo: " + cont2.getSaldo());
        System.out.println(cont2.consultaSaldo());
        System.out.println(cont2.realizaSaque(200));




        System.out.println(conta1.realizaDeposito(5000));




    }
}
