package cadastro;

import java.util.List;

public class Pessoa {
    String nome;
    Integer cpf;
    Integer celular;
    List sms;

    public Pessoa(String nome, Integer cpf, Integer celular, List sms) {
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
        this.sms = sms;
    }
}
