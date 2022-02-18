package poo.java.encapsulamento;

public interface Publicacao {

    String detalhes();

    public abstract void abrir();
    public abstract void fechar();
    public abstract void folhear(int pag);
    public abstract void avancarPag();
    public abstract void voltarPag();
}
