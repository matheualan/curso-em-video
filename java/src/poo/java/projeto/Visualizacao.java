package poo.java.projeto;

/*
* Relação de agregação quando se cria atributos com o tipo de outra Classe para que se possa herdar sem instanciar objeto
* criando assim uma relação por meio de agregação.
*
 */

public class Visualizacao {
    private Telespectador espectador;
    private Video filme;

    public Visualizacao(Telespectador espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() +1);
        this.filme.setViews(this.filme.getViews() +1);
    }
    //Sobrecarga
    public void avaliar() {
        this.filme.setAvaliacao(5);
    }
    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
    }
    public void avaliar(float porcAssist) {
        int tot = 0;
        if (porcAssist <= 20) {
            tot = 3;
        } else if (porcAssist <= 50) {
            tot = 5;
        } else if (porcAssist <= 90) {
            tot = 8;
        } else {
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }

    public Telespectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Telespectador espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao [" + espectador + filme;
    }
}
