package Fundamentoss;

import java.util.Objects;

public class OlhaSo {

    String cor;
    String roupa;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OlhaSo olhaSo = (OlhaSo) o;
        return Objects.equals(cor, olhaSo.cor) &&
                Objects.equals(roupa, olhaSo.roupa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cor, roupa);
    }
}
