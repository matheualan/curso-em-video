/* INFORMACOES IMPORTANTES
* Todo metodo getters e setters sao publicos
* Metodo com retorno nao pode ser void, tem que usar o nome do tipo ou da classe
* Geralmente os Getters não recebem parametros e os Setters recebem parametros
*/

package poo.java.encapsulamento;

public class Bombinha {

    private String marca;
    private String funcao;
    private double carga;
    private boolean tampado;

    public Bombinha(String m, String f, double c) { //Metodo Construtor = Mesmo nome da Classe
        this.tampar();
        this.setMarca(m);
        this.setFuncao(f);
        this.setCarga(c);
    }
    public String getMarca() {

        return this.marca;
    }
    public void setMarca(String m) {

        this.marca = m;
    }
    public String getFuncao() {

        return this.funcao;
    }
    public void setFuncao(String f) {

        funcao = f;
    }
    public double getCarga() {

        return this.carga;
    }
    public void setCarga(double c) {

        this.carga = c;
    }
    public void tampar() {

        this.tampado = true;
    }
    public void destampar() {

        this.tampado = false;
    }
    public void status() {
        System.out.println("Marca da bombinha: " + this.getMarca());
        System.out.println("Carga da bombinha: " + this.getCarga());
        System.out.println("Funcao da bombinha: " + this.getFuncao());
        System.out.println("Tampada ou destampada? " + this.tampado);
    }
}
