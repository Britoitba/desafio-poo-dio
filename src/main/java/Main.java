import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Francisco");
        dev1.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos Inscritos para " + dev1.getNome() + ": \n" + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("\nConteudos Inscritos para " + dev1.getNome() + ": \n" + dev1.getConteudosInscritos());
        System.out.println("\nConteudos Concluidos por " + dev1.getNome() + ": \n" + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());

        System.out.println(" \n--------------------- ");

        Dev dev2 = new Dev();
        dev2.setNome("João");
        dev2.inscreverBootcamp(bootcamp1);
        System.out.println("\nConteudos Inscritos para " + dev2.getNome() + ": \n" + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("\nConteudos Inscritos para " + dev2.getNome() + ": \n" + dev2.getConteudosInscritos());
        System.out.println("\nConteudos Concluidos por " + dev2.getNome() + ": \n" + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());





    }
}
