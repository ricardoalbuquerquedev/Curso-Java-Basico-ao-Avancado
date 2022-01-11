package voltandoAoComeco.Secao6;

import java.util.Objects;

public class Uusuario {

    String nome;
    String email;

    public boolean equals(Object objeto) {
        if (objeto instanceof Uusuario) {
            Uusuario outro = (Uusuario) objeto;
            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);
            return nomeIgual && emailIgual;
        } else {
            return false;
        }
    }

}