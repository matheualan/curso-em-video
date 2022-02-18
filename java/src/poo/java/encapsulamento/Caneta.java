package poo.java.encapsulamento;

public class Caneta {

    public String modelo;
    public String cor;
    private double ponta;
    protected int carga;
    protected boolean tampada;

    public Caneta(String m, String co, double p, int ca, boolean t) {
        this.setModelo(m);
        this.setCor(co);
        this.setPonta(p);
        this.setCarga(ca);
        this.tampada = t;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String co) {
        this.cor = co;
    }

    public double getPonta() {
        return ponta;
    }

    public void setPonta(double p) {
        this.ponta = p;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int ca) {
        this.carga = ca;
    }

    public boolean getTampar() {
        return tampada == true;
    }
    public void setTampar(boolean t) {
        this.tampada = t;
    }
    public boolean getDestampar() {
        return tampada == false;
    }
    public void setDestampar(boolean t) {
        this.tampada = t;
    }

    public void status () {
        System.out.println("Modelo da caneta: " + this.getModelo());
        System.out.println("Cor da caneta: " + this.getCor());
        System.out.println("Calibre da ponta: " + this.getPonta());
        System.out.println("Carga da caneta: " + this.getCarga());
        System.out.println("Caneta tampada? " + this.tampada);
    }
    protected void riscar () {
        if (this.tampada == true) {
            System.out.println("ERROR: CANETA TAMPADA");
        } else {
            System.out.println("ESCREVENDO TUDO E MAIS UM POUCO");
        }
    }
}
