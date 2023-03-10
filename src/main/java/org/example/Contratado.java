package org.example;

public class Contratado extends Funcionario {
    @Override
    public void calcularSalario() {
        System.out.println("Salário do contratado - Salário Fixo");
    }
}
