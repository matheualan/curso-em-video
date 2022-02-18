package poo.java.heranca;

public class Pessoa {

    private String nome, sexo;
    int idade;

    public void fazerAniv() {
        this.idade++;
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

    @Override
    public String toString() {
        return "Pessoa [Nome = " + nome + " / Sexo = "
                + sexo + " / Idade = " + idade + "]";
    }
}
