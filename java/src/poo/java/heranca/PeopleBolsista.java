package poo.java.heranca;

public class PeopleBolsista extends PeopleAluno{
    private float bolsa;

    public void RenovarBolsa() {
        System.out.println("Renovando bolsa de " + this.nome);
    }

    @Override
    public void pagarMensal() {
        System.out.println(this.nome + " eh bolsita! Pagamento facilitado.");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
