package br.com.Notas.Henrique;

public class Notas{

    private String titulo;
    private String descricao;

   public Notas(String titulo, String descricao){
       this.titulo = titulo;
       this.descricao = descricao;
   }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTitulo() {

        return this.titulo;

    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
