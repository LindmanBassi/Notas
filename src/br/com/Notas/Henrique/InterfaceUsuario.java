package br.com.Notas.Henrique;

import java.util.Scanner;
import java.util.ArrayList;

public class InterfaceUsuario {
    private Scanner ler;
    private ListaDeNotas listaDeNotas;

    public InterfaceUsuario(ListaDeNotas listaDeNotas) {
        this.listaDeNotas = listaDeNotas;
        ler = new Scanner(System.in);
    }

    public void menu(){
        System.out.println("1 = Mostrar Notas");
        System.out.println("2 = Adicionar Nota");
        System.out.println("3 = Excluir Nota");
        System.out.println("4 = Editar Nota");
        System.out.println("5 = Exibir Nota");
        System.out.println("6 = Sair");
    }

    public int escolherOpcao(){
        System.out.print("Escolha uma opção: ");
        return ler.nextInt();
    }

    public int escolherNota(){
        System.out.print("Escolha uma nota: ");
        return ler.nextInt() - 1;
    }

    public Notas criarNota() {
        ler.nextLine();
        System.out.print("Título: ");
        String titulo = ler.nextLine();
        System.out.print("Descrição: ");
        String descricao = ler.nextLine();
        Notas nota = new Notas(titulo, descricao);
        return nota;
    }

    public void sairMenu() {
        ler.close();
    }
    public void percorrerNotas(){
        listaDeNotas.percorrerNotas();
    }

    public void excluirNota() {
        int indice = escolherNota();
        listaDeNotas.excluirNotas(indice);
    }

    public void atualizarNotas() {
        int nota = escolherNota();
        ler.nextLine();

        System.out.print("Insira o novo título da nota: ");
        String titulo = ler.nextLine();

        System.out.print("Insira a nova descrição da nota: ");
        String descricao = ler.nextLine();

        listaDeNotas.alterarNotas(nota, titulo, descricao);
    }
    public void exibirNota(){
        int nota = escolherNota();
        ler.nextLine();
        listaDeNotas.exibirNotas(nota);
    }

}