package poo.java.projeto;

public class Video implements AcoesVideo {
    private String titulo;
    private int views, curtidas, avaliacao;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }
    public int getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
    public int getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int) (this.avaliacao + avaliacao) / this.views;
        this.avaliacao = avaliacao;
    }
    public boolean isReproduzindo() {
        return reproduzindo;
    }
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play() {
        this.reproduzindo = true;
    }
    @Override
    public void pause() {
        this.reproduzindo = false;
    }
    @Override
    public void like() {
        this.curtidas ++;
    }
    @Override
    public String toString() {
        return "\nVideo [" +
                "Titulo: " + titulo +
                " / Views: " + views +
                " / Curtidas: " + curtidas +
                " / Avaliacao: " + avaliacao +
                " / Reproduzindo: " + reproduzindo +
                ']';
    }
}
