package br.com.Notas.Henrique;

import java.util.ArrayList;
import java.util.List;

public class ListaDeNotas {
    private List<Notas> notas;

    public ListaDeNotas(List<Notas> notas) {
        this.notas = notas;
    }

    public ListaDeNotas() {
        this.notas = new ArrayList<>(); // Inicializa a lista aqui
    }

    public void adicionarNota(Notas nota) {
        this.notas.add(nota);
    }
    public List<Notas> ListaDeNotas(){
        return notas;
    }
    public void alterarNotas(int x, String novoTitulo, String novaDescricao){
            Notas nota = notas.get(x);
            nota.setTitulo(novoTitulo);
            nota.setDescricao(novaDescricao);
    }
    public void excluirNotas(int x){
        if(x > 0 && x <notas.size()){
           notas.remove(x);
        }
    }

    public void percorrerNotas(){
        for(int i = 0; i < notas.size(); i++) {
            System.out.println((i + 1) + "- " + notas.get(i).getTitulo());
        }
    }

    public void exibirNotas(int x){
        System.out.println( "Titulo: " + notas.get(x).getTitulo());
        System.out.println( "Descricao: " + notas.get(x).getDescricao());
    }
}
