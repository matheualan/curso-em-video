package poo.java.projeto;

public abstract class Pessoa {
    protected String nome, sexo;
    protected int idade;
    protected float exp;

    public Pessoa(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.exp = 0;
    }

    protected void ganharExp() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getExp() {
        return exp;
    }

    public void setExp(float exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return  "Nome: " + nome + " / Sexo: " + sexo + " / Idade: " + idade + " / Exp: " + exp + "] ";
    }
}
