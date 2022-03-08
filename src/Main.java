import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Boas-vindas ao Bootcamp GFT Start #4 Java");
        curso1.setDescricao("descrição curso boas vindas");
        curso1.setCargaHoraria(1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Lógica de Programação Essencial");
        curso2.setDescricao("descrição curso 2 java");
        curso2.setCargaHoraria(4);

        Curso curso3 = new Curso();
        curso3.setTitulo("Aprenda Estrutura de Dados e Algoritmos");
        curso3.setDescricao("descrição curso 3 java");
        curso3.setCargaHoraria(2);


        Curso curso4 = new Curso();
        curso4.setTitulo("Introdução ao Git e GitHub");
        curso4.setDescricao("descrição curso 4 java");
        curso4.setCargaHoraria(5);

        DesafioDeProjeto desafioProj1 = new DesafioDeProjeto();
        desafioProj1.setTitulo("Criando seu primeiro Repositório no GitHub");
        desafioProj1.setDescricao("descrição desafio projeto 1");
        desafioProj1.setDificuldadeProjeto(1);

        Curso curso5 = new Curso();
        curso5.setTitulo("Introdução ao Ecossistema e Documentação Java");
        curso5.setDescricao("descrição curso 5 java");
        curso5.setCargaHoraria(2);

        Curso curso6 = new Curso();
        curso6.setTitulo("Dominando IDEs Java");
        curso6.setDescricao("descrição curso 6 java");
        curso6.setCargaHoraria(4);

        Curso curso7 = new Curso();
        curso7.setTitulo("Variáveis, Tipos de Dados e Operadores Matemáticos em Java");
        curso7.setDescricao("descrição curso 7 java");
        curso7.setCargaHoraria(2);

        Curso curso8 = new Curso();
        curso8.setTitulo("Entendendo Métodos Java");
        curso8.setDescricao("descrição curso 8 java");
        curso8.setCargaHoraria(2);

        Curso curso9 = new Curso();
        curso9.setTitulo("Lógica Condicional e Controle de Fluxos em Java");
        curso9.setDescricao("descrição curso 9 java");
        curso9.setCargaHoraria(1);

        Curso curso10 = new Curso();
        curso10.setTitulo("Estruturas de Repetição e Arrays em Java");
        curso10.setDescricao("descrição curso 10 java");
        curso10.setCargaHoraria(3);

        DesafioDeCodigo desafioCodigo1 = new DesafioDeCodigo();
        desafioCodigo1.setTitulo("Desafios Iniciais - GFT Start #4 Java");
        desafioCodigo1.setDescricao("descrição desafio");
        desafioCodigo1.setQuantidadeDesafios(3);

        Curso curso11 = new Curso();
        curso11.setTitulo("Programação Orientada a Objetos");
        curso11.setDescricao("descrição curso 11 java");
        curso11.setCargaHoraria(4);

        DesafioDeCodigo desafioCodigo2 = new DesafioDeCodigo();
        desafioCodigo2.setTitulo("Desafios Básicos - GFT Start #4 Java");
        desafioCodigo2.setDescricao("descrição desafio 2");
        desafioCodigo2.setQuantidadeDesafios(3);

        DesafioDeProjeto desafioProj2 = new DesafioDeProjeto();
        desafioProj2.setTitulo("Crianco um Banco Digital com Java e Orientação a Objetos");
        desafioProj2.setDescricao("descrição desafio projeto 2");
        desafioProj2.setDificuldadeProjeto(2);


        Curso curso12 = new Curso();
        curso12.setTitulo("Debugging Java");
        curso12.setDescricao("descrição curso 12 java");
        curso12.setCargaHoraria(1);

        Curso curso13 = new Curso();
        curso13.setTitulo("Tratamento de Exceções em Java");
        curso13.setDescricao("descrição curso 13 java");
        curso13.setCargaHoraria(2);

        Curso curso14 = new Curso();
        curso14.setTitulo("Trabalhando com Collections Java");
        curso14.setDescricao("descrição curso 12 java");
        curso14.setCargaHoraria(6);

        Curso curso15 = new Curso();
        curso15.setTitulo("Introdução ao HTTP/HTTPS");
        curso15.setDescricao("descrição curso 15 java");
        curso15.setCargaHoraria(3);

        Curso curso16 = new Curso();
        curso16.setTitulo("Simplificando Projetos Java com o Spring Boot");
        curso16.setDescricao("descrição curso 16 java");
        curso16.setCargaHoraria(3);

        DesafioDeCodigo desafioCodigo3 = new DesafioDeCodigo();
        desafioCodigo3.setTitulo("Desafios - GFT Start #4 Java");
        desafioCodigo3.setDescricao("descrição desafio de código");
        desafioCodigo3.setQuantidadeDesafios(3);

        DesafioDeProjeto desafioProj3 = new DesafioDeProjeto();
        desafioProj3.setTitulo("Abstraindo um Bootcamp Usando a Orientação a Objetos em Java");
        desafioProj3.setDescricao("descrição do desafio");
        desafioProj3.setDificuldadeProjeto(2);

        DesafioDeCodigo desafioCodigo4 = new DesafioDeCodigo();
        desafioCodigo4.setTitulo("Desafios Intermediários - GFT Start #4 Java");
        desafioCodigo4.setDescricao("descrição desafio de código");
        desafioCodigo4.setQuantidadeDesafios(3);

        DesafioDeProjeto desafioProj4 = new DesafioDeProjeto();
        desafioProj4.setTitulo("Explorando Padrões de Projetos na Prática com Java");
        desafioProj4.setDescricao("descrição do desafio");
        desafioProj4.setDificuldadeProjeto(2);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria 1 ");
        mentoria1.setDescricao("descrição da mentoria 1");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcampGftStartJava4 = new Bootcamp();
        bootcampGftStartJava4.setNome("GFT Start #4 Java");
        bootcampGftStartJava4.setDescricao("Hey Dev, já considerou a possibilidade de se tornar ainda mais potente para o mercado, " +
                "se especializando na tecnologia de desenvolvimento mais utilizada no mundo? " +
                "Se sim, este é o seu momento de brilhar! O Bootcamp GFT Start #4 Java foi pensado exclusivamente para o " +
                "seu desenvolvimento na tecnologia de Java, contendo uma sequência completa de cursos, mentorias e desafios. Não perca essa chance e inscreva-se já!");
        bootcampGftStartJava4.getConteudos().add(curso1);
        bootcampGftStartJava4.getConteudos().add(curso2);
        bootcampGftStartJava4.getConteudos().add(curso3);
        bootcampGftStartJava4.getConteudos().add(curso4);
        bootcampGftStartJava4.getConteudos().add(desafioProj1);
        bootcampGftStartJava4.getConteudos().add(curso5);
        bootcampGftStartJava4.getConteudos().add(curso6);
        bootcampGftStartJava4.getConteudos().add(curso7);
        bootcampGftStartJava4.getConteudos().add(curso8);
        bootcampGftStartJava4.getConteudos().add(curso9);
        bootcampGftStartJava4.getConteudos().add(curso10);
        bootcampGftStartJava4.getConteudos().add(desafioCodigo1);
        bootcampGftStartJava4.getConteudos().add(curso11);
        bootcampGftStartJava4.getConteudos().add(desafioCodigo2);
        bootcampGftStartJava4.getConteudos().add(desafioProj2);
        bootcampGftStartJava4.getConteudos().add(curso12);
        bootcampGftStartJava4.getConteudos().add(curso13);
        bootcampGftStartJava4.getConteudos().add(curso14);
        bootcampGftStartJava4.getConteudos().add(desafioCodigo3);
        bootcampGftStartJava4.getConteudos().add(desafioProj3);
        bootcampGftStartJava4.getConteudos().add(curso15);
        bootcampGftStartJava4.getConteudos().add(curso16);
        bootcampGftStartJava4.getConteudos().add(desafioCodigo4);
        bootcampGftStartJava4.getConteudos().add(desafioProj4);
        bootcampGftStartJava4.getConteudos().add(mentoria1);

        Dev devLuiz = new Dev();
        devLuiz.setNome("Luiz");
        devLuiz.inscreverBootcamp(bootcampGftStartJava4);

        devLuiz.progredir();
        devLuiz.progredir();
        devLuiz.progredir();
        devLuiz.progredir();
        devLuiz.progredir();
        devLuiz.progredir();
        devLuiz.progredir();
        devLuiz.progredir();
        devLuiz.progredir();
        devLuiz.progredir();
        devLuiz.progredir();
        devLuiz.progredir();
        devLuiz.progredir();
        devLuiz.progredir();
        devLuiz.progredir();
        devLuiz.progredir();
        devLuiz.progredir();
        devLuiz.progredir();
        devLuiz.progredir();
        devLuiz.progredir();

        System.out.println(bootcampGftStartJava4);
        System.out.println("Cursos concluídos por Luiz\n"+devLuiz.getConteudosConcluidos());
        System.out.println("Cursos a fazer por Luiz\n"+devLuiz.getConteudosInscritos());
        System.out.println("Total de experiência adquirido por Luiz\n"+devLuiz.calcularTotalXp());


    }
}
