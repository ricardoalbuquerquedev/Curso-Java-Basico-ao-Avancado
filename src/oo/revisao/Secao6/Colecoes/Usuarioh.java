package oo.revisao.Secao6.Colecoes;

import java.util.Objects;

public class Usuarioh {
    String nome;
    Usuarioh (String nome){     // construtor
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Meu nome é:" + nome + "!";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuarioh usuarioh = (Usuarioh) o;
        return nome.equals(usuarioh.nome);
    }

   @Override
   public int hashCode() {
        return Objects.hash(nome);
    }
}
