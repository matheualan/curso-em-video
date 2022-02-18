package poo.java.encapsulamento;

public class Isqueiro {

    private String modelo;
    private String cor;
    private int carga;
    private boolean aceso;

    public Isqueiro(String m, String c, int ca, boolean a) {
        this.setModelo(m);
        this.setCor(c);
        this.setCarga(ca);
        this.setAceso(a);
    }

    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String m) {
        this.modelo = m;
    }
    public String getCor() {
        return this.cor;
    }
    public void setCor(String c) {
        this.cor = c;
    }
    public int getCarga() {
        return this.carga;
    }
    public void setCarga(int ca) {
        this.carga = ca;
    }
    public boolean getAceso() {
        return this.aceso;
    }
    public void setAceso(boolean a) {
        this.aceso = a;
    }

    void acender() {
        this.aceso = true;
        System.out.println("Isqueiro aceso !!!\nFogo na Babilônia !!!!\nCatch a Fire !!!");
    }
    void apagar() {
        this.aceso = false;
        System.out.println("Isqueiro apagado !!!");
    }

    public String acenderBaseado() {
        return "baseado aceso acesao queimando tudo";
    }
}
