package consultorioDental;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filtragem {
    public static void main(String[] args) {

        Paciente p1= new Paciente("Ana",17, "Unidentes");
        Paciente p2= new Paciente("Bianca",21, "Sorriso");
        Paciente p3= new Paciente("Otavio",33, "Unidental");
        Paciente p4= new Paciente("Carla",25, "Unidentes");
        Paciente p5= new Paciente("Pedro",07, "Sorriso");
        Paciente p6= new Paciente("Fabia",30, "Unidental");
        Paciente p7= new Paciente("Paula",10, "Sorriso");
        Paciente p8= new Paciente("Luke",15, "Sorriso");

        List<Paciente> pacientes= Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8);
        Predicate<Paciente> plano = paciente -> paciente.idade>20;
        Predicate<Paciente> planoDental = paciente -> paciente.planoDeSaude != "Unidentes";
        Function<Paciente,String> recepcionandoPaciente = paciente -> "Olá " + paciente.nome +
                "Seu plano dental é "+ paciente.planoDeSaude;

        pacientes.stream()
                .filter(planoDental)
                .filter(plano)
                .map(recepcionandoPaciente)
                .forEach(System.out::println);
    }
}
