import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso 2 java");
        curso2.setDescricao("descrição curso 2 java");
        curso2.setCargaHoraria(8);



        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria 1 ");
        mentoria1.setDescricao("descrição da mentoria 1");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devLuiz = new Dev();
        devLuiz.setNome("Luiz");
        devLuiz.inscreverBootcamp(bootcamp);

        Dev devMiguel = new Dev();
        devMiguel.setNome("Miguel");
        devMiguel.inscreverBootcamp(bootcamp);


        System.out.println("Conteudos inscritos Luiz" +devLuiz.getConteudosInscritos());
        System.out.println("Conteudos concluidos Luiz" +devLuiz.getConteudosConcluidos());

        System.out.println("Conteudos inscritos Miguel" + devMiguel.getConteudosInscritos());
        System.out.println("Conteudos concluidos Miguel" + devMiguel.getConteudosConcluidos());

        System.out.println("=========Progresso==========");
        devLuiz.progredir();
        devMiguel.progredir();

        System.out.println("Conteudos inscritos Luiz" +devLuiz.getConteudosInscritos());
        System.out.println("Conteudos concluidos Luiz" +devLuiz.getConteudosConcluidos());
        System.out.println("Xp "+devLuiz.calcularTotalXp());

        System.out.println("Conteudos inscritos Miguel" + devMiguel.getConteudosInscritos());
        System.out.println("Conteudos concluidos Miguel" + devMiguel.getConteudosConcluidos());

        System.out.println("Xp: " + devMiguel.calcularTotalXp());

        devLuiz.progredir();
        devLuiz.progredir();
        System.out.println("=========Progresso==========");

        System.out.println("Conteudos inscritos Luiz" +devLuiz.getConteudosInscritos());
        System.out.println("Conteudos concluidos Luiz" +devLuiz.getConteudosConcluidos());
        System.out.println("Xp "+devLuiz.calcularTotalXp());








    }
}
