package cadastroEsse;

import java.util.List;

public class Pessoa {
    String nome;
    Integer cpf;
    Integer telefone;
   private List<String> listaSms;

    public Pessoa(String nome, Integer cpf, Integer celular, List sms) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.listaSms = listaSms;
    }

    @Override
    public String toString() {
        return "Nome:" + nome + "| CPF:" + cpf;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public List<String> getListaSms() {
        return listaSms;
    }

    public void setListaSms(List<String> listaSms) {
        this.listaSms = listaSms;
    }

    public Integer getCpf() {
        return cpf;
    }
}
